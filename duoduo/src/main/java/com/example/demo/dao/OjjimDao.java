package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface OjjimDao {
	@Insert("insert into ojjim values(#{ojno}, #{oimage}, #{otitle})")
	public Integer save(Ojjim ojjim);
	
	@Select("select * from ojjim where ojno=#{ojno}")
	public List<Ojjim> findByOjno(Long ojno);
	
	@Delete("delete from ojjim where ojno=#{ojno}")
	public Integer deleteByOjno(Long ojno);
}
