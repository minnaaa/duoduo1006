package com.example.demo.dto;

import lombok.*;

public class OrderdetailDto_2 {
	@Data
	public static class Create{
		private Long pcount;
		private Long pprice;
		private String psize;
		private String pcolor;
		private Boolean rcomplete;
		private Long pno;
	}
	
	@Data
	@AllArgsConstructor	
	public static class Read{
		private Long pcount;
		private Long pprice;
		private String psize;
		private String pcolor;
		private Boolean rcomplete;
		private Long pno;
	}
}
