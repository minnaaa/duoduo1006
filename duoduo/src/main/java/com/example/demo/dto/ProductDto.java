package com.example.demo.dto;

import java.time.*;
import java.util.*;

import org.springframework.web.multipart.*;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductDto {
	@Data
	public static class Create{
		private String pname;
		private Long pprice;
		private Long psavemoney;
		private List<MultipartFile> pimage;
	}
	
	@Data
	@AllArgsConstructor
	public static class Read{
		private String pname;
		private Long pprice;
		private Long psavemoney;
		private Long pordercount;
		private List<String> pimage;
	}
}