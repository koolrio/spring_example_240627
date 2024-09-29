package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsMapper usedGoodsMapper;
	public List<UsedGoods> getUsedGoodsList(){
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList(); ;
		return usedGoodsList;	
	}
}
