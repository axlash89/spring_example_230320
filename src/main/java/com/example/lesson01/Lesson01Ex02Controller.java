package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// JSP 화면 뿌리기
@Controller  // RestController 아님 주의!!, ResponseBody 어노테이션 사용 X
public class Lesson01Ex02Controller {

	// http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// jsp의 경로를 return 한다.
		// "/WEB-INF/jsp/"
//		return "/WEB-INF/jsp/lesson01/ex02.jsp";  // jsp 경로
		return "lesson01/ex02";  // prefix 제거   spring.mvc.view.prefix=/WEB-INF/jsp/
								// suffix 제거   spring.mvc.view.suffix=.jsp		
		
	}
	
}
