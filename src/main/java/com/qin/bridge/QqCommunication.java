package com.qin.bridge;

/**
 * @author by qinganquan
 * @Classname QqCommunication
 * @Description 发送qq消息
 * @Date 2019/8/21 20:35
 */
public class QqCommunication implements ICommunication {


    @Override
    public void sendMessage(String content, String toUser) {
        System.out.println("用qq把:"+"\""+content+"\"发送给"+"\""+toUser+"\"！");
    }
}
