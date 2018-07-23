package com.crmeeting.entity;

import java.util.Date;

public class SignIn {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Date startTime;

    private Date endTime;

    private Long meetingId;

    private String checkInListAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Long meetingId) {
        this.meetingId = meetingId;
    }

    public String getCheckInListAddress() {
        return checkInListAddress;
    }

    public void setCheckInListAddress(String checkInListAddress) {
        this.checkInListAddress = checkInListAddress;
    }
}