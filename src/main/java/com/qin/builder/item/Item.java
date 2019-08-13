package com.qin.builder.item;

import com.qin.builder.packaging.Packaging;

import java.math.BigDecimal;

/**
 * @author by qinganquan
 * @Classname Item
 * @Description 物品
 * @Date 2019/8/13 9:47
 */
public interface Item {

    /**
     * 名称
     * @return
     */
    String name();

    /**
     * 价格
     * @return
     */
    BigDecimal price();

    /**
     * 打包方式
     * @return
     */
    Packaging packaging();

}
