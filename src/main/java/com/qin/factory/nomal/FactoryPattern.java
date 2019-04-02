package com.qin.factory.nomal;

import java.util.Optional;

/**
 * @author by Tracy
 * @Classname FactoryPattern
 * @Description 工厂设计模式
 * @Date 2019/4/1 14:45
 */
public class FactoryPattern {

    public static void main(String[] args) {
        Optional.ofNullable(AnimalFactory.getAnimal(AnimalTypeConstant.DOG))
        .ifPresent(Animal::eat);

        Optional.ofNullable(AnimalFactory.getAnimal(AnimalTypeConstant.MONKEY))
                .ifPresent(Animal::eat);

        Optional.ofNullable(AnimalFactory.getAnimal(AnimalTypeConstant.PIG))
                .ifPresent(Animal::eat);

        Optional.ofNullable(AnimalFactory.getAnimalByReflect(Dog.class))
                .ifPresent(Animal::eat);

        Optional.ofNullable(AnimalFactory.getAnimalByReflect(Monkey.class))
                .ifPresent(Animal::eat);

        Optional.ofNullable(AnimalFactory.getAnimalByReflect(Pig.class))
                .ifPresent(Animal::eat);

    }

}
