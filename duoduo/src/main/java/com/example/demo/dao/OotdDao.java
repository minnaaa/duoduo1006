package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface OotdDao {
	@Insert("insert into ootd values(#{ono}, #{otitle}, #{oimage}, #{ocontent}, #{like}, #{save})")
	public Integer save(Ootd ootd);
	
	@Select("select * from ootd where ono=#{ono}")
	public List<Ootd> findByOno(Long ono);
	
	@Update("update ootd set otitle=#{otitle} where ono=#{ono}")
	public Integer changeOtitle(String otitle, Long ono);
	
	@Update("update ootd set oimage=#{oimage} where ono=#{ono}")
	public Integer changeOimage(String oimage, Long ono);
	
	@Update("update ootd set ocontent=#{ocontent} where ono=#{ono}")
	public Integer changeOcontent(String ocontent, Long ono);
	
	@Delete("delete from ootd where o=#{ono}")
	public Integer deleteByOotd(Long nno);
}
