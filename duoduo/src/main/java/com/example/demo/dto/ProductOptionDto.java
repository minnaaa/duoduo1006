package com.example.demo.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductOptionDto {
	@Data
	public static class Create{
		private String psize;
		private String pcolor;
	}
	@Data
	public static class Read{
		private String psize;
		private String pcolor;
	}
}
