package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // Spring bean
@RequestMapping("/lesson01/ex01")
public class Lesson01Ex01Controller {
	
	// return String => HTML
	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody  // 리턴되는 값이 HTML Response에 담긴다.
	@RequestMapping("/1")  // 주소 맵핑
	public String ex01_1() {
		String text = "예제1번<br>문자열을 response body로 보내는 예제";
		return text;
	}

	// return map => JSON String
	// http://localhost:8080/lesson01/ex01/2
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("apple", 15);
		map.put("pineapple", 7);
		map.put("mango", 4);
		map.put("banana", 11);
		
		// {"키"=값}  =>  자바의 맵
		// map을 리턴하면 JSON으로 나타난다. web starter안에 jackson library가 있기 때문..
		return map;
	}
	
}
