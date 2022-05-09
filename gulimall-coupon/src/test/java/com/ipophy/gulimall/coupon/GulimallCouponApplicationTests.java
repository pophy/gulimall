package com.ipophy.gulimall.coupon;

import com.ipophy.gulimall.coupon.entity.CouponEntity;
import com.ipophy.gulimall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    CouponService couponService;
    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("My Coupon");
        couponEntity.setCode("Code");
        couponEntity.setAmount(new BigDecimal(1123));
        couponService.save(couponEntity);
    }

}
