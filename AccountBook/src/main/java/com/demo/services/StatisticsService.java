package com.demo.services;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StatisticsDao;

@Service
public class StatisticsService {
	@Autowired
	StatisticsDao sdao;
	
	public List<Map<String, Object>> showGraph(Date start, Date end){
		List<Map<String, Object>> alist = sdao.showGraph(start, end);
		return alist;
		
	}
}
