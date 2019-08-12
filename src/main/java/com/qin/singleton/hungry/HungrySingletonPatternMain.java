package com.qin.singleton.hungry;

/**
 * @Classname HungrySingletonPatternMain
 * @Description 饿汉式单例模式运行入口
 * @Date 2019/8/12 18:23
 * @author  by qinganquan
 */
public class HungrySingletonPatternMain {

    public static void main(String[] args) {

        //获取单例对象
        HungrySingletonPattern hungrySingletonPattern = HungrySingletonPattern.getInstance();
        //调用方法
        hungrySingletonPattern.showMessage();

    }

}
