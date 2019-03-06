package com.eastebiz.dao;

import com.eastebiz.entity.PackageList;

import java.util.List;

public interface PackageListDao {
    //查询所有包裹  通过用户/公司 id
    public List<PackageList> selectAllPackageById(Integer userId);

}
