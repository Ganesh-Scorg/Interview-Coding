package com.sapient.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Class used to construct a chained comparator.
 * 
 * @author patilde
 *
 */
public class TransactionAttributeComparator implements Comparator<TransactionAttribute> {

	private List<Comparator<TransactionAttribute>> listComparators;

	@SafeVarargs
	public TransactionAttributeComparator(Comparator<TransactionAttribute>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(TransactionAttribute transactionAttribute, TransactionAttribute transactionAttribute2) {
		for (Comparator<TransactionAttribute> comparator : listComparators) {
			int result = comparator.compare(transactionAttribute, transactionAttribute2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}