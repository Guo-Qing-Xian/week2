package com.guoqingxian.service.impl;

import com.guoqingxian.struct.PageResult;
import com.guoqingxian.struct.SearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guoqingxian.model.TMeeting;
import com.guoqingxian.dao.TMeetingMapper;
import com.guoqingxian.service.TMeetingService;
@Service
public class TMeetingServiceImpl extends ServiceImpl<TMeetingMapper, TMeeting> implements TMeetingService{

    private final TMeetingMapper tMeetingMapper;
    @Autowired
    public TMeetingServiceImpl(TMeetingMapper tMeetingMapper) {
        this.tMeetingMapper = tMeetingMapper;
    }

    @Override
    public PageResult<TMeeting> getListTMeeting() {
        List<TMeeting> listTMeeting = tMeetingMapper.getListTMeeting();
        return new PageResult<>(listTMeeting,null);
    }
}
