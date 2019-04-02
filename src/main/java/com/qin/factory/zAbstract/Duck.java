package com.qin.factory.zAbstract;

/**
 * @author by Tracy
 * @Classname Duck
 * @Description 小鸭
 * @Date 2019/4/2 15:44
 */
public class Duck implements Animal{

    @Override
    public void run() {
        System.out.println("duck start running");
    }
}
