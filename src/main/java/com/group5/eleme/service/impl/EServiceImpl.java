package com.group5.eleme.service.impl;

import com.group5.eleme.dao.EDao;
import com.group5.eleme.pojo.*;
import com.group5.eleme.service.EService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("eservice")
public class EServiceImpl implements EService {

    @Resource
    private EDao eDao;

    //地址选择
    public List<Area> getArea() {
        return eDao.getArea();
    }

    //首页
    public List<Shop> selectShop() {
        return eDao.selectShop();
    }

    //注册
    public void doAdd(String userName, String email, String userPwd) {
        eDao.doAdd(userName, email, userPwd);
    }

    //登录
    public User doLogin(String userName, String userPwd) {
        return eDao.doLogin(userName, userPwd);
    }

    //近一个月
    @Override
    public List<recentlyMonth> selectrecentlyMonth() {
        return eDao.selectrecentlyMonth();
    }

    //餐厅
    public List<canting> selectcanting() {
        return eDao.selectcanting();
    }

    //美食
    public List<meishi> selectmeishi() {
        return eDao.selectmeishi();
    }

    //删除
    public void deleteByName(String foodName) {
        eDao.deleteByName(foodName);
    }


}
