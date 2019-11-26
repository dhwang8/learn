package com.dream.learn.utils;

public class PageResult<T>
{
    private int total;
    private T data;

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public PageResult(int total, T data)
    {
        super();
        this.total = total;
        this.data = data;
    }

}
