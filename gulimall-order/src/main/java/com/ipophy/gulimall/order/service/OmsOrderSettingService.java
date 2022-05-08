package com.ipophy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.order.entity.OmsOrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:46:27
 */
public interface OmsOrderSettingService extends IService<OmsOrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

