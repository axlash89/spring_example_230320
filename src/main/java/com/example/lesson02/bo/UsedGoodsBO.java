package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsMapper;
import com.example.lesson02.domain.UsedGoods;

@Service  // Spring Bean
public class UsedGoodsBO {
	
	// 필드
	@Autowired    // Dependecy Inject (DI) -> 의존성 주입 => Spring bean
	private UsedGoodsMapper usedGoodsMapper;
	

	// input : X    Controller가 나한테 주는게 없다는 뜻
	// output : List<UsedGoods>    Controller한테
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
		return usedGoodsList;
	}
	
}
