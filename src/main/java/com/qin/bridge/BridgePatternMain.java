package com.qin.bridge;

/**
 * @author by qinganquan
 * @Classname BridgePatternMain
 * @Description 桥接模式运行入口
 * @Date 2019/8/21 20:20
 */
public class BridgePatternMain {

    public static void main(String[] args) {

        ICommunication qqCommunication = new QqCommunication();
        BaseCommunication cellphoneCommunication = new CellphoneCommunication(qqCommunication);
        cellphoneCommunication.sendMessage("你好！","马化腾");

        ICommunication weChatCommunication = new WeChatCommunication();
        BaseCommunication cellphoneWeChatCommunication = new CellphoneCommunication(weChatCommunication);
        cellphoneWeChatCommunication.sendMessage("你好！","张小龙！");

    }

}
