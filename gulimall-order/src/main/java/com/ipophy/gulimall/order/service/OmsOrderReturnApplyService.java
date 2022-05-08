package com.ipophy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:46:27
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

