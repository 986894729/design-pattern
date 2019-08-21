package com.qin.bridge;

/**
 * @author by qinganquan
 * @Classname ComputerCommunication
 * @Description 电脑通讯
 * @Date 2019/8/21 20:38
 */
public class ComputerCommunication extends BaseCommunication{

    public ComputerCommunication(ICommunication communication) {
        super(communication);
    }

    @Override
    public void sendMessage(String content, String toUser){
        System.out.println("在电脑上:");
        super.sendMessage(content,toUser);
    }

}
