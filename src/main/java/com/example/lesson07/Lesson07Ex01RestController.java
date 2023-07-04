package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07/ex01")
@RestController
public class Lesson07Ex01RestController {

	@Autowired
	private StudentBO studentBO;
	
	// CUD (Create, Update, Delete)
	
	// C:Create
	@GetMapping("/1")
	public StudentEntity create() { 
		
		String name = "고태영";
		String phoneNumber = "010-9153-8613";
		String email = "axlash7@naver.com";
		String dreamJob = "개발자";
		
		StudentEntity student = studentBO.addStudent(name, phoneNumber, email, dreamJob);
		
		return student;  // @ResponseBody + return 객체 => JSON
		
	}
	
	// U:Update
	@GetMapping("/2")
	public StudentEntity update() {
		
		// id가 5번인 dreamJob을 변경 => "검사"
		StudentEntity student = studentBO.updateStudentDreamJobById(2, "검사");
		
		return student;
		
	}
	
}
