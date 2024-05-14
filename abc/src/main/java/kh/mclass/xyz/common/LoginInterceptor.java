package kh.mclass.xyz.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("LoginInterceptor<<<<");
		HttpSession session = request.getSession();
		// login처리를 담당하는 사용자 정보가 담긴 객체를 가져옴
		Object obj = session.getAttribute("sslogin");
		
		//로그인 안됐을 때
		if(obj == null) {
			response.sendRedirect(request.getContextPath()+"/login");
			return false;
		}else {
			return true;
		}
	}
}
