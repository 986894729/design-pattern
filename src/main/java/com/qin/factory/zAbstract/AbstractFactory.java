package com.qin.factory.zAbstract;

/**
 * @author by Tracy
 * @Classname AbstractFactory
 * @Description 抽象工厂类,用于存放工厂类
 * @Date 2019/4/2 15:52
 */
public abstract class AbstractFactory {

    public abstract Color getColor(Class clazz);

    public abstract Animal getAnimal(Class clazz);

}
