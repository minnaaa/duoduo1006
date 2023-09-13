package com.example.demo.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Notice {
	private Long nno;
	private String ntitle;
	private String ncontent;
	private LocalDate nwriteday;
}
