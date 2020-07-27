package com.guoqingxian.service;

import com.guoqingxian.model.TMeeting;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guoqingxian.struct.PageResult;
import com.guoqingxian.struct.SearchVo;

public interface TMeetingService extends IService<TMeeting>{
    /**
     * @return 返回会议列表信息
     */
    PageResult<TMeeting> getListTMeeting();
}
