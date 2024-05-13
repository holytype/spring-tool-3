package kh.mclass.xyz.sub;

import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {
	public String method1() {
		return "서비스리턴";
	}
}
