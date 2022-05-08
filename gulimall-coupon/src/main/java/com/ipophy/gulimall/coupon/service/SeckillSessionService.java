package com.ipophy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:53:43
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

