package com.alisonsouza.n26.statistic.domain;

import java.util.Calendar;

public class Transaction {

	private Calendar timestamp;
	
	private Double amount;

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
