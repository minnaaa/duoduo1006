package com.example.demo.entity;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionAnswer {
	private Long qno;
	private String acontent;
	private LocalDate awriteday;
}
