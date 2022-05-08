package com.ipophy.gulimall.user.dao;

import com.ipophy.gulimall.user.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Fenix
 * @email fpang1985@gmail.com
 * @date 2022-05-08 13:55:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
