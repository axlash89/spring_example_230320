package com.example.lesson07;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson07.dao.StudentRepository;
import com.example.lesson07.entity.StudentEntity;

@RestController
@RequestMapping("/lesson07/ex02")
public class Lesson07Ex02RestController {

	// 프로젝트 전까지만 BO 생략!!
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/1")
	public List<StudentEntity> getStudentList() {
		// 1) 전체 조회
//		return studentRepository.findAll();
		
		// 2) id 기준 내림차순 전체 조회
//		return studentRepository.findAllByOrderByIdDesc();
		
		// 3) id 기준 내림차순 2개만 조회
//		return studentRepository.findTop2ByOrderByIdDesc();
		
		// 4) 이름이 액슬로즈인 데이터 조회
//		return studentRepository.findByName("액슬로즈");
		
		// 5) in문으로 일치하는 값 모두 조회
//		return studentRepository.findByNameIn(Arrays.asList("조세호", "유재석"));
		
		// 6) 여러 컬럼값과 일치하는 데이터 조회
//		return studentRepository.findByNameAndDreamJob("액슬로즈", "가수");
		
		// 7) email 컬럼에 naver 키워드가 포함된 데이터 조회(like문) - %naver%
//		return studentRepository.findByEmailContaining("naver");
		
		// 8) 이름이 '유'로 시작하는 데이터 조회(like문) - 유%
//		return studentRepository.findByNameStartingWith("유");
		
		// 9) where id >= 1 and id <= 5
		//    id between 1 and 5
		// id가 1~5인 데이터 조회(between)
		return studentRepository.findByIdBetween(1, 5);
		
	}
	
	@GetMapping("/2")
	public List<StudentEntity> getStudent() {
		// 장래희망이 '검사'인 데이터 조회
		return studentRepository.findByDreamJob("검사");
	}
	
}
