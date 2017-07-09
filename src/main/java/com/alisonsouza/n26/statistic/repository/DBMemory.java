package com.alisonsouza.n26.statistic.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alisonsouza.n26.statistic.domain.Transaction;

@Component
public class DBMemory {

	private List<Transaction> list = new ArrayList<>();
	
	public void newTransaction(Transaction transaction) {
		
		list.add(transaction);
	}
	
	public List<Transaction> findLast60Seconds() {//TODO
		
		return list;
	}
}
