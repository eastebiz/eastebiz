package com.eastebiz.service;

import com.eastebiz.entity.EbizCompany;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface EbizCompanyService {

    //注册
    public void registerEbizCompany(EbizCompany ebizCompany);
    //登陆
    public EbizCompany loginCompanyNameAndPassdord(EbizCompany ebizCompany);
    //查询公司名称是否存在
    public EbizCompany queryOneCompanyName(String companyName);
    //查询医生名称是否存在
    public EbizCompany queryOneOwerName(String owerName);
    //修改登陆时间
    public void amendAndUpdateTime( Integer id,  Date updateTime);
    //修改信息
    public void amendEbizCompany(EbizCompany ebizCompany);
}
