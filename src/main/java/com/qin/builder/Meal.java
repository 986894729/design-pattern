package com.qin.builder;

import com.qin.builder.item.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author by qinganquan
 * @Classname Meal
 * @Description 套餐
 * @Date 2019/8/13 10:11
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void showItems(){

        itemList.forEach(item -> System.out.format("name: %s , price: %s ,packaging: %s",item.name(),item.price().toString(),item.packaging().packaging()));

        System.out.println();
    }

    public void showTotalPrice(){

        BigDecimal totalPrice = new BigDecimal("0.00");
        //求和
        for (Item item : itemList) {
            totalPrice = totalPrice.add(item.price());
        }
        System.out.format("meal total price : %s",totalPrice.toString());
        System.out.println();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
