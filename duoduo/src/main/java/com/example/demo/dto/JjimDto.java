package com.example.demo.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JjimDto {
	@Data
	public static class Read {
		private String pname;
		private String pimage;
	}
}
