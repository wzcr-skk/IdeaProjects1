package com.crmeeting.entity;

import java.util.Date;

public class UserInformation {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String personalMeetingId;

    private String personalNote;

    private String name;

    private Byte gender;

    private Date birthday;

    private String address;

    private Long userHeadPortraitId;

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

    public String getPersonalMeetingId() {
        return personalMeetingId;
    }

    public void setPersonalMeetingId(String personalMeetingId) {
        this.personalMeetingId = personalMeetingId;
    }

    public String getPersonalNote() {
        return personalNote;
    }

    public void setPersonalNote(String personalNote) {
        this.personalNote = personalNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUserHeadPortraitId() {
        return userHeadPortraitId;
    }

    public void setUserHeadPortraitId(Long userHeadPortraitId) {
        this.userHeadPortraitId = userHeadPortraitId;
    }
}