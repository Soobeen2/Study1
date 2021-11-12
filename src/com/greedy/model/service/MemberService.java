package com.greedy.model.service;

import com.greedy.model.dao.MemberDAO;
import com.greedy.model.dto.MemberDTO;

public class MemberService {

	private MemberDAO memberDAO = new MemberDAO();
	
	
	public MemberDTO selectMember(MemberDTO member) {
		memberDAO.selectMember(member);
		return null;
	}
	
}
