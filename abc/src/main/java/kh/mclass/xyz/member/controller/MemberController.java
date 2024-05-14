package kh.mclass.xyz.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kh.mclass.xyz.member.model.service.MemberService;
import kh.mclass.xyz.model.dto.MemberRes;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/list")
	public void selectList(
			Model model
			) {
		List<MemberRes> list = memberService.selectList();
		model.addAttribute("memberlist",list);
		//return "member/list";
	}
	
	@GetMapping("/one")
	public String selectOne(
			Model model,
			String memId
			) {
		//model.addAttribute("memberlist",list);
		return "member/one";
	}
	
	@GetMapping("/insert")
	public String insert(
			Model model,
			String memId
			) {
		//model.addAttribute("memberlist",list);
		return "redirect:/login";
	}
	
	@PostMapping("/ajax")
	public @ResponseBody String getajax(
			Model model,
			String memId
			) {
		//model.addAttribute("memberlist",list);
		
		return "ajax success function data";
	}
}
