package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface QnaDao {
	
	@Insert("insert into qna values(qna_seq.nextval,#{qkind},#{qtitle},#qcontent},#{qwriteday},#{id})")
	public void save(Qna qna);
	
	@Select("select * from qna where qno=#{qno}")
	public List<Qna> findByQno(Long qno);
	
	@Select("select count(*) from qna where qno=#{qno}")
	public Long countByQno(Long qno);	
	
	@Delete("delete from qna where qno=#{qno}")
	public Integer deleteByQno(Long qno);
	
	
	
	
}
