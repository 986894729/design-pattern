package com.qin.singleton.lazy;


/**
 * @Classname LazySingletonPatternMain
 * @Description 非线程安全的懒汉式单例模式的实现
 * @Date 2019/8/12 17:17
 * @author by qinganquan
 */
public class LazySingletonPattern {

    private static LazySingletonPattern lazySingletonPattern;

    private LazySingletonPattern(){
        //无参私有的构造方法,防止在外部通过构造方法创建对象
    }

    /**
     * 该种方式实现的单例模式为非线程安全的
     * @return
     */
    public static LazySingletonPattern getInstance(){
        //非空判断
        if (lazySingletonPattern == null){
            //如果为空则实例化
            lazySingletonPattern = new LazySingletonPattern();
        }
        return lazySingletonPattern;
    }

    public void showMessage(){

        System.out.println("print something...");
    }

}
