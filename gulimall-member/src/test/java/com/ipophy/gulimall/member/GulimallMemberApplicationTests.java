package com.ipophy.gulimall.member;


import com.ipophy.gulimall.member.entity.MemberEntity;
import com.ipophy.gulimall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class GulimallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    public void contextLoads() {
        MemberEntity entity = new MemberEntity();
        entity.setNickname("Nick");
        entity.setEmail("nice@test.com");
        memberService.save(entity);


    }

}
