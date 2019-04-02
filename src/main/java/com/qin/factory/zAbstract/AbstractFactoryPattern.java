package com.qin.factory.zAbstract;

import java.util.Optional;

/**
 * @author by Tracy
 * @Classname AbstractFactoryPattern
 * @Description 抽象工厂模式
 * @Date 2019/4/2 16:02
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {

        AbstractFactory animalFactory = FactoryProducer.getFactory(AnimalFactory.class);

        Optional.ofNullable(animalFactory)
                .map(animalFactoryOp -> animalFactory.getAnimal(Chicken.class))
                .ifPresent(Animal::run);

        Optional.ofNullable(animalFactory)
                .map(animalFactoryOp -> animalFactory.getAnimal(Goose.class))
                .ifPresent(Animal::run);

        Optional.ofNullable(animalFactory)
                .map(animalFactoryOp -> animalFactory.getAnimal(Duck.class))
                .ifPresent(Animal::run);

        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);

        Optional.ofNullable(colorFactory)
                .map(animalFactoryOp -> colorFactory.getColor(Black.class))
                .ifPresent(Color::fill);

        Optional.ofNullable(colorFactory)
                .map(animalFactoryOp -> colorFactory.getColor(Pink.class))
                .ifPresent(Color::fill);

        Optional.ofNullable(colorFactory)
                .map(animalFactoryOp -> colorFactory.getColor(Red.class))
                .ifPresent(Color::fill);

    }


}
