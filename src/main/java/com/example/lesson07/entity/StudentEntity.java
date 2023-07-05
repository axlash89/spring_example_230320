package com.example.lesson07.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 이 정도가 기본 annotation으로 항상 붙음
@ToString  // toString override 값 예쁘게 출력
@AllArgsConstructor  // 모든 필드를 인자값으로 받는 생성자
@NoArgsConstructor  // 파라미터 없는 기본 생성자
@Builder(toBuilder = true)  // <- setter의 대용  (toBuilder = true) 추가하면 ex) dreamJob 하나만 바꿀 수도 있음.
@Getter  // 말그대로 getter
@Table(name = "new_student")  // 테이블명에 언더바가 붙어있을때 꼭 추가한다.
@Entity(name = "new_student")  // 이 클래스는 Entity다
public class StudentEntity {

	@Id  // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // auto increment
	private int id;
	private String name;
	
	@Column(name = "phoneNumber")  // Camel Case 필드인 경우 반드시 명시
	private String phoneNumber;
	private String email;
	
	@Column(name = "dreamJob")
	private String dreamJob;
	
	@UpdateTimestamp  // createdAt이 null이면 현재 시간으로 자동으로 입력
	@Column(name = "createdAt", updatable = false)  // updatable = false 는 update 시 시간 갱신 안함
	private ZonedDateTime createdAt;
	
	@UpdateTimestamp  // updatedAt이 null이면 현재 시간으로 자동으로 입력
	@Column(name = "updatedAt")
	private ZonedDateTime updatedAt;
		
}
