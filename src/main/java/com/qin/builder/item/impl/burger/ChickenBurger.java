package com.qin.builder.item.impl.burger;

import com.qin.builder.item.impl.burger.base.BaseBurger;

import java.math.BigDecimal;

/**
 * @author by qinganquan
 * @Classname ChickenBurger
 * @Description 鸡肉汉堡
 * @Date 2019/8/13 10:04
 */
public class ChickenBurger extends BaseBurger {


    @Override
    public String name() {

        return "Chicken-Burger";
    }

    @Override
    public BigDecimal price() {

        return new BigDecimal("18.00");
    }
}
