package com.sapient.test;

import java.util.Comparator;

/**
 * Used to comapre {@link TransactionAttribute} date
 * @author patilde
 *
 */
public class TransactionDateComparator implements Comparator<TransactionAttribute> {

	@Override
	public int compare(TransactionAttribute transactionAttribute, TransactionAttribute transactionAttribute2) {
		return transactionAttribute.getTransaction_date().compareTo(transactionAttribute2.getTransaction_date());
	}
}