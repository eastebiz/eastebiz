package com.eastebiz.controller;


import com.eastebiz.entity.EbizUser;
import com.eastebiz.service.EbizUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/EbizUser")
public class EbizUserControllre {

    @Autowired
    private EbizUserSevice ebizUserSevice;



    //注册
    @RequestMapping("/registerEbizUser")
    @ResponseBody
    public String registerEbizUser(EbizUser ebizUser){

        ebizUserSevice.registerEbizUser(ebizUser);
        return "ok";
    }


    //登录
    @RequestMapping("/loginEbizUser")
    @ResponseBody
    public String loginEbizUser(EbizUser ebizUser, HttpSession session){
        EbizUser user = ebizUserSevice.loginEbizUser(ebizUser);

        //把用户存进session
        session.setAttribute("EbizUser",user);

        return "ok";
    }
}
