package com.alisonsouza.n26.statistic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alisonsouza.n26.statistic.domain.Transaction;
import com.alisonsouza.n26.statistic.repository.DBMemory;

@Service
public class TransactionService {

	@Autowired
	DBMemory dbMemory;
	
	public void newTransaction(Transaction transaction) {
		
		dbMemory.newTransaction(transaction);
	}
	
//	public List<Transaction> findAll() {
//		
//		return dbMemory.findAll();
//	}
}
