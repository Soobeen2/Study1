package com.greedy.model.dao;

import java.util.HashMap;
import java.util.Map;

import com.greedy.model.dto.MemberDTO;

public class MemberDAO {
   
	private Map<String,Object> map;
	
	public MemberDAO() {
		map = new HashMap<>();
		
		map.put("1", new MemberDTO("홍길동",20,'남'));
	}
	
	public MemberDTO selectMember(MemberDTO member) {
		
		
		return (MemberDTO)map.get("1");
	}
}
