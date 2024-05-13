package kh.mclass.xyz.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.mclass.xyz.model.dto.MemberRes;

@Repository("memberDao")
public class MemberDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberRes> selectList(){
		return sqlSession.selectList("Member.list");
	}
	
	public MemberRes selelctOne(String memId) {
		return sqlSession.selectOne("Member.one",memId);
	}
	
}
