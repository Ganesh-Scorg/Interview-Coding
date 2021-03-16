package com.sapient.test;

/**
 * 
 * @author patilde
 *
 */
public class TransactionAttribute {

	String external_transaction_id;
	String client_id;
	String security_id;
	String transaction_type;
	String transaction_date;
	String market_value;
	String priority;
	String processingFee;

	public String getProcessingFee() {
		return processingFee;
	}

	public void setProcessingFee(String processingFee) {
		this.processingFee = processingFee;
	}

	public TransactionAttribute() {
		super();
	}

	public String getExternal_transaction_id() {
		return external_transaction_id;
	}

	public void setExternal_transaction_id(String external_transaction_id) {
		this.external_transaction_id = external_transaction_id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getSecurity_id() {
		return security_id;
	}

	public void setSecurity_id(String security_id) {
		this.security_id = security_id;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getMarket_value() {
		return market_value;
	}

	public void setMarket_value(String market_value) {
		this.market_value = market_value;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "TransactionAttribute [external_transaction_id=" + external_transaction_id + ", client_id=" + client_id
				+ ", security_id=" + security_id + ", transaction_type=" + transaction_type + ", transaction_date="
				+ transaction_date + ", market_value=" + market_value + ", priority=" + priority + ", processingFee="
				+ processingFee + "]";
	}

}