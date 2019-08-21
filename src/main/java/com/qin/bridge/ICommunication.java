package com.qin.bridge;

/**
 * @author by qinganquan
 * @Classname ICommunication
 * @Description 通讯接口
 * @Date 2019/8/21 20:13
 */
public interface ICommunication {

    /**
     * 发消息
     * @param content
     * @param toUser
     */
    void sendMessage(String content, String toUser);

}
