package com.group5.eleme.pojo;

public class Shop {
    //属性

    private Integer shopID;//商品ID
    private String  shopName;  //商品姓名
    private String shopPrise;  //商品价钱
    private String shopMost;   //商品详情
    //属性封装

    public Integer getShopID() {
        return shopID;
    }

    public void setShopID(Integer shopID) {
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPrise() {
        return shopPrise;
    }

    public void setShopPrise(String shopPrise) {
        this.shopPrise = shopPrise;
    }

    public String getShopMost() {
        return shopMost;
    }

    public void setShopMost(String shopMost) {
        this.shopMost = shopMost;
    }
}
