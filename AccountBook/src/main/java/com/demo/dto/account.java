package com.demo.dto;

import java.util.Date;

import lombok.Data;

@Data
public class account {
	private int primarykey;
	private Date date;
	private String type;
	private int amount;
	private int classID;
	private String asset;
	private String memo;
	private String details;
}
