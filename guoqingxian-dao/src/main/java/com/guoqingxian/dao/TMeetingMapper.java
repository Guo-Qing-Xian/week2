package com.guoqingxian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guoqingxian.model.TMeeting;
import com.guoqingxian.struct.PageResult;
import com.guoqingxian.struct.SearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TMeetingMapper extends BaseMapper<TMeeting> {
    List<TMeeting> getListTMeeting();
}