package com.group5.eleme.dao;

import com.group5.eleme.pojo.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EDao {

    //地址选择页
    @Select("select * from area")
    List<Area> getArea();

    //首页
    @Select("select * from shop")
    List<Shop> selectShop();

    //注册
    @Insert("insert into user(userName,userPwd,email) values(#{userName},#{userPwd},#{email})")
    void doAdd(@Param("userName") String userName, @Param("email") String email, @Param("userPwd") String userPwd);

    //登陆
    @Select("select * from user where userName = #{userName} and userPwd = #{userPwd}")
    User doLogin(@Param("userName") String userName, @Param("userPwd") String userPwd);

    //近一个月
    @Select("select * from recentlyMonth")
    List<recentlyMonth> selectrecentlyMonth();

    //餐厅
    @Select("select * from canting")
    List<canting> selectcanting();

    //美食
    @Select("select * from meishi")
    List<meishi> selectmeishi();

    //删除
    @Delete("delete from meishi where foodName=#{foodName}")
    void deleteByName(String foodName);
}
