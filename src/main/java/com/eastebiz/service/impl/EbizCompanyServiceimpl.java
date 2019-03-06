package com.eastebiz.service.impl;

import com.eastebiz.dao.EbizCompanyDao;
import com.eastebiz.entity.EbizCompany;
import com.eastebiz.service.EbizCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
@Service("ebizCompanyService")
@Transactional
public class EbizCompanyServiceimpl implements EbizCompanyService {


    @Autowired
    private EbizCompanyDao ebizCompanyDao;

    //注册
    @Override
    public void registerEbizCompany(EbizCompany ebizCompany) {
        ebizCompanyDao.insertEbizCompany(ebizCompany);
    }
    //登陆
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public EbizCompany loginCompanyNameAndPassdord(EbizCompany ebizCompany) {
        return ebizCompanyDao.selectCompanyNameAndPassdord(ebizCompany);
    }
    //查询公司名称是否存在
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public EbizCompany queryOneCompanyName(String companyName) {
        return ebizCompanyDao.selectOneCompanyName("companyName");
    }
    //查询医生名称是否存在
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public EbizCompany queryOneOwerName(String owerName) {
        return ebizCompanyDao.selectOneOwerName(owerName);
    }
    //修改登陆时间
    @Override
    public void amendAndUpdateTime(Integer id, Date updateTime) {
        ebizCompanyDao.updateAndUpdateTime(id, updateTime);
    }
    //修改信息
    @Override
    public void amendEbizCompany(EbizCompany ebizCompany) {
        ebizCompanyDao.updateEbizCompany(ebizCompany);
    }
}
