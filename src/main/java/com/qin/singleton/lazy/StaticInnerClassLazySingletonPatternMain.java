package com.qin.singleton.lazy;

/**
 * @author by qinganquan
 * @Classname StaticInnerClassLazySingletonPatternMain
 * @Description 静态内部类的单例模式的运行口
 * @Date 2019/8/12 19:13
 */
public class StaticInnerClassLazySingletonPatternMain {

    public static void main(String[] args) {

        //获取单例对象
        StaticInnerClassLazySingletonPattern staticInnerClassLazySingletonPattern = StaticInnerClassLazySingletonPattern.getInstance();

        //调用方法
        staticInnerClassLazySingletonPattern.showMessage();
    }

}
