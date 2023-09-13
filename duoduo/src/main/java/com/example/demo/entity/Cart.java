package com.example.demo.entity;

import lombok.*;

@Data
@AllArgsConstructor
public class Cart {
	private Long cno;
	private String id;
	private Long pno;
	private String pimage;
	private String pname;
	private Long pcount;
	private Long pprice;
	private Long ctotalprice;
}