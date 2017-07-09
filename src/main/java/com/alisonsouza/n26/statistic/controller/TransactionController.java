package com.alisonsouza.n26.statistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alisonsouza.n26.statistic.domain.Transaction;
import com.alisonsouza.n26.statistic.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;

	@PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createTransaction(@RequestBody Transaction transaction) {
		
		transactionService.newTransaction(transaction);
    }
}
