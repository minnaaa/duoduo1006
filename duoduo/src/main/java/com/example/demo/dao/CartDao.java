package com.example.demo.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface CartDao {
	// 어떤 사용자의 장바구니 목록 가져오기
	@Select("select * from cart where id=#{id}")
	public List<Cart> findById(String id);

	// 아이디와 상품번호로 장바구니 검색 - 추가한 상품이 장바구니에 등록된 상품인지 확인할 목적
	@Select("select * from cart where id=#{id} and pno=#{pno}")
	public Cart findByIdAndPno(Long pno, String id);

	// 장바구니 추가
	@Insert("insert into cart values(cart_seq.nextval, #{pname}, #{pimage}, #{pprice}, #{pcount}, #{ctotalprice}, #{id}, #{pno})")
	public Integer add(Cart cart);

	// 장바구니의 상품 개수 증가
	@Update("update cart set pcount=pcount+1, ctotalprice=ctotalprice+pprice where cno=#{cno} and id=#{id}")
	public Integer increase(Long cno, String id);

	// 장바구니의 상품 개수 감소
	@Update("update cart set pcount=pcount-1, ctotalprice=ctotalprice-pprice where pcount>1 and cno=#{cno} and id=#{id}")
	public Integer decrease(Long cno, String id);

	// 장바구니 삭제 - 장바구니 번호와 아이디로 삭제하므로 아이디가 틀릴 경우 삭제되지 않는다 
	@Delete("delete from cart where cno=#{cno} and id=#{id}")
	public void deleteCartById(Long cno, String id);

	// 장바구니 가격 합계 - 사용자의 장바구니 가격 합계를 구한다
	@Select("select sum(pprice) from cart where id=#{id}")
	public Long sumById(String id);

	@Select("select * from cart where cno=#{cno} and rownum=1")
	public Cart findById(Long cno);
}
