package com.ipophy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:53:43
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

