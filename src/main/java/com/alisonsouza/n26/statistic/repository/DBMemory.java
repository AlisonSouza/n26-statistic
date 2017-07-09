package com.alisonsouza.n26.statistic.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.alisonsouza.n26.statistic.domain.Transaction;
import com.alisonsouza.n26.statistic.utils.DateHelperUtils;

@Component
public class DBMemory {

	private List<Transaction> list = new ArrayList<>();
	
	public void newTransaction(Transaction transaction) {
		
		list.add(transaction);
	}
	
	public List<Transaction> findLast60Seconds() {
		
		return list.stream().filter(p -> p.getTimestamp().after(DateHelperUtils.getLast60SecondsByNow())).collect(Collectors.toList());
	}
}
