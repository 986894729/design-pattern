package com.qin.singleton.hungry;

/**
 * @author by qinganquan
 * @Classname EnumSingletonPatternMain
 * @Description 利用枚举实现的单例模式的运行入口
 * @Date 2019/8/12 19:17
 */
public class EnumSingletonPatternMain {

    public static void main(String[] args) {

        //获取单例对象
        EnumSingletonPattern enumSingletonPattern = EnumSingletonPattern.INSTANCE;

        //调用方法
        enumSingletonPattern.showMessage();
    }
}
