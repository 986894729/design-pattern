package com.qin.prototype.goods;

import com.qin.prototype.goods.base.BaseGoods;

/**
 * @author by qinganquan
 * @Classname FoodGoods
 * @Description 商品
 * @Date 2019/8/13 11:02
 */
public class FoodGoods extends BaseGoods {

    @Override
    public void showType() {

        System.out.println("type:"+super.getType());
    }
}
