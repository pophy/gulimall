package com.ipophy.gulimall.order.dao;

import com.ipophy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:51:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
