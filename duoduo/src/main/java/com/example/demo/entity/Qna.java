package com.example.demo.entity;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Qna {
	private Long qno;
	private String qkind;
	private String qtitle;
	private String qcontent;
	private LocalDate qwriteday;
	private String id;
}
