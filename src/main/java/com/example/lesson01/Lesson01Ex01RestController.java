package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController  // @Controller + @ResponseBody 효과
public class Lesson01Ex01RestController {
	
	// http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "@RestController를 사용하여 String을 리턴한다.";
	}
	
	// http://localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map<String, String> map = new HashMap<>();
		map.put("고태영", "경장");
		map.put("한기보", "경감");
		map.put("김성민", "경정");
		
		return map;
	}
	
	// http://localhost:8080/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data();  // 자바 bean
		data.setId(1);
		data.setName("고태영");
		return data;
	}
	
	// http://localhost:8080/lesson01/ex01/5
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data();
		data.setId(1);
		data.setName("고태영");
		
//		return new ResponseEntity<>(data, HttpStatus.OK);
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
