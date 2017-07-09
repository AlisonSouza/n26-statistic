package com.alisonsouza.n26.statistic.domain;

import java.util.List;

public class Statistic {

	double sum;
	
	double avg;
	
	double max;
	
	double min;
	
	double count;
	
	public Statistic(List<Transaction> transactions) {
		if(transactions != null && !transactions.isEmpty()) {
			setCount(transactions.size());
			setSum(transactions.stream().mapToDouble(d -> d.getAmount()).sum());
			setMax(transactions.stream().mapToDouble(d -> d.getAmount()).reduce(Double::max).getAsDouble());
			setMin(transactions.stream().mapToDouble(d -> d.getAmount()).reduce(Double::min).getAsDouble());
			setAvg(getSum() / getCount());
		}
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}
	
}
