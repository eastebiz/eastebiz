package com.eastebiz.controller;


import com.eastebiz.entity.PackageList;
import com.eastebiz.service.PackageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/packageList")
public class PackageListController {

    @Autowired
    private PackageListService packageListService;

    //查看所有状态包裹
    @RequestMapping("queryAllPackage")
    @ResponseBody
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<PackageList> queryAllPackageById(Integer  userId){
        List<PackageList> packageLists = (List<PackageList>) packageListService.selectAllPackageById(userId);

        System.out.println("根据用户id查询所有状态的包裹");
        return  packageLists;

    }
    //医生查看所有包裹  包裹管理
    @RequestMapping("queryAllPackageByCompanyId")
    @ResponseBody
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<PackageList> queryAllPackage(Integer  companyId){
        List<PackageList> lists = packageListService.selectAllPackageByCompangId(companyId);
        System.out.println("根据医生/公司id查询所有包裹");
        return  lists;

    }


}
