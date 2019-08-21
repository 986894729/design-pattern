package com.qin.bridge;

/**
 * @author by qinganquan
 * @Classname BaseCommunication
 * @Description 抽象类
 * @Date 2019/8/21 20:18
 */
public abstract class BaseCommunication {

    private ICommunication communication;

    public BaseCommunication(ICommunication communication) {
        this.communication = communication;
    }

    public void sendMessage(String content,String toUser){
        communication.sendMessage(content,toUser);
    }

}
