package org.study.spring.persistence;

import java.util.HashMap;
import java.util.Map;

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

	@Override
	public MemberVO readMember(String userid) throws Exception {
		MemberVO vo = session.selectOne(namespace + ".selectMember", userid);
		return vo;
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		Map<String, String> map = new HashMap<>();
		
		map.put("userid", userid);
		map.put("userpw", userpw);
		
		MemberVO vo = session.selectOne(namespace + ".selectMemberWithPW", map);
		return vo;
	}
		

}
