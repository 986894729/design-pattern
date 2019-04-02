package com.qin.factory.zAbstract;

/**
 * @author by Tracy
 * @Classname ColorFactory
 * @Description 颜色工厂
 * @Date 2019/4/2 15:56
 */
public class ColorFactory extends AbstractFactory{


    @Override
    public Color getColor(Class clazz) {
        if (clazz == null){
            return null;
        }
        try {
            return (Color) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Animal getAnimal(Class clazz) {
        return null;
    }
}
