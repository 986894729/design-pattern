package com.qin.bridge;

/**
 * @author by qinganquan
 * @Classname PadCommunication
 * @Description 在平台上通讯
 * @Date 2019/8/21 20:39
 */
public class PadCommunication extends BaseCommunication{

    public PadCommunication(ICommunication communication) {
        super(communication);
    }

    @Override
    public void sendMessage(String content, String toUser){
        System.out.println("在平台上:");
        super.sendMessage(content,toUser);
    }

}
