package com.group5.eleme.service;

import com.group5.eleme.pojo.*;

import java.util.List;

public interface EService {
    //地址选择
    List<Area> getArea();

    //首页
    List<Shop> selectShop();

    //注册
    void doAdd(String userName, String email, String userPwd);

    //登陆
    User doLogin(String userName, String userPwd);

    //近一个月
    List<recentlyMonth> selectrecentlyMonth();

    //餐厅
    List<canting> selectcanting();

    //美食
    List<meishi> selectmeishi();

    //删除食品
    void deleteByName(String foodName);
}
