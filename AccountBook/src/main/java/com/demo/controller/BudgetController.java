package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/budget")
public class BudgetController {
	
	@GetMapping("/year")
	public String OneYearBudget() {
		return "budget/year";
	}
	
	
	@GetMapping("/month")
	public String OneMonthBudget() {
		return "budget/month";
	}
	
	@GetMapping("/week")
	public String OneWeekBudget() {
		return "budget/week";
	}


}
