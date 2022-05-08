package com.ipophy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.order.entity.OmsPaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:46:27
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

