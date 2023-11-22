package com.example.smartcampus.entity;

import java.util.Date;

public class MeetAppoint {
    private Date meetappoint_time;
    private Date meetappoint_begin;
    private Date meetappoint_end;
    private Integer meetappoint_key;
    private Integer meetappoint_place;

    public Date getMeetappoint_time() {
        return meetappoint_time;
    }

    public void setMeetappoint_time(Date meetappoint_time) {
        this.meetappoint_time = meetappoint_time;
    }

    public Date getMeetappoint_begin() {
        return meetappoint_begin;
    }

    public void setMeetappoint_begin(Date meetappoint_begin) {
        this.meetappoint_begin = meetappoint_begin;
    }

    public Date getMeetappoint_end() {
        return meetappoint_end;
    }

    public void setMeetappoint_end(Date meetappoint_end) {
        this.meetappoint_end = meetappoint_end;
    }

    public Integer getMeetappoint_key() {
        return meetappoint_key;
    }

    public void setMeetappoint_key(Integer meetappoint_key) {
        this.meetappoint_key = meetappoint_key;
    }

    public Integer getMeetappoint_place() {
        return meetappoint_place;
    }

    public void setMeetappoint_place(Integer meetappoint_place) {
        this.meetappoint_place = meetappoint_place;
    }
}
