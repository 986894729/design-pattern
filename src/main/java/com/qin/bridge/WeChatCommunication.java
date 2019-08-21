package com.qin.bridge;

/**
 * @author by qinganquan
 * @Classname WeChatCommunication
 * @Description 发微信消息
 * @Date 2019/8/21 20:35
 */
public class WeChatCommunication implements ICommunication{


    @Override
    public void sendMessage(String content, String toUser) {

        System.out.println("用微信把:"+"\""+content+"\"发送给"+"\""+toUser+"\"！");
    }
}
