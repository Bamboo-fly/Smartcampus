package com.example.smartcampus.service;

import com.example.smartcampus.entity.MeetAppoint;
import com.example.smartcampus.entity.MeetRoom;
import com.example.smartcampus.mapper.MeetingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MeetingService {

    @Autowired
    MeetingMapper meetingMapper;

    //获取所有会议室的信息
    public List<MeetRoom> getMeetingRoom(){
        return meetingMapper.getMeetingRoom();
    }

    //获取所有会议室的预约信息
    public List<MeetAppoint> getMeetingAppoint(){
        return meetingMapper.getMeetingAppoint();
    }

    //添加会议室的预约信息
    public Integer addMeetingAppoint(Date meetappoint_time,Date meetappoint_begin,Date meetappoint_end,Integer meetappoint_place){
        return meetingMapper.addMeetingAppoint(meetappoint_time,meetappoint_begin,meetappoint_end,meetappoint_place);
    }


}
