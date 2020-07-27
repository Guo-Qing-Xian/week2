package com.guoqingxian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guoqingxian.model.TMeetingType;
import com.guoqingxian.dao.TMeetingTypeMapper;
import com.guoqingxian.service.TMeetingTypeService;
@Service
public class TMeetingTypeServiceImpl extends ServiceImpl<TMeetingTypeMapper, TMeetingType> implements TMeetingTypeService{
    private final TMeetingTypeMapper tMeetingTypeMapper;
    @Autowired
    public TMeetingTypeServiceImpl(TMeetingTypeMapper tMeetingTypeMapper) {
        this.tMeetingTypeMapper = tMeetingTypeMapper;
    }
}
