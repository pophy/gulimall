package com.ipophy.gulimall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.gulimall.user.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:55:19
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

