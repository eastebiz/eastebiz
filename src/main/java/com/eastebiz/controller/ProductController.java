package com.eastebiz.controller;

import com.eastebiz.entity.Product;
import com.eastebiz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private ProductService productService;


    //添加
    @RequestMapping("/registerProduct")
    @ResponseBody
    public String registerProduct(Product product){
        productService.registerProduct(product);
        return "";
    }

    //修改
    @RequestMapping("/amendbProduct")
    @ResponseBody
    public String amendbProduct(Product product){
        productService.amendbProduct(product);
        return "";
    }

    //使用属性条件模糊查询
    @RequestMapping("/queryAllNameAndValue")
    @ResponseBody
    public String queryAllNameAndValue(Integer ebizcompanyId, String name , String value){
        List<Product> products = productService.queryAllNameAndValue(ebizcompanyId, name, value);
        return "";
    }

    //根据提供的条件进行模糊查询  全部的查询
    @RequestMapping("/queryAllValue")
    @ResponseBody
    public String queryAllValue(Integer ebizcompanyId,String value){
        List<Product> products = productService.queryAllValue(ebizcompanyId, value);
        return "";
    }

    //根据状态查询
    @RequestMapping("/queryAndStatus")
    @ResponseBody
    public String queryAndStatus(String status){
        List<Product> products = productService.queryAndStatus(status);
        return "";
    }

    //根据公司ID查询公司旗下有多少产品
    @RequestMapping("/seclectAllEbizcompanyId")
    @ResponseBody
    public String seclectAllEbizcompanyId(Integer ebizcompanyId){
        List<Product> products = productService.seclectAllEbizcompanyId(ebizcompanyId);
        return "";
    }
}
