package com.ipophy.gulimall.product.dao;

import com.ipophy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 12:52:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
