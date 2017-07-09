package com.alisonsouza.n26.statistic.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StatisticTest {

	List<Transaction> transactions;
	
	@Before
	public void setUp() {
		transactions = new ArrayList<>();
	}
	
	@Test
	public void shouldReturnZeroForAllStatistcs() {
		Statistic statistic = new Statistic(transactions);
		
		Assert.assertEquals(0, statistic.getAvg(), 0.00);
		Assert.assertEquals(0, statistic.getCount(), 0.00);
		Assert.assertEquals(0, statistic.getMax(), 0.00);
		Assert.assertEquals(0, statistic.getMin(), 0.00);
		Assert.assertEquals(0, statistic.getSum(), 0.00);
	}
	
	@Test
	public void shouldReturnOneForCount() {
		
		Transaction transaction = new Transaction();
		transaction.setAmount(10.0);
		transaction.setTimestamp(Calendar.getInstance());
		transactions.add(transaction);
		
		Statistic statistic = new Statistic(transactions);
		
		Assert.assertEquals(1, statistic.getCount(), 0.00);
	}
	
	@Test
	public void shouldReturnTwentyForSum() {
		
		Transaction transaction1 = new Transaction();
		transaction1.setAmount(10.0);
		transaction1.setTimestamp(Calendar.getInstance());
		
		Transaction transaction2 = new Transaction();
		transaction2.setAmount(10.0);
		transaction2.setTimestamp(Calendar.getInstance());
		transactions.addAll(Arrays.asList(transaction1, transaction2));
		
		Statistic statistic = new Statistic(transactions);
		
		Assert.assertEquals(20, statistic.getSum(), 0.00);
	}
	
	@Test
	public void shouldReturnTenForMax() {
		
		Transaction transaction1 = new Transaction();
		transaction1.setAmount(5.0);
		transaction1.setTimestamp(Calendar.getInstance());
		
		Transaction transaction2 = new Transaction();
		transaction2.setAmount(10.0);
		transaction2.setTimestamp(Calendar.getInstance());
		transactions.addAll(Arrays.asList(transaction1, transaction2));
		
		Statistic statistic = new Statistic(transactions);
		
		Assert.assertEquals(10, statistic.getMax(), 0.00);
	}
	
	@Test
	public void shouldReturnFiveForMin() {
		
		Transaction transaction1 = new Transaction();
		transaction1.setAmount(5.0);
		transaction1.setTimestamp(Calendar.getInstance());
		
		Transaction transaction2 = new Transaction();
		transaction2.setAmount(10.0);
		transaction2.setTimestamp(Calendar.getInstance());
		transactions.addAll(Arrays.asList(transaction1, transaction2));
		
		Statistic statistic = new Statistic(transactions);
		
		Assert.assertEquals(5, statistic.getMin(), 0.00);
	}
	
	@Test
	public void shouldReturnSevenPointFiveForAvg() {
		
		Transaction transaction1 = new Transaction();
		transaction1.setAmount(5.0);
		transaction1.setTimestamp(Calendar.getInstance());
		
		Transaction transaction2 = new Transaction();
		transaction2.setAmount(10.0);
		transaction2.setTimestamp(Calendar.getInstance());
		transactions.addAll(Arrays.asList(transaction1, transaction2));
		
		Statistic statistic = new Statistic(transactions);
		
		Assert.assertEquals(7.5, statistic.getAvg(), 0.00);
	}
	
}
