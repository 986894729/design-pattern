package com.qin.prototype.goods;

import com.qin.prototype.goods.base.BaseGoods;

/**
 * @author by qinganquan
 * @Classname ClothingGoods
 * @Description 服装
 * @Date 2019/8/13 10:59
 */
public class ClothingGoods extends BaseGoods {

    @Override
    public void showType() {

        System.out.println("type:"+super.getType());
    }
}
