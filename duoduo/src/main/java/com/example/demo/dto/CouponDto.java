package com.example.demo.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CouponDto {
	@Data
	public static class Read {
		private int three;
		private int five;
		private int seven;
	}
}
