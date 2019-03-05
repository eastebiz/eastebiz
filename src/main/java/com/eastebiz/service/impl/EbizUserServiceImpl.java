package com.eastebiz.service.impl;

import com.eastebiz.dao.EbizUserDao;
import com.eastebiz.entity.EbizUser;
import com.eastebiz.service.EbizUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("ebizUserSevice")
@Transactional
public class EbizUserServiceImpl implements EbizUserSevice {

    @Autowired
    private EbizUserDao ebizUserDao;

    //注册
    @Override
    public void registerEbizUser(EbizUser ebizUser) {
        ebizUserDao.insertEbizUser(ebizUser);
    }

    //登录
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public EbizUser loginEbizUser(EbizUser ebizUser) {
        return ebizUserDao.selectOneEbizUser(ebizUser);
    }
}
