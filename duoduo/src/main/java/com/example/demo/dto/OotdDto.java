package com.example.demo.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OotdDto {
	@Data
	public static class Create {
		private String otitle;
		private String oimage;
		private String ocontent;
	}
	
	@Data
	@AllArgsConstructor
	public static class Read {
		private String otitle;
		private String oimage;
		private Boolean like;
		private Boolean save;
		private String ocontent;
	}
}
