package com.example.demo.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ReviewDto {
	@Data
	public static class Create{
		private String rimage;
		private String rtitle;
		private String rcontent;
		private Long star;
		private Long pno;
	}
}
