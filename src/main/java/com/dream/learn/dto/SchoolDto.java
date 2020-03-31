package com.dream.learn.dto;

import com.dream.learn.utils.BaseEntity;

public class SchoolDto extends BaseEntity {

    public SchoolDto() {
    }

    public SchoolDto(String schoolName, String schoolAdd) {
        this.schoolName = schoolName;
        this.schoolAdd = schoolAdd;
    }

    private Long schoolId;

    private String schoolName;

    private String schoolAdd;

    private String createTime;

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAdd() {
        return schoolAdd;
    }

    public void setSchoolAdd(String schoolAdd) {
        this.schoolAdd = schoolAdd;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SchoolDto{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", schoolAdd='" + schoolAdd + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
