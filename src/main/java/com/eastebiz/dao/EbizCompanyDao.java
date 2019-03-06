package com.eastebiz.dao;

import com.eastebiz.entity.EbizCompany;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface EbizCompanyDao {
    //注册
    public void insertEbizCompany(EbizCompany ebizCompany);
    //登陆
    public EbizCompany selectCompanyNameAndPassdord(EbizCompany ebizCompany);
    //查询公司名称是否存在
    public EbizCompany selectOneCompanyName(String companyName);
    //查询医生名称是否存在
    public EbizCompany selectOneOwerName(String owerName);
    //修改登陆时间
    public void updateAndUpdateTime(@Param("id") Integer id,@Param("updateTime") Date updateTime);
    //修改信息
    public void updateEbizCompany(EbizCompany ebizCompany);
}
