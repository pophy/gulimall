package com.ipophy.gulimall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.common.utils.Query;

import com.ipophy.gulimall.warehouse.dao.WareOrderTaskDao;
import com.ipophy.gulimall.warehouse.entity.WareOrderTaskEntity;
import com.ipophy.gulimall.warehouse.service.WareOrderTaskService;


@Service("wareOrderTaskService")
public class WareOrderTaskServiceImpl extends ServiceImpl<WareOrderTaskDao, WareOrderTaskEntity> implements WareOrderTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskEntity> page = this.page(
                new Query<WareOrderTaskEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskEntity>()
        );

        return new PageUtils(page);
    }

}