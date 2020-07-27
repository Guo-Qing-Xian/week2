/**
 * 作者:   郭青贤
 * 时间:   2020/7/27 9:20
 */
package com.guoqingxian.web;

import com.guoqingxian.model.TMeeting;
import com.guoqingxian.service.TMeetingService;
import com.guoqingxian.struct.PageResult;
import com.guoqingxian.struct.SearchVo;
import io.micrometer.core.instrument.search.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class TMeetingController {
    private final TMeetingService tMeetingService;
    @Autowired
    public TMeetingController(TMeetingService tMeetingService) {
        this.tMeetingService = tMeetingService;
    }

    @RequestMapping("getListTMeeting")
    public PageResult<TMeeting> getListTMeeting(){
        return tMeetingService.getListTMeeting();
    }
    @RequestMapping("addListTMeeting")
    public boolean addListTMeeting(@RequestBody TMeeting tMeeting){
        System.out.println("--------------"+tMeeting);
        boolean save = tMeetingService.save(tMeeting);
        if (save){
            return true;
        }
        return false;
    }
    @RequestMapping("updateListTMeeting")
    public boolean updateListTMeeting(@RequestBody TMeeting tMeeting){
        boolean save = tMeetingService.updateById(tMeeting);
        if (save){
            return true;
        }
        return false;
    }
}
