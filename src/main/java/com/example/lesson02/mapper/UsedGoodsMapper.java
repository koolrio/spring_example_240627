package com.example.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.lesson02.domain.UsedGoods;

@Mapper
public interface UsedGoodsMapper {
	
	public List<UsedGoods> selectUsedGoodsList();
}
