package com.dream.learn.dto;

import com.dream.learn.utils.BaseEntity;

public class LearnUserDto extends BaseEntity {

    public LearnUserDto() {
    }

    public LearnUserDto(String userName, String userTel, String userEmail, String userAddr) {
        this.userName = userName;
        this.userTel = userTel;
        this.userEmail = userEmail;
        this.userAddr = userAddr;
    }

    private Long id;

    private String userName;

    private String userTel;

    private String userEmail;

    private String userAddr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    @Override
    public String toString() {
        return "LearnUserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddr='" + userAddr + '\'' +
                '}';
    }
}
