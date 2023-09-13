package com.example.demo.dto;

import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NoticeDto {
	@Data
	public static class Create {
		private String ntitle;
		private String ncontent;
		private LocalDate nwriteday;
	}
	
	@Data
	@AllArgsConstructor
	public static class Read {
		private String ntitle;
		private String ncontent;
		private LocalDate nwriteday;
	}
}
