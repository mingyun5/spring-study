package org.study.board.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.study.board.model.BoardVO;

@Repository //아래 클라스 객체도 bean으로 만듬
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	SqlSession session;
	private static final String name ="org.study.board.mapper.BoardMapper";
	
	
	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert(name + ".create" , vo);

	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return session.selectOne(name+".read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(name + ".update", vo);

	}

	@Override
	public void delete(Integer bno) throws Exception {
		session.delete(name + ".delete", bno);

	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(name + ".listAll");
	}

}
