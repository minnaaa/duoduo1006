package com.example.demo.entity;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	private Long rno;
	private String rimage;
	private String rtitle;
	private String rwriter;
	private LocalDate rwriteday;
	private String rcontent;
	private Long star;
	private Long pno;
}
