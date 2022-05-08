package com.ipophy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.order.entity.OmsOrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:46:27
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

