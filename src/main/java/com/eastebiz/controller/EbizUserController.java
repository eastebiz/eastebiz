package com.eastebiz.controller;


import com.eastebiz.entity.EbizUser;
import com.eastebiz.service.EbizUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/EbizUser")
public class EbizUserController {

    @Autowired
    private EbizUserSevice ebizUserSevice;



    //注册
    @RequestMapping("/registerEbizUser")
    @ResponseBody
    public String registerEbizUser(EbizUser ebizUser){

        //创建用户的注册时间
        Date createTime  = new java.util.Date();
        ebizUser.setCreateTime(createTime);
        //调用方法
        ebizUserSevice.registerEbizUser(ebizUser);
        return "ok";
    }


    //登录
    @RequestMapping("/loginEbizUser")
    @ResponseBody
    public String loginEbizUser(EbizUser ebizUser, HttpSession session){
        //得到数据
        EbizUser newEbizUser = ebizUserSevice.loginEbizUser(ebizUser);
        if(newEbizUser!=null){
            //把用户存进session
            session.setAttribute("EbizUser",newEbizUser);

            //修改登录时间
            Integer id = newEbizUser.getId();
            ebizUserSevice.updateTime(id,new java.util.Date());
            return "ok";
        }
        return "NO";
    }

    //查询用户是否是存在
    @RequestMapping("/queryOneUerName")
    @ResponseBody
    public String queryOneUerName(String uerName){
        EbizUser ebizUser = ebizUserSevice.queryOneUerName(uerName);
        if(ebizUser==null){
            return "ok";
        }
        return "no";
    }

    //修改
    @RequestMapping("/amendEbizUser")
    @ResponseBody
    public String amendEbizUser(EbizUser ebizUser){
        ebizUserSevice.updateEbizUser(ebizUser);
        return "OK";
    }
}
