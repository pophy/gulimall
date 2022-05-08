package com.ipophy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.order.entity.OmsOrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:46:27
 */
public interface OmsOrderOperateHistoryService extends IService<OmsOrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

