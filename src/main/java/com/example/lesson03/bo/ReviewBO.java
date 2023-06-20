package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewMapper;
import com.example.lesson03.domain.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewMapper reviewMapper;
	
	// input : id
	// output : id에 일치하는 Review 단건 => Controller한테
	public Review getReviewById(int id) {
		return reviewMapper.selectReviewById(id);
	}
	
	// input : Review
	// output : 성공된 행의 개수 int
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	public int addReviewAsField(int storeId22, String menu22, String userName22, double point22, String review22) {
		return reviewMapper.insertReviewAsField(storeId22, menu22, userName22, point22, review22);
	}
	
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
	
	public void deleteReviewById(int id) {
		reviewMapper.deleteReviewById(id);
	}
	
}
