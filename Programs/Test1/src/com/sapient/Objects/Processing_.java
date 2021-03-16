/*package com.sapient.Objects;

import java.util.List;

public class Processing_ {

	public static int processTransactionFee(List<TransactionAttribute_> attributes) {
		for (int i = 1; i < attributes.size(); i++) {
			TransactionAttribute_ attribute = attributes.get(i);
			for (int j = i + 1; j < attributes.size(); j++) {
				TransactionAttribute_ attribute2 = attributes.get(j);

				if (attribute.client_id.equals(attribute2.client_id)
						&& attribute.security_id.equals(attribute2.security_id)
						&& attribute.transaction_date.equals(attribute2.transaction_date)
						&& checkTransactionType(attribute, attribute2)) {
					System.out.println(attribute.client_id + "       " + attribute.security_id + "   "
							+ attribute.transaction_type + "   " + "$10");
					break;

				}

				else if (attribute.priority_flag.equals("N") && (attribute.transaction_type.equals("SELL")
						|| attribute.transaction_type.equals("WITHDRAW"))) {
					System.out.println(attribute.client_id + "       " + attribute.security_id + "   "
							+ attribute.transaction_type + "   " + "$100" + "   " + attribute.transaction_date);
					break;
				} else if (attribute.priority_flag.equals("N") && attribute.transaction_type.equals("BUY")
						|| attribute.transaction_date.equals("DEPOSIT")) {
					System.out.println(attribute.client_id + "       " + attribute.security_id + "   "
							+ attribute.transaction_type + "   " + "$50" + "   " + attribute.transaction_date);
					break;
				} else if (attribute.priority_flag.equals("Y")) {
					System.out.println(attribute.client_id + "       " + attribute.security_id + "   "
							+ attribute.transaction_type + "   " + "$500" + "   " + attribute.transaction_date);
					break;
				}

			}

		}

		return 0;

	}

	public static boolean checkTransactionType(TransactionAttribute_ attribute, TransactionAttribute_ attribute2) {

		if ((attribute.transaction_type.equals("SELL") && attribute2.transaction_type.equals("BUY"))
				|| (attribute.transaction_type.equals("BUY") && attribute2.transaction_type.equals("SELL")))
			return true;

		return false;
	}

	public static void main(String[] args) {
		List<TransactionAttribute_> attributes = ReadExcelFile_.getTransactionFromExcel();

		processTransactionFee(attributes);
	}

}*/