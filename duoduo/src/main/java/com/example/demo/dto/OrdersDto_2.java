package com.example.demo.dto;

import java.time.*;

import lombok.*;

public class OrdersDto_2 {
	@Data
	public static class Create{		
		private LocalDate oday;
		private Long oprice; 
		private	String address;
	}
	
	@Data
	@AllArgsConstructor	
	public static class Read{		
		private LocalDate oday;
		private Long oprice; 
		private	String address;
	}
}
