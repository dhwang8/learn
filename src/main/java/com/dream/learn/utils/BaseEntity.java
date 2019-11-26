package com.dream.learn.utils;

public class BaseEntity
{

    private int limit;// 页面条数

    private int offset;// 开始下标

    private int pageNum;// 当前页数
    // 排序
    private String sortName;
    // 倒序还是顺序
    private String sortOrder;

    // 备用字段1
    private String remark1;

    // 备用字段2
    private String remark2;

    // 备用字段3
    private String remark3;

    public int getLimit()
    {
        return limit;
    }

    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    public int getOffset()
    {
        return offset;
    }

    public void setOffset(int offset)
    {
        this.offset = offset;
    }

    public String getSortName()
    {
        return sortName;
    }

    public void setSortName(String sortName)
    {
        this.sortName = sortName;
    }

    public String getSortOrder()
    {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder)
    {
        this.sortOrder = sortOrder;
    }

    public String getRemark1()
    {
        return remark1;
    }

    public void setRemark1(String remark1)
    {
        this.remark1 = remark1;
    }

    public String getRemark2()
    {
        return remark2;
    }

    public void setRemark2(String remark2)
    {
        this.remark2 = remark2;
    }

    public String getRemark3()
    {
        return remark3;
    }

    public void setRemark3(String remark3)
    {
        this.remark3 = remark3;
    }

    public int getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(int pageNum)
    {
        this.pageNum = pageNum;
    }

}
