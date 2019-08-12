package com.qin.singleton.lazy;

/**
 * @author by qinganquan
 * @Classname StaticInnerClassLazySingletonPattern
 * @Description 静态内部类的单例模式的实现，该方式的实现是线程安全的，原理是利用类加载机制保证初始化对象时只有一个线程
 * @Date 2019/8/12 19:09
 */
public class StaticInnerClassLazySingletonPattern {

    /**
     * 定义一个静态内部类
     */
    private static class StaticInnerClassLazySingletonPatternHolder{

        private static StaticInnerClassLazySingletonPattern staticInnerClassLazySingletonPattern = new StaticInnerClassLazySingletonPattern();

    }

    private StaticInnerClassLazySingletonPattern(){

    }

    public static StaticInnerClassLazySingletonPattern getInstance(){

        //只有在调用该方法的时候,单例对象才会被实例化
        return StaticInnerClassLazySingletonPatternHolder.staticInnerClassLazySingletonPattern;
    }

    public void showMessage(){

        System.out.println("print something...");
    }

}
