package com.qin.bridge;

/**
 * @author by qinganquan
 * @Classname CellphoneCommunication
 * @Description 在手机上通讯
 * @Date 2019/8/21 20:40
 */
public class CellphoneCommunication extends BaseCommunication{

    public CellphoneCommunication(ICommunication communication) {
        super(communication);
    }

    @Override
    public void sendMessage(String content, String toUser){
        System.out.println("在手机上");
        super.sendMessage(content,toUser);
    }
}
