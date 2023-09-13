package com.example.demo.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GradeDto {
	@Data
	public static class Read {
		private int normal;
		private int superb;
		private int vip;
	}
}
