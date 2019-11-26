package com.dream.learn.utils;

public class ApiResult<T>
{
    private String errCode;
    private String errMsg;
    private T data;

    public ApiResult(ResultCode resultCode, T data)
    {
        this.errCode = resultCode.getCode();
        this.errMsg = resultCode.getMessage();
        this.data = data;
    }

    public String getErrCode()
    {
        return errCode;
    }

    public void setErrCode(String errCode)
    {
        this.errCode = errCode;
    }

    public String getErrMsg()
    {
        return errMsg;
    }

    public void setErrMsg(String errMsg)
    {
        this.errMsg = errMsg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public static <T> ApiResult success()
    {
        return new ApiResult<T>(ResultCode.SUCCESS, null);
    }

    public static <T> ApiResult success(T data)
    {
        return new ApiResult<T>(ResultCode.SUCCESS, data);
    }

    public static <T> ApiResult failure(ResultCode resultCode)
    {
        return new ApiResult<T>(resultCode, null);
    }

    public static <T> ApiResult failure(ResultCode resultCode, T data)
    {
        return new ApiResult<T>(resultCode, data);
    }
}
