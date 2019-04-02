package com.qin.factory.zAbstract;

/**
 * @author by Tracy
 * @Classname AnimalFactory
 * @Description 动物工厂类
 * @Date 2019/4/2 15:54
 */
public class AnimalFactory extends AbstractFactory {


    @Override
    public Color getColor(Class clazz) {
        return null;
    }

    @Override
    public Animal getAnimal(Class clazz) {
        if (clazz == null){
            return null;
        }
        try {
            return (Animal) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
