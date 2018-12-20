package com.group5.eleme.pojo;

import java.io.Serializable;
import java.util.Date;

public class recentlyMonth implements Serializable {
    private String cantingName;
    private String edanhao;
    private Date xiadanTime;
    private String cantingPhone;
    private String cantingAddress;
    private String lianxiPhone;
    private String edanbeizhu;

    public String getCantingName() {
        return cantingName;
    }

    public void setCantingName(String cantingName) {
        this.cantingName = cantingName;
    }

    public String getEdanhao() {
        return edanhao;
    }

    public void setEdanhao(String edanhao) {
        this.edanhao = edanhao;
    }

    public Date getXiadanTime() {
        return xiadanTime;
    }

    public void setXiadanTime(Date xiadanTime) {
        this.xiadanTime = xiadanTime;
    }

    public String getCantingPhone() {
        return cantingPhone;
    }

    public void setCantingPhone(String cantingPhone) {
        this.cantingPhone = cantingPhone;
    }

    public String getCantingAddress() {
        return cantingAddress;
    }

    public void setCantingAddress(String cantingAddress) {
        this.cantingAddress = cantingAddress;
    }

    public String getLianxiPhone() {
        return lianxiPhone;
    }

    public void setLianxiPhone(String lianxiPhone) {
        this.lianxiPhone = lianxiPhone;
    }

    public String getEdanbeizhu() {
        return edanbeizhu;
    }

    public void setEdanbeizhu(String edanbeizhu) {
        this.edanbeizhu = edanbeizhu;
    }

    public recentlyMonth() {
    }

    public recentlyMonth(String cantingName, String edanhao, Date xiadanTime, String cantingPhone, String cantingAddress, String lianxiPhone, String edanbeizhu) {
        this.cantingName = cantingName;
        this.edanhao = edanhao;
        this.xiadanTime = xiadanTime;
        this.cantingPhone = cantingPhone;
        this.cantingAddress = cantingAddress;
        this.lianxiPhone = lianxiPhone;
        this.edanbeizhu = edanbeizhu;
    }
}
