package com.qin.singleton.lazy;

/**
 * @author by qinganquan
 * @Classname DoubleCheckedLockingLazySingletonPattern
 * @Description 双重校验锁的懒汉式单例模式的实现，该种实现方式的线程安全的
 * @Date 2019/8/12 18:38
 */
public class DoubleCheckedLockingLazySingletonPattern {

    private static volatile DoubleCheckedLockingLazySingletonPattern doubleCheckedLockingLazySingletonPattern;

    private DoubleCheckedLockingLazySingletonPattern(){
        //无参私有的构造方法,防止在外部通过构造方法创建对象
    }

    public static DoubleCheckedLockingLazySingletonPattern getInstance(){
        System.out.println(DoubleCheckedLockingLazySingletonPattern.class);
        //非空判断
        if (doubleCheckedLockingLazySingletonPattern == null){
            //如果为空,则对类进行加锁
            synchronized (DoubleCheckedLockingLazySingletonPattern.class){
                //如果为空、则实例化对象
                if (doubleCheckedLockingLazySingletonPattern == null){
                    doubleCheckedLockingLazySingletonPattern = new DoubleCheckedLockingLazySingletonPattern();
                }
            }
        }
        return doubleCheckedLockingLazySingletonPattern;
    }

    public void showMessage(){

        System.out.println("print something...");
    }


}
