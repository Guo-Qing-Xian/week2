package com.guoqingxian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guoqingxian.model.TMeetingType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TMeetingTypeMapper extends BaseMapper<TMeetingType> {
}