package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dto.account;
import com.demo.services.accountService;
import com.google.gson.Gson;


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
	
	@GetMapping("/test/ajax")
	@ResponseBody
	public String showDB(){
		List<account> alist = aservice.accountAll();
		Gson g = new Gson();
		return g.toJson(alist);
	}
	
}
