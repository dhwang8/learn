package com.dream.learn.utils;

public enum ResultCode
{
    /**
     * 成功
     */
    SUCCESS("200", "成功"),

    /**
     * 操作失败
     */
    FAIL("500", "操作失败"),

    /**
     * 数据已存在
     */
    SUCCESS_IS_HAVE("208", "数据已存在"),

    /**
     * 没有结果
     */
    NOT_DATA("911", "没有结果"),

    /**
     * 没有登录
     */
    NOT_LOGIN("600", "没有登录"),

    /**
     * 发生异常
     */
    NULL_PARAM("400", "参数为空"),

    /**
     * 发生异常
     */
    EXCEPTION("401", "发生异常"),

    /**
     * 系统错误
     */
    SYS_ERROR("402", "系统错误"),

    /**
     * 参数错误
     */
    PARAMS_ERROR("403", "参数错误 "),

    /**
     * 不支持或已经废弃
     */
    NOT_SUPPORTED("410", "不支持或已经废弃"),

    /**
     * AuthCode错误
     */
    INVALID_AUTHCODE("444", "无效的AuthCode"),

    /**
     * 太频繁的调用
     */
    TOO_FREQUENT("445", "太频繁的调用"),

    /**
     * 未知的错误
     */
    UNKNOWN_ERROR("499", "未知错误"),

    /**
     * 未设置方法
     */
    NOT_METHOD("4004", "未设置方法"),

    /**
     * 请重新短信获取验证码
     */
    RETRIEVE_SMS_VERIFICATION_CODE("4005", "请重新短信获取验证码"),

    /**
     * 未设置方法
     */
    VERIFICATION_CODE_ERROR("4006", "验证码错误"),

    /**
     * 未设置方法
     */
    VERIFICATION_CODE_EXPIRED("4007", "验证码过期"),

    UNKONW_ERROR("-1", "未知错误"),

    OUT_TRADE_NO_IS_NULL("601", "订单编号为空"),

    TOTAL_AMOUNT_IS_NULL("600", "订单金额为空"),

    ALIPAY_ORDER_FAIL("603", "支付宝下单失败"),

    NO_ACCESS("604", "错误,没有访问权限"),

    ERROR("1", "失败"),
    
    /**此用户不存在*/
    NO_USER("610","此用户不存在"),
    
    /**用户名或者密码不正确**/
    USERNAME_PASSWORD("611","用户名或者密码不正确"),
    
    /**请输入用户名**/
    INPUT_USERNAME("612","请输入用户名"),
    
    /**恶意攻击**/
    MALICIOUS_CODE("699","恶意攻击"),
    
    OTHER_ERROR("401", "其它错误");
    ;

    private String code;
    private String message;

    ResultCode(String code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public String getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
