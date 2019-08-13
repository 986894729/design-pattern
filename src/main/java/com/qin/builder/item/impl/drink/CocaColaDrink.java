package com.qin.builder.item.impl.drink;

import com.qin.builder.item.impl.drink.base.BaseDrink;

import java.math.BigDecimal;

/**
 * @author by qinganquan
 * @Classname CocaColaDrink
 * @Description 百事可乐
 * @Date 2019/8/13 10:06
 */
public class CocaColaDrink extends BaseDrink {

    @Override
    public String name() {

        return "Coca Cola";
    }

    @Override
    public BigDecimal price() {

        return new BigDecimal("2.50");
    }
}
