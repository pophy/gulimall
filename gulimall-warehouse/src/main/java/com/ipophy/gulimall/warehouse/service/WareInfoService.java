package com.ipophy.gulimall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.warehouse.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:56:25
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

