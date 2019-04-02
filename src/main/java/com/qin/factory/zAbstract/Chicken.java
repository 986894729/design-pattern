package com.qin.factory.zAbstract;

/**
 * @author by Tracy
 * @Classname Chicken
 * @Description 小鸡
 * @Date 2019/4/2 15:43
 */
public class Chicken implements Animal{

    @Override
    public void run() {
        System.out.println("chicken start running");
    }
}
