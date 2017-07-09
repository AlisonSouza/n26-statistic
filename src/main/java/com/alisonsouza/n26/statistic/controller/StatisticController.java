package com.alisonsouza.n26.statistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alisonsouza.n26.statistic.domain.Statistic;
import com.alisonsouza.n26.statistic.service.StatisticService;

@RestController
@RequestMapping("/api/statistic")
public class StatisticController {

	@Autowired
	private StatisticService statisticService;
	
	@RequestMapping(method = RequestMethod.GET)
    public Statistic getTransactionStatistics() {
		
		return statisticService.findLast60Seconds();
    }
}
