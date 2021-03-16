package com.sapient.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionFeeCalculator {

	// Map contains all transactions read from excel.
	static Map<String, TransactionAttribute> transactionMap = new HashMap<>();

	public static void main(String args[]) {

		FileFactory factory = new FileFactory();
		File file = factory.getFileType("EXCEL");
		file.getTransactionFromFile();

		List<TransactionAttribute> values = new ArrayList<>(transactionMap.values());
		sortByValue(values);

	}

	/**
	 * Method used to sort values TransactionAttribute List by
	 * Client_Id,Transaction_type,Priority,Processing_Fee
	 * 
	 * @param transactionAtrributeList
	 *            {@link TransactionAttribute}
	 */
	public static void sortByValue(List<TransactionAttribute> transactionAtrributeList) {

		Collections.sort(transactionAtrributeList,
				new TransactionAttributeComparator(new TransactionClientIdComparator(), new TransactionTypeComparator(),
						new TransactionDateComparator(), new TransactionPriorityComparator()));

		System.out.println("Client ID" + "       " + "Transaction Type" + "       " + "Transaction Date" + "       "
				+ "Priority" + "       " + "Processing Fee");
		for (TransactionAttribute transactionAttribute : transactionAtrributeList) {
			System.out.println(
					transactionAttribute.getClient_id() + "       " + transactionAttribute.getTransaction_type()
							+ "       " + transactionAttribute.getTransaction_date() + "       "
							+ transactionAttribute.getPriority() + "       " + transactionAttribute.getProcessingFee());
		}

	}

	/**
	 * method use to calculate transaction processing fee.
	 * 
	 * @param transactionAttribute
	 *            {@link TransactionAttribute}
	 */
	static void calculateProcessingFee(TransactionAttribute transactionAttribute) {

		String key = transactionAttribute.client_id + transactionAttribute.security_id
				+ transactionAttribute.transaction_date + transactionAttribute.transaction_type;
		String originalKey = transactionAttribute.client_id + transactionAttribute.security_id
				+ transactionAttribute.transaction_date + "BUY";

		if (transactionAttribute.priority.equals("N")
				&& (transactionAttribute.transaction_type.equals("SELL")
						|| transactionAttribute.transaction_type.equals("WITHDRAW"))
				&& !transactionMap.containsKey(originalKey)) {
			transactionAttribute.setProcessingFee("$100");
			transactionMap.put(key, transactionAttribute);
		}

		else if (transactionAttribute.priority.equals("N") && transactionAttribute.transaction_type.equals("BUY")
				|| transactionAttribute.transaction_type.equals("DEPOSIT")) {
			transactionAttribute.setProcessingFee("$50");
			transactionMap.put(key, transactionAttribute);
		}

		else if (transactionAttribute.transaction_type.equals("SELL")) {

			if (transactionMap.containsKey(originalKey)) {
				TransactionAttribute temp = transactionMap.get(originalKey);
				temp.setProcessingFee("$10");
				transactionMap.put(originalKey, temp);
				transactionAttribute.setProcessingFee("$10");
				transactionMap.put(key, transactionAttribute);
			} else {
				transactionMap.put(key, transactionAttribute);
				transactionAttribute.setProcessingFee("$500");
			}
		} else if (transactionAttribute.priority.equals("Y")) {
			transactionAttribute.setProcessingFee("$500");
			transactionMap.put(key, transactionAttribute);
		}
	}
}