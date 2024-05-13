package kh.mclass.xyz.member.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.mclass.xyz.member.model.dao.MemberDao;
import kh.mclass.xyz.model.dto.MemberRes;

@Service("memberService")
@Transactional
public class MemberService {
	@Autowired
	private MemberDao memberDao;
	
	@Transactional
	public List<MemberRes> selectList(){
		return memberDao.selectList();
	}
}
