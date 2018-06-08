package org.study.board;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.board.model.BoardVO;
import org.study.board.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)  //spring test를 이용하기위해서
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //spring test를 이용하기위해서
public class BoardDAOTest {
	
	@Autowired
	BoardDAO dao;
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	
	@Test
	public void testCreate() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setTitle("새로운 타이틀");
		vo.setContent("새로운 컨텐트");
		vo.setWriter("김철수");
				
		dao.create(vo);
	}
	
	@Test
	public void testUpdate() throws Exception{
		BoardVO vo = new BoardVO();
		
		vo.setTitle("바뀐 타이틀");
		vo.setContent("바뀐 컨텐트");
		vo.setBno(1);
		
		dao.update(vo);
	}
	
	@Test
	public void testDelete() throws Exception{
		
		dao.delete(2);
	}
	
	@Test
	public void testRead() throws Exception{
		BoardVO vo = dao.read(1);
		System.out.println("-------------------------------------------------------------------");
		System.out.println(vo);
	}
	
	@Test
	public void testListAll()  throws Exception{
		dao.listAll();
	}
	
	@Test
	public void testLIstPage() throws Exception{
		int page = 10;
		
		List<BoardVO> list = dao.listpage(page);
		for(BoardVO board : list) {
			logger.info(board.getBno() + ":" + board.getTitle());
		}
	}
}
