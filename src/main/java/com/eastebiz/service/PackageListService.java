package com.eastebiz.service;

import java.util.List;

public interface PackageListService {

    //根据当前登录用户id查询所有包裹
    public List<PackageList> selectAllPackageById(Integer userId);


}
