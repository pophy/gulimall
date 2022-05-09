package com.ipophy.gulimall.warehouse;

import com.ipophy.gulimall.warehouse.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWarehouseApplicationTests {

    @Autowired
    WareInfoService wareInfoService;
    @Test
    void contextLoads() {
    }

}
