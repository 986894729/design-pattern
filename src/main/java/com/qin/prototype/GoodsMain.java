package com.qin.prototype;

import com.qin.prototype.goods.base.BaseGoods;

/**
 * @author by qinganquan
 * @Classname GoodsMain
 * @Description 原型设计模式运行入口
 * @Date 2019/8/13 11:05
 */
public class GoodsMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        GoodsCache.loadCache();

        BaseGoods clothingGoods = GoodsCache.getGoods(1);

        clothingGoods.showType();

        BaseGoods drinkGoods = GoodsCache.getGoods(2);

        drinkGoods.showType();

        BaseGoods foodGoods = GoodsCache.getGoods(3);

        foodGoods.showType();

    }
}
