package com.qin.builder.item.impl.burger.base;

import com.qin.builder.item.Item;
import com.qin.builder.packaging.Packaging;
import com.qin.builder.packaging.impl.Wrapper;

/**
 * @author by qinganquan
 * @Classname BaseBurger
 * @Description 汉堡
 * @Date 2019/8/13 9:58
 */
public abstract class BaseBurger implements Item {

    @Override
    public Packaging packaging() {

        return new Wrapper();
    }
}
