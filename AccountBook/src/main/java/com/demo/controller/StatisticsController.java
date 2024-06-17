package com.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.services.StatisticsService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.Gson;

@Controller
public class StatisticsController {
	@Autowired
	StatisticsService sservice;
	
	@GetMapping("/statistics")
	public String chooseDate() {
		return "statistics/graph";
	}
	
	
	@GetMapping("/statistics/graph")
	@ResponseBody
	public String showGraph(@RequestParam("start") @DateTimeFormat (pattern="yyyy-MM-dd") Date start, 
			@RequestParam("end") @DateTimeFormat(pattern="yyyy-MM-dd") Date end) {
		List<Map<String, Object>> alist = sservice.showGraph(start, end);
		System.out.println(alist.get(0));
		Gson g = new Gson();
		return g.toJson(alist);
	}

}
