package org.study.spring.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.study.spring.model.MemberVO;


@Repository //아래 클라스 객체도 bean으로 만듬
public class MemberDAOImpl implements MemberDAO {
	
	/**
	 * session 객체를 스프링이 만틈(Autowired)
	 */
	@Autowired
	private SqlSession session;
//	memvermapper.xml에 namespace + id
	private static final String namespace = "org.study.spring.mapper.MemberMapper";
	
	
	@Override
	public String getTime() {
		return session.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		session.insert(namespace + ".insertMember", vo);

	}

}
