package com.crmeeting.entity;

import java.util.Date;

public class Schedule {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String topic;

    private Date start;

    private Short duration;

    private String timeZone;

    private Byte isRecurringMeeting;

    private String meetingPassword;

    private Long participantListId;

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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Byte getIsRecurringMeeting() {
        return isRecurringMeeting;
    }

    public void setIsRecurringMeeting(Byte isRecurringMeeting) {
        this.isRecurringMeeting = isRecurringMeeting;
    }

    public String getMeetingPassword() {
        return meetingPassword;
    }

    public void setMeetingPassword(String meetingPassword) {
        this.meetingPassword = meetingPassword;
    }

    public Long getParticipantListId() {
        return participantListId;
    }

    public void setParticipantListId(Long participantListId) {
        this.participantListId = participantListId;
    }
}