package com.sapient.test;

import java.util.Comparator;

/**
 * Used to compare {@link TransactionAttribute} priority
 * @author patilde
 *
 */
public class TransactionPriorityComparator implements Comparator<TransactionAttribute> {

	@Override
	public int compare(TransactionAttribute transactionAttribute, TransactionAttribute transactionAttribute2) {
		return transactionAttribute.getPriority().compareTo(transactionAttribute2.getPriority());
	}
}