package com.demo.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StatisticsDao {

	@Select("select date, amount from account where type='expense' and date between #{start} and #{end}")
	List<Map<String, Object>> showGraph(@Param("start") Date start, @Param("end") Date end);
}
