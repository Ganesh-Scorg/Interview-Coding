package com.sapient.test;
import java.util.Comparator;
 
/**
 * Used to compare {@link TransactionAttribute} clientid
 * @author patilde
 *
 */
public class TransactionClientIdComparator implements Comparator<TransactionAttribute> {
 
    @Override
    public int compare(TransactionAttribute transactionAttribute, TransactionAttribute transactionAttribute2) {
        return transactionAttribute.getClient_id().compareTo(transactionAttribute2.getClient_id());
    }
}