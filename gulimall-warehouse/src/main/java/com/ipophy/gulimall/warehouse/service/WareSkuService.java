package com.ipophy.gulimall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.warehouse.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:56:25
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

