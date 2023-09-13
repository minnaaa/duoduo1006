package com.example.demo.entity;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private String id;
	private String username;
	private String password;
	private String email;
	private String tel;
	private String grade;
	private String rcode;
	private Long savemoney;
	private String role;
}
