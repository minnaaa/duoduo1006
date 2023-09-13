package com.example.demo.dao;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface MemberDao {
  @Insert("insert into member values(#{id}, #{username},#{password},#{tel}, #{email},#{grade},#{rcode},#{savemoney}, #{role)")	
  public Integer save(Member member);
  
  //id로 찾기
  @Select("select * from member where id=#{id} and rownum=1")
  public Member findById(String id);

  //email로 찾기
  @Select("select * from member where email=#{email} and rownum=1")
  public Member findByEmail(String email);

  //email 변경
  @Update("update member set email=#{email} where id=#{id}")
  public Integer changeEmail(String email, String id);
  
  //tel 변경
  @Update("update member set tel=#{tel} where id=#{id}")
  public Integer changeTel(String tel, String id);

  //회원 삭제
  @Delete("delete from member where id=#{id}")
  public Integer deleteById(String id);
}
