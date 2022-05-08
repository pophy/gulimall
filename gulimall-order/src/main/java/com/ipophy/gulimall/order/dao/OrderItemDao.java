package com.ipophy.gulimall.order.dao;

import com.ipophy.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:51:15
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
