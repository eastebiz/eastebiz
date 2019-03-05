package com.eastebiz.service;

import com.eastebiz.entity.EbizUser;

public interface EbizUserSevice {

    //注册
    public void registerEbizUser(EbizUser ebizUser);

    //登录
    public EbizUser loginEbizUser(EbizUser ebizUser);
}
