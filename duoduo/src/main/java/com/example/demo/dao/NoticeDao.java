package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface NoticeDao {
	@Insert("insert into notice values(#{nno}, #{ntitle}, #{ncontent}, #{nwriteday})")
	public Integer save(Notice notice);
	
	@Select("select * from notice where nno=#{nno}")
	public List<Notice> findByNno(Long Nno);
	
	@Update("update notice set ntitle=#{ntitle} where nno=#{nno}")
	public Integer changeNtitle(String ntitle, Long nno);
	
	@Update("update notice set ncontent=#{ncontent} where nno=#{nno}")
	public Integer changeNcontent(String ncontent, Long nno);
	
	@Delete("delete from notice where nno=#{nno}")
	public Integer deleteByNotice(Long nno);

}
