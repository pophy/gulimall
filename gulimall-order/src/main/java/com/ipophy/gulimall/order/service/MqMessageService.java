package com.ipophy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:51:15
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

