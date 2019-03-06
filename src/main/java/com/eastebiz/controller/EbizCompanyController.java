package com.eastebiz.controller;


import com.eastebiz.entity.EbizCompany;
import com.eastebiz.service.EbizCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/EbizCompany")
public class EbizCompanyController {

    @Autowired
    private EbizCompanyService ebizCompanyService;

    //注册
    @RequestMapping("/registerEbizCompany")
    @ResponseBody
    public String registerEbizCompany(EbizCompany ebizCompany){
        Date date = new java.util.Date();
        ebizCompany.setCreateTime(date);
        ebizCompanyService.registerEbizCompany(ebizCompany);
        return "ok";
    }


    //登陆
    @RequestMapping("/loginCompanyNameAndPassdord")
    @ResponseBody
    public String loginCompanyNameAndPassdord(EbizCompany ebizCompany, HttpSession session){
        EbizCompany newEbizCompany = ebizCompanyService.loginCompanyNameAndPassdord(ebizCompany);
        if(newEbizCompany!=null){
            //把用户存进session
            session.setAttribute("EbizCompany",newEbizCompany);


            //修改时间
            Integer id = newEbizCompany.getId();

            ebizCompanyService.amendAndUpdateTime(id,new java.util.Date());

            return "ok";
        }
        return "no";

    }


    //查询公司名称是否存在
    @RequestMapping("/queryOneCompanyName")
    @ResponseBody
    public String queryOneCompanyName(String companyName){
        EbizCompany ebizCompany = ebizCompanyService.queryOneCompanyName(companyName);
        if(ebizCompany==null){
            return "ok";
        }
        return "no";

    }

    @RequestMapping("/queryOneOwerName")
    @ResponseBody
    //查询医生名称是否存在
    public String queryOneOwerName(String owerName){
        EbizCompany ebizCompany = ebizCompanyService.queryOneOwerName(owerName);
        if(ebizCompany==null){
            return "ok";
        }
        return "no";
    }

    @RequestMapping("/amendEbizCompany")
    @ResponseBody
    //修改信息
    public String amendEbizCompany(EbizCompany ebizCompany){
        ebizCompanyService.amendEbizCompany(ebizCompany);
        return "ok";
    }
}
