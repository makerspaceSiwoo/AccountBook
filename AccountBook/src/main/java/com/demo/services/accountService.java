package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.accountDao;
import com.demo.dto.account;

@Service
public class accountService {
	@Autowired
	accountDao acdao;
	
	public List<account> accountAll(){
		return acdao.accountAll();
	}
}
