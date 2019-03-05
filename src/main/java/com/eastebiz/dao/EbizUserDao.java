package com.eastebiz.dao;

import com.eastebiz.entity.EbizUser;

public interface EbizUserDao {
    //注册
    public  void insertEbizUser(EbizUser ebizUser);

    //登录
    public EbizUser selectOneEbizUser(EbizUser ebizUser);

}
