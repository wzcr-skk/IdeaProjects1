package com.crmeeting.entity;

import java.util.Date;

public class RecordedFile {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long meetingId;

    private String meetingTopic;

    private Date meetingStartTime;

    private String recordedFileAddress;

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

    public Long getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Long meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingTopic() {
        return meetingTopic;
    }

    public void setMeetingTopic(String meetingTopic) {
        this.meetingTopic = meetingTopic;
    }

    public Date getMeetingStartTime() {
        return meetingStartTime;
    }

    public void setMeetingStartTime(Date meetingStartTime) {
        this.meetingStartTime = meetingStartTime;
    }

    public String getRecordedFileAddress() {
        return recordedFileAddress;
    }

    public void setRecordedFileAddress(String recordedFileAddress) {
        this.recordedFileAddress = recordedFileAddress;
    }
}