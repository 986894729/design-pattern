package com.qin.builder;

/**
 * @author by qinganquan
 * @Classname MealBuilderMain
 * @Description 建造者设计模式的运行入口
 * @Date 2019/8/13 10:27
 */
public class MealBuilderMain {

    public static void main(String[] args) {

        //构建鸡肉+百事可乐的套餐
        Meal chickenPepsiMeal = MealBuilder.buildChickenPepsiMeal();

        //打印套餐的所有商品
        chickenPepsiMeal.showItems();

        //打印套餐的价格
        chickenPepsiMeal.showTotalPrice();

        //构建鸡肉+可口可乐的套餐
        Meal chickenCocaMeal = MealBuilder.buildChickenCocaMeal();

        //打印套餐的所有商品
        chickenCocaMeal.showItems();

        //打印套餐的价格
        chickenCocaMeal.showTotalPrice();
    }

}
