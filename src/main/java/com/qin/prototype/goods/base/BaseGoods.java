package com.qin.prototype.goods.base;

/**
 * @author by qinganquan
 * @Classname BaseGoods
 * @Description 商品
 * @Date 2019/8/13 10:53
 */
public abstract class BaseGoods implements Cloneable{

    /**
     * id
     */
    private Integer id;

    /**
     * 类型
     */
    private String type;

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    /**
     * 打印名称
     */
    public abstract void showType();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
