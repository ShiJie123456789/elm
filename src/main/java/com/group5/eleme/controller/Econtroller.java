package com.group5.eleme.controller;

import com.group5.eleme.pojo.*;
import com.group5.eleme.service.EService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Econtroller {

    @Resource
    private EService eService;

    //进入首页的登录
    @RequestMapping("/areaLogin")
    public ModelAndView getArea() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("areaLogin");
        List<Area> list = eService.getArea();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    //首页的登录
    @RequestMapping("/firstLogin/{areaName}")
    public ModelAndView firstLogin(@PathVariable String areaName) {
        ModelAndView modelAndView = new ModelAndView();
        List<Shop> list = eService.selectShop();
        modelAndView.setViewName("firstLogin");
        modelAndView.addObject("areaName", areaName);
        modelAndView.addObject("shop", list);
        return modelAndView;
    }


    //跳转注册页面
    @RequestMapping("/addUser")
    public String addUser() {
        return "add";
    }

    //跳转登陆页面
    @RequestMapping("/login")
    public String doLogin() {
        return "login";
    }

    //跳转建议页面
    @RequestMapping("/jianyi")
    public String jianyi() {
        return "jianyi";
    }

    //跳转客服页面
    @RequestMapping("/kefu")
    public String kefu() {
        return "kefu";
    }

    //跳转下单页面
    @RequestMapping("/payment")
    public String payment() {
        return "index";
    }

    //近一个月
    @RequestMapping("/recentlyMonth")
    public ModelAndView selectrecentlyMonth() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("recentlyMonth");
        List<recentlyMonth> list = eService.selectrecentlyMonth();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    //餐厅
    @RequestMapping("/canting")
    public ModelAndView canting() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("canting");
        List<canting> list = eService.selectcanting();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @RequestMapping("/meishi")
    public ModelAndView meishi() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("meishi");
        List<meishi> list = eService.selectmeishi();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @RequestMapping("/deleteByName/{foodName}")
    public String deleteByName(@PathVariable String foodName) {
        eService.deleteByName(foodName);
        return "forward:/meishi";
    }

    //跳转不评价页面
    @RequestMapping("/nopingjia")
    public String nopingjia() {
        return "nopingjia";
    }

    //跳转退单页面
    @RequestMapping("/tuidan")
    public String tuidan() {
        return "tuidan";
    }

    //一个月之前页面
    @RequestMapping("/getShop")
    public String getShop() {
        return "getShop";
    }

    //跳转商品详情页面
    @RequestMapping("/getShopAll/{shopName}")
    public ModelAndView getShopAll(@PathVariable String shopName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("shopName", shopName);
        modelAndView.setViewName("shopMost");
        return modelAndView;
    }

    //登陆的方法
    @RequestMapping("/doLogin")
    public Object doLogin(@RequestParam String userName, @RequestParam String userPwd) {
        User user = eService.doLogin(userName, userPwd);
        if (user != null) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("areaLogin");
            List<Area> list = eService.getArea();
            modelAndView.addObject("list", list);
            return modelAndView;
        } else {
            //System.out.println("<script type='text/javascript'>alert('登录失败！');</script>");
            return "forward:/addUser";
        }
    }

    //注册的方法
    @RequestMapping(value = "/doAdd",method = RequestMethod.POST)
    public String doAdd(@RequestParam String userName, @RequestParam String email, @RequestParam String userPwd) {
        eService.doAdd(userName, email, userPwd);
        return "login";
    }
    //注册的方法
    @RequestMapping(value = "/doAdd2")
    public String doAdd2() {
        return "login";
    }

}
