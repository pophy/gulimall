package com.ipophy.gulimall.warehouse.dao;

import com.ipophy.gulimall.warehouse.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:56:25
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
