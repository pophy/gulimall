package com.ipophy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 12:52:27
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

