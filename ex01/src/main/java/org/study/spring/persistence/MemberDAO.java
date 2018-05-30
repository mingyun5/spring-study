package org.study.spring.persistence;

import org.study.spring.model.MemberVO;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
