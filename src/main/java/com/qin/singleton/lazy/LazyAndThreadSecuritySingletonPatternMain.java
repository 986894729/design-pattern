package com.qin.singleton.lazy;

/**
 * @author by qinganquan
 * @Classname LazyAndThreadSecuritySingletonPatternMain
 * @Description 线程安全的懒汉式单例模式的运行入口
 * @Date 2019/8/12 18:32
 */
public class LazyAndThreadSecuritySingletonPatternMain {

    public static void main(String[] args) {

        //获取单例对象
        LazyAndThreadSecuritySingletonPattern lazyAndThreadSecuritySingletonPattern = LazyAndThreadSecuritySingletonPattern.getInstance();
        //执行方法
        lazyAndThreadSecuritySingletonPattern.showMessage();

    }

}
