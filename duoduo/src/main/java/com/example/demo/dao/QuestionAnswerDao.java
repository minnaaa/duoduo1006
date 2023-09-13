package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface QuestionAnswerDao {
	
	@Insert("insert into questionanswer values(questionanswer_seq.nextval,#{acontent},#{awriteday})")
	public void save(QuestionAnswer questionAnswer);
	
	@Select("select * from questionanswer where qno=#{qno}")
	public List<QuestionAnswer> findByQno(Long qno);
	
	@Delete("delete from questionanswer where qno=#{qno}")
	public Integer deleteByqno(Long qno);
	
}
