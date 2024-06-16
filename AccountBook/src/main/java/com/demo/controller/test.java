package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.dto.account;
import com.demo.services.accountService;


@Controller
public class test {
	
	@Autowired
	accountService aservice;
	
	@GetMapping("/test")
	public String accountAll(Model m) {
		List<account> alist = aservice.accountAll();
		m.addAttribute("alist",alist);
		return "test/showdb";
	}
	
}
