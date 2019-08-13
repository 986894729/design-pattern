package com.qin.builder.item.impl.drink;

import com.qin.builder.item.impl.drink.base.BaseDrink;

import java.math.BigDecimal;

/**
 * @author by qinganquan
 * @Classname PepsiColaDrink
 * @Description 百事可乐
 * @Date 2019/8/13 10:07
 */
public class PepsiColaDrink extends BaseDrink {


    @Override
    public String name() {

        return "Pepsi Cola";
    }

    @Override
    public BigDecimal price() {

        return new BigDecimal("3.00");
    }
}
