package com.example.demo.dto;

import java.util.*;

import com.example.demo.entity.*;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CartDto {
	@Data
	@AllArgsConstructor
	public static class Read {
		private List<Cart> carts;
		private Long ctotalprice;
	}
	
	@Data
	public static class Delete {
		private List<Long> cnos;
	}
}
