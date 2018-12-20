package com.group5.eleme.pojo;

public class meishi {
    private String foodName;
    private String canting;
    private String price;
    private String dinggou;
    private String renqi;
    private String delete;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCanting() {
        return canting;
    }

    public void setCanting(String canting) {
        this.canting = canting;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDinggou() {
        return dinggou;
    }

    public void setDinggou(String dinggou) {
        this.dinggou = dinggou;
    }

    public String getRenqi() {
        return renqi;
    }

    public void setRenqi(String renqi) {
        this.renqi = renqi;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public meishi() {
    }

    public meishi(String foodName, String canting, String price, String dinggou, String renqi, String delete) {
        this.foodName = foodName;
        this.canting = canting;
        this.price = price;
        this.dinggou = dinggou;
        this.renqi = renqi;
        this.delete = delete;
    }
}
