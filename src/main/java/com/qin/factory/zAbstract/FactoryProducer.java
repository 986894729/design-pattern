package com.qin.factory.zAbstract;

/**
 * @author by Tracy
 * @Classname FactoryProducer
 * @Description 工厂类
 * @Date 2019/4/2 15:59
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(Class clazz){

        if (clazz == null){
            return null;
        }
        try {
            return (AbstractFactory)clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

}
