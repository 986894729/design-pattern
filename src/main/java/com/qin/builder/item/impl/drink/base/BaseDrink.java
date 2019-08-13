package com.qin.builder.item.impl.drink.base;

import com.qin.builder.item.Item;
import com.qin.builder.packaging.Packaging;
import com.qin.builder.packaging.impl.Bottled;

/**
 * @author by qinganquan
 * @Classname BaseDrink
 * @Description 饮料
 * @Date 2019/8/13 9:59
 */
public abstract class BaseDrink implements Item {

    @Override
    public Packaging packaging() {

        return new Bottled();
    }
}
