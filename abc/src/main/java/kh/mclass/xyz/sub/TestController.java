package kh.mclass.xyz.sub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@GetMapping("/login")
	public String login(
			Model model,
			String memId
			) {
		//model.addAttribute("memberlist",list);
		return "home";
	}
	
//	@Autowired
//	private TestDto testDto2;
	
	@GetMapping("/test")
	public String method1(
			HttpSession ss,
			String a,
			HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println(a);
		System.out.println(request.getParameter("a"));
		request.setAttribute("b", "파람");
		ss.setAttribute("c", "세션");
		request.getSession().setAttribute("d", "세션2");
		request.setAttribute("serverTime", testService.method1());
//		System.out.println(testDto2);
		return "home";
	}
	@PostMapping
	public String method2() {
		return "home";
	}
//	@RequestMapping(method = RequestMethod.GET, path = "/test")
//	public String method3() {
//		return "home";
//	}
	
	 
}
