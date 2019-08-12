package com.qin.singleton.lazy;

/**
 * @author by qinganquan
 * @Classname LazyAndThreadSecuritySingletonPattern
 * @Description 线程安全的懒汉式单例模式的实现
 * @Date 2019/8/12 18:29
 */
public class LazyAndThreadSecuritySingletonPattern {

    private static LazyAndThreadSecuritySingletonPattern lazyAndThreadSecuritySingletonPattern;

    private LazyAndThreadSecuritySingletonPattern(){
        //无参私有的构造方法,防止在外部通过构造方法创建对象
    }
    public static synchronized LazyAndThreadSecuritySingletonPattern getInstance(){

        if (lazyAndThreadSecuritySingletonPattern == null){
            lazyAndThreadSecuritySingletonPattern = new LazyAndThreadSecuritySingletonPattern();
        }
        return lazyAndThreadSecuritySingletonPattern;
    }

    public void showMessage(){

        System.out.println("print something...");
    }

}
