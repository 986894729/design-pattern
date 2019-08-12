package com.qin.singleton.lazy;

/**
 * @Classname LazySingletonPatternMain
 * @Description 非线程安全的懒汉式单利模式运行入口
 * @Date 2019/8/12 17:17
 * @author by qinganquan
 */
public class LazySingletonPatternMain {

    public static void main(String[] args) {

        //单利创建
        LazySingletonPattern lazySingletonPattern = LazySingletonPattern.getInstance();
        //调用方法
        lazySingletonPattern.showMessage();

    }


}
