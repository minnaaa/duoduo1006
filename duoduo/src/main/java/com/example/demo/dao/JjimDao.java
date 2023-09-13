package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface JjimDao {
	@Insert("insert into jjim values(#{jno}, #{pno}, #{pname}, #{pimage})")
	public Integer save(Jjim jjim);
	
	@Select("select * from jjim where jno=#{jno}")
	public List<Jjim> findByJno(Long Jno);
	
	@Delete("delete from jjim where jno= #{jno}")
	public Integer deleteByJno(Long Jno);

}
