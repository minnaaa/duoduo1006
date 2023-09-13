package com.example.demo.dto;

import java.time.*;

import org.springframework.format.annotation.*;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class QnaDto {
	@Data
	public static class Create{
		private String qkind;
		private String qtitle;
		private String qcontent;
		private String id;
	}
	
	@Data
	@AllArgsConstructor
	public static class Read{
		private String qkind;
		private String qcontent;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private LocalDate qwriteday;
		private String id;
	}
}
