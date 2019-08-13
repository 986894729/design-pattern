package com.qin.prototype;

import com.qin.prototype.goods.ClothingGoods;
import com.qin.prototype.goods.DrinkGoods;
import com.qin.prototype.goods.FoodGoods;
import com.qin.prototype.goods.base.BaseGoods;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author by qinganquan
 * @Classname GoodsCache
 * @Description 商品缓存
 * @Date 2019/8/13 11:08
 */
public class GoodsCache {

    public static final Map<Integer, BaseGoods> CACHE_MAP = new ConcurrentHashMap<>();

    public static BaseGoods getGoods(Integer id) throws CloneNotSupportedException {

        BaseGoods baseGoods = CACHE_MAP.get(id);

        return (BaseGoods)baseGoods.clone();
    }

    public static void loadCache(){

        BaseGoods clothingGoods = new ClothingGoods();

        clothingGoods.setId(1);

        clothingGoods.setType("clothing");

        CACHE_MAP.put(clothingGoods.getId(),clothingGoods);

        DrinkGoods drinkGoods = new DrinkGoods();

        drinkGoods.setId(2);

        drinkGoods.setType("drink");

        CACHE_MAP.put(drinkGoods.getId(),drinkGoods);

        FoodGoods foodGoods = new FoodGoods();

        foodGoods.setId(3);

        foodGoods.setType("food");

        CACHE_MAP.put(foodGoods.getId(),foodGoods);

    }

}
