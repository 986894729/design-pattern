package com.qin.singleton.hungry;

/**
 * @Classname HungrySingletonPattern
 * @Description 饿汉式单例模式的实现、该方式是基于类加载机制避免了多线程同步的问题、但是在类加载的时候就实例化了,会浪费内存
 * @Date 2019/8/12 18:21
 * @author by qinganquan
 */
public class HungrySingletonPattern {

    private static HungrySingletonPattern hungrySingletonPattern = new HungrySingletonPattern();

    private HungrySingletonPattern(){
        //无参私有的构造方法,防止在外部通过构造方法创建对象
    }

    public static HungrySingletonPattern getInstance(){
        //返回单例对象
        return hungrySingletonPattern;
    }

    public void showMessage(){

        System.out.println("print something...");
    }

}
