package com.qin.prototype.goods;

import com.qin.prototype.goods.base.BaseGoods;

/**
 * @author by qinganquan
 * @Classname DrinkGoods
 * @Description 饮料
 * @Date 2019/8/13 11:03
 */
public class DrinkGoods extends BaseGoods {

    @Override
    public void showType() {

        System.out.println("type:"+super.getType());
    }
}