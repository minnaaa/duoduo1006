package com.example.demo.dto;

import java.time.*;

import org.springframework.format.annotation.*;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class QuestionAnswerDto {
	@Data
	public static class Create{
		private Long qno;
		private String acontent;
	}
	
	@Data
	@AllArgsConstructor
	public static class Read{
		private String acontent;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private LocalDate awriteday;
	}
}
