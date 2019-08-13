package com.qin.builder;

import com.qin.builder.item.Item;
import com.qin.builder.item.impl.burger.ChickenBurger;
import com.qin.builder.item.impl.drink.CocaColaDrink;
import com.qin.builder.item.impl.drink.PepsiColaDrink;

import java.util.List;

/**
 * @author by qinganquan
 * @Classname MealBuilder
 * @Description 套餐构建者
 * @Date 2019/8/13 10:20
 */
public class MealBuilder {

    /**
     * 构建鸡肉汉堡+百事可乐的套餐
     * @return
     */
    public static Meal buildChickenPepsiMeal(){
        //创建一个套餐对象
        Meal meal = new Meal();
        //获取商品条目集合
        List<Item> itemList = meal.getItemList();
        //添加鸡肉汉堡
        itemList.add(new ChickenBurger());
        //添加百事可乐
        itemList.add(new PepsiColaDrink());
        //返回构建的套餐对象
        return meal;
    }

    /**
     * 构建鸡肉汉堡+可口可乐的套餐
     * @return
     */
    public static Meal buildChickenCocaMeal(){
        //创建一个套餐对象
        Meal meal = new Meal();
        //获取商品条目集合
        List<Item> itemList = meal.getItemList();
        //添加鸡肉汉堡
        itemList.add(new ChickenBurger());
        //添加百事可乐
        itemList.add(new CocaColaDrink());
        //返回构建的套餐对象
        return meal;
    }

}
