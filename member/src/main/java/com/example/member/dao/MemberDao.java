package com.example.member.dao;

import com.example.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-12 15:30:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
