package org.study.spring.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.spring.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	@Autowired
	private MemberDAO dao;
	
	@Test
	public void testGetTime() throws Exception {
		System.out.println(dao.getTime());
		
	}
	
	@Test
	public void testInsertMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("user02");
		vo.setUsername("user02");
		vo.setUserpw("1234");
		vo.setEmail("user02@abc.com");
		
		dao.insertMember(vo);
	}
	
	@Test
	public void testreadMember() throws Exception {
		MemberVO vo = dao.readMember("user02");
		
		System.out.println(vo);
	}
	
	@Test
	public void testReadMemberWithPW() throws Exception{
		MemberVO vo = dao.readWithPW("user02", "1234");
		
		System.out.println(vo);
		
	}
}
