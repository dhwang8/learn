package com.dream.learn.controller;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.Notification;

import java.util.List;

public class JiguangPush {

    /**
     * 极光推送安卓
     * @param payload payload额外消息体
     * @param msgTitle 消息标题
     * @param msgContent 消息内容
     * @param jgIds 推送的设备的id集
     * @throws APIConnectionException 连接极光服务器异常
     * @throws APIRequestException 发送请求异常
     */
    private void jgPush(String param, String msgTitle, String msgContent, List<String> jgIds) throws APIConnectionException, APIRequestException {
        String APP_KEY = "极光推送appKey";
        String MASTER_SECRET = "极光推送的密钥";
        // 创建JPushClient
        JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY);
        // 创建option
        PushPayload payload = PushPayload.newBuilder().setPlatform(Platform.android()).setAudience(Audience.registrationId(jgIds))
                .setNotification(Notification.newBuilder().addPlatformNotification(
                        AndroidNotification.newBuilder()
                                .addExtra("payload", param) //额外参数
                                .setTitle(msgTitle)
                                .setAlert(msgContent) //消息体
                                .build()).build())
                .setMessage(
                        Message.newBuilder().setMsgContent(msgContent).setTitle(msgTitle)
                                .addExtra("payload", param).build()) // 自定义信息
                .build();
        PushResult pu = jpushClient.sendPush(payload);
        System.out.println("极光推送结果：" + pu.toString());
    }

}
