package com.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.demo.dto.account;

@Mapper
public interface accountDao {
	
	@Select("select * from account order by primarykey")
	List<account> accountAll();
	
}
