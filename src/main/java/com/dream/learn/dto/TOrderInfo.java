package com.dream.learn.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TOrderInfo implements Serializable {

    //订单编号
    private String Id;

    //第三方编号
    private String appkey;

    //第三方订单编号
    private String outOrderId;

    //用户编号
    private String userId;

    //车型编号
    private String carTypeNo;

    //车辆VIN
    private String vin;

    //车牌号码
    private String carLicenseNo;

    //启动类型[
    private Integer startType;

    //桩群编号
    private String stubGroupId;

    //桩编号
    private String stubId;

    //开始电量
    private BigDecimal electricStart;

    //结束电量
    private BigDecimal electricEnd;

    //充电开始时间
    private Date timeStart;

    //充电结束时间
    private Date timeEnd;

    //总费用
    private String feeTotal;

    //服务费用
    private String feeService;

    //电量费用
    private Integer feeElectric;

    //充电类型
    private String chargeType;

    //充电电量
    private String power;

    //停止代码
    private String endCode;

    //停止信息
    private String endInfo;

    //状态[1:充电中,9:充电完成]
    private String status;

    //订单创建时间
    private String createTime;

    //订单修改时间
    private String modifyTime;

    //卡类型
    private String cardType;

    //卡号
    private Integer cardNumber;

    //订单当时的计费和服务费
    private String info;

    //PS:存放不存在VIN的车辆真实VIN码
    private String cspOrderId;

    //费用限制
    private String limitFee;

    //折扣信息
    private String discountInfo;

    //优惠金额
    private String feeDiscount;

    //订单计费信息
    private String totalFeeInfo;

    //是否桩端计费(0:否,1:是)
    private String stubBilling;

    //充电明细:[[开始时间,结束时间,电费价格(折扣后),服务费价格(折扣后),电费价格(折扣前),服务费价格(折扣前),期间充电量,电费(折扣后),服务费(折扣后),电费(折扣前),服务费(折扣前)],...]
    private String chargeDetail;

    //审计标记(0:正常,1:功率不符)
    private Integer auditFlag;

    //审计时间
    private String settleTime;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCarTypeNo() {
        return carTypeNo;
    }

    public void setCarTypeNo(String carTypeNo) {
        this.carTypeNo = carTypeNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarLicenseNo() {
        return carLicenseNo;
    }

    public void setCarLicenseNo(String carLicenseNo) {
        this.carLicenseNo = carLicenseNo;
    }

    public Integer getStartType() {
        return startType;
    }

    public void setStartType(Integer startType) {
        this.startType = startType;
    }

    public String getStubGroupId() {
        return stubGroupId;
    }

    public void setStubGroupId(String stubGroupId) {
        this.stubGroupId = stubGroupId;
    }

    public String getStubId() {
        return stubId;
    }

    public void setStubId(String stubId) {
        this.stubId = stubId;
    }

    public BigDecimal getElectricStart() {
        return electricStart;
    }

    public void setElectricStart(BigDecimal electricStart) {
        this.electricStart = electricStart;
    }

    public BigDecimal getElectricEnd() {
        return electricEnd;
    }

    public void setElectricEnd(BigDecimal electricEnd) {
        this.electricEnd = electricEnd;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getFeeTotal() {
        return feeTotal;
    }

    public void setFeeTotal(String feeTotal) {
        this.feeTotal = feeTotal;
    }

    public String getFeeService() {
        return feeService;
    }

    public void setFeeService(String feeService) {
        this.feeService = feeService;
    }

    public Integer getFeeElectric() {
        return feeElectric;
    }

    public void setFeeElectric(Integer feeElectric) {
        this.feeElectric = feeElectric;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getEndCode() {
        return endCode;
    }

    public void setEndCode(String endCode) {
        this.endCode = endCode;
    }

    public String getEndInfo() {
        return endInfo;
    }

    public void setEndInfo(String endInfo) {
        this.endInfo = endInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCspOrderId() {
        return cspOrderId;
    }

    public void setCspOrderId(String cspOrderId) {
        this.cspOrderId = cspOrderId;
    }

    public String getLimitFee() {
        return limitFee;
    }

    public void setLimitFee(String limitFee) {
        this.limitFee = limitFee;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    public String getFeeDiscount() {
        return feeDiscount;
    }

    public void setFeeDiscount(String feeDiscount) {
        this.feeDiscount = feeDiscount;
    }

    public String getTotalFeeInfo() {
        return totalFeeInfo;
    }

    public void setTotalFeeInfo(String totalFeeInfo) {
        this.totalFeeInfo = totalFeeInfo;
    }

    public String getStubBilling() {
        return stubBilling;
    }

    public void setStubBilling(String stubBilling) {
        this.stubBilling = stubBilling;
    }

    public String getChargeDetail() {
        return chargeDetail;
    }

    public void setChargeDetail(String chargeDetail) {
        this.chargeDetail = chargeDetail;
    }

    public Integer getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(Integer auditFlag) {
        this.auditFlag = auditFlag;
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }
}
