package com.eastebiz.service.impl;

import com.eastebiz.dao.PackageListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("packageListService")
@Transactional
public class PackageListServiceImpl implements PackageListDao {

    @Autowired
    private  PackageListDao  packageListDao;
    @Override
    public List<PackageList> selectAllPackageById(Integer userId) {
        return  packageListDao.selectAllPackageById(userId);
    }
}
