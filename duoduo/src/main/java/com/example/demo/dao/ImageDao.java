package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface ImageDao {
	@Insert("insert into image values(image_seq.nextval, #{name}, #{pno})")
	public Integer save(Image image);

	@Select("select name from image where pno=#{pno}")
	public List<String> findByPno(Long pno);
	
	@Delete("delete from image where pno=#{pno}")
	public Integer deleteByPno(Long pno);
}
