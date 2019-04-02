package com.qin.factory.nomal;

/**
 * @author by Tracy
 * @Classname AnimalFactory
 * @Description 猴子类
 * @Date 2019/4/1 14:38
 */
public class AnimalFactory {

    public static Animal getAnimal(String type){

        if (AnimalTypeConstant.DOG.equals(type)){
            return new Dog();
        }else if(AnimalTypeConstant.MONKEY.equals(type)){
            return new Monkey();
        }else if(AnimalTypeConstant.PIG.equals(type)){
            return new Pig();
        }
        return null;
    }

    public static Animal getAnimalByReflect(Class clazz){
        if (clazz == null){
            return null;
        }
        try {
            return (Animal) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
