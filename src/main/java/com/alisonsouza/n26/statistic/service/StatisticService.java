package com.alisonsouza.n26.statistic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alisonsouza.n26.statistic.domain.Statistic;
import com.alisonsouza.n26.statistic.repository.DBMemory;

@Service
public class StatisticService {

	@Autowired
	DBMemory dbMemory;
	
	public Statistic findLast60Seconds() {
		
		return new Statistic(dbMemory.findLast60Seconds());
	}
}
