package com.example.lesson02.bo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;

@Service  // Spring Bean
public class UsedGoodsBO {

	// input : X    Controller가 나한테 주는게 없다는 뜻
	// output : List<UsedGoods>    Controller한테
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = ;
		return usedGoodsList;
	}
	
}
