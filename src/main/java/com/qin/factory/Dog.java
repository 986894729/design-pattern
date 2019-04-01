package com.qin.factory;

/**
 * @author by Tracy
 * @Classname Dog
 * @Description 狗狗类
 * @Date 2019/4/1 14:36
 */
public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("dog start eating");
    }
}
