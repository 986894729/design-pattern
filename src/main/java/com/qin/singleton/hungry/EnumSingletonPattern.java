package com.qin.singleton.hungry;

/**
 * @author by qinganquan
 * @Classname EnumSingletonPattern
 * @Description 利用枚举实现的单例模式，该方式实现的单例模式是线程安全的
 * @Date 2019/8/12 19:15
 */
public enum  EnumSingletonPattern {

    /**
     * 实例
     */
    INSTANCE;

    public void showMessage(){

        System.out.println("print something...");
    }

}
