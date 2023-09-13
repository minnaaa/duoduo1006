package com.example.demo.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OjjimDto {
	@Data
	public static class Read {
		private String oimage;
		private String otitle;
	}
	
}
