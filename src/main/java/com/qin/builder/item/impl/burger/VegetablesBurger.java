package com.qin.builder.item.impl.burger;

import com.qin.builder.item.impl.burger.base.BaseBurger;

import java.math.BigDecimal;

/**
 * @author by qinganquan
 * @Classname VegetablesBurger
 * @Description 蔬菜汉堡
 * @Date 2019/8/13 10:03
 */
public class VegetablesBurger extends BaseBurger {

    @Override
    public String name() {

        return "Vegetables-Burger";
    }

    @Override
    public BigDecimal price() {

        return new BigDecimal("8.00");
    }
}
