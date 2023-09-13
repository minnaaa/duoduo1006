package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private Long pno;
	private String pname;
	private Long pprice;
	private Long psavemoney;
	private Long pordercount;
	private Long preadcnt;
}
