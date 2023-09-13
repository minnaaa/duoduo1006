package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface ReviewDao {
	@Insert("insert into review values(review_seq.nextval,#{rimage},#{rtitle},#{rwriteday},#{rcontent},#{star},#{pno}")
	public void save(Review review);
	
	@Select("select * from review where pno=#{pno}")
	public List<Review> findByPno(Long pno);
	
	@Delete("delete from review where rno=#{rno} and rwriter=#{rwriter}")
	public Integer deleteByrnoAndrwriter(Long rno, String rwriter);
	
	@Delete("delete from review where pno=#{pno}")
	public Integer deleteByrno(Long rno);
	
	@Select("select count(*) from review where pno=#{pno}")
	public Long countByPno(Long pno);
	
	@Select("select round(avg(star),2) from review were pno=#{pno}")
	public Double avgByPno(Long pno);
}
