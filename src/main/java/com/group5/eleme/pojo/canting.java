package com.group5.eleme.pojo;

public class canting {
    private String no;
    private String name;
    private String cantingzhuangtai;
    private String mang;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCantingzhuangtai() {
        return cantingzhuangtai;
    }

    public void setCantingzhuangtai(String cantingzhuangtai) {
        this.cantingzhuangtai = cantingzhuangtai;
    }

    public String getMang() {
        return mang;
    }

    public void setMang(String mang) {
        this.mang = mang;
    }

    public canting() {
    }

    public canting(String no, String name, String cantingzhuangtai, String mang) {
        this.no = no;
        this.name = name;
        this.cantingzhuangtai = cantingzhuangtai;
        this.mang = mang;
    }
}
