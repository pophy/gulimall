package com.ipophy.gulimall.order.dao;

import com.ipophy.gulimall.order.entity.OmsOrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:46:27
 */
@Mapper
public interface OmsOrderOperateHistoryDao extends BaseMapper<OmsOrderOperateHistoryEntity> {
	
}
