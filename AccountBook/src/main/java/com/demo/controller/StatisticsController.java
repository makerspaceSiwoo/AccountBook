package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatisticsController {
	
	@GetMapping("/statistics")
	public String showGraph(Model m) {
		
		return "statistics/graph";
	}

}
