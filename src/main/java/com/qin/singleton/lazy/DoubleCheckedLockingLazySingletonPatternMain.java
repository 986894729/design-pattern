package com.qin.singleton.lazy;

/**
 * @author by qinganquan
 * @Classname DoubleCheckedLockingLazySingletonPatternMain
 * @Description 双重校验锁单例模式的运行入口
 * @Date 2019/8/12 19:00
 */
public class DoubleCheckedLockingLazySingletonPatternMain {

    public static void main(String[] args) {

        //获取单例对象
        DoubleCheckedLockingLazySingletonPattern doubleCheckedLockingLazySingletonPattern = DoubleCheckedLockingLazySingletonPattern.getInstance();

        //调用方法
        doubleCheckedLockingLazySingletonPattern.showMessage();
    }

}
