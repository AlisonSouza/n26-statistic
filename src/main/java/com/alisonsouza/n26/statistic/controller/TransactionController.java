package com.alisonsouza.n26.statistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alisonsouza.n26.statistic.domain.Transaction;
import com.alisonsouza.n26.statistic.service.TransactionService;
import com.alisonsouza.n26.statistic.utils.DateHelperUtils;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;

	@SuppressWarnings("rawtypes")
	@PostMapping(consumes = "application/json")
    public ResponseEntity<?> createTransaction(@RequestBody Transaction transaction) {
		
		if(transaction.getTimestamp().after(DateHelperUtils.getLast60SecondsByNow())) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
		transactionService.newTransaction(transaction);
		return new ResponseEntity(HttpStatus.CREATED);
    }
}
