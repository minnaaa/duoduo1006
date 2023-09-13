package com.example.demo.dto;



import com.example.demo.entity.*;

import lombok.*;

@NoArgsConstructor(access=AccessLevel.PRIVATE)
public class MemberDto {
	@Data
	public static class Join {
		private String id;
		private String password;
		private String email;
		private String username;
		private String tel;
		private String grade;
		private String rcode;
		private Long savemoney;
		private String role;
		
		public Member toEntity(String usename, String pwd) {
			return new Member(id,pwd,username,email,tel,grade,rcode,savemoney,"USER");
		}
	}
	
	@Data
	@AllArgsConstructor
	public static class Read {
		private String id;
		private String email;
		private String tel;
		private String grade;
		private Long savemoney;	
		private String rcode;
	}
}
