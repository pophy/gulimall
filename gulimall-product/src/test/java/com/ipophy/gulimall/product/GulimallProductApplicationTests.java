package com.ipophy.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ipophy.gulimall.product.entity.BrandEntity;
import com.ipophy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("TestABCBrand");
//        brandService.save(brandEntity);
//        System.out.println("Save success");

        List<BrandEntity> brandList = brandService.list(new QueryWrapper<BrandEntity>().gt("brand_id", 0));
        brandList.stream().forEach((b) -> System.out.println("Brand: " + b.getName()));
    }

}
