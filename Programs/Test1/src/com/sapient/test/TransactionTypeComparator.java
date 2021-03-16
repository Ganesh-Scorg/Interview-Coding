package com.sapient.test;

import java.util.Comparator;

/**
 * Used to comapre {@link TransactionAttribute} transaction_type
 * @author patilde
 *
 */
public class TransactionTypeComparator implements Comparator<TransactionAttribute> {

	@Override
	public int compare(TransactionAttribute transactionAttribute, TransactionAttribute transactionAttribute2) {
		return transactionAttribute.getTransaction_type().compareTo(transactionAttribute2.getTransaction_type());
	}
}