package com.dream.learn.utils;

import java.util.List;

public class PageHelp<T>
{

    public PageHelp() {
    }

    public PageHelp(List<T> rows) {
        this.rows = rows;
    }

    public PageHelp(List<T> rows, Integer total) {
        this.rows = rows;
        this.total = total;
    }

    // 注意：这两个属性名称不能改变，是定死的
    // 实体类集合
    private List<T> rows;
    // 数据总条数
    private int total;

    // setter and getter...
    public List<T> getRows()
    {
        return rows;
    }

    public void setRows(List<T> rows)
    {
        this.rows = rows;
    }

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public static <T> PageHelp setRows1(List<T> data, Integer total)
    {
        return new PageHelp<T>(data, total);
    }
}