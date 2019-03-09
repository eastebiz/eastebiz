package com.eastebiz.service.impl;

import com.eastebiz.dao.PackageListDao;
import com.eastebiz.entity.PackageList;
import com.eastebiz.service.PackageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("packageListService")
@Transactional
public class PackageListServiceImpl implements PackageListService {

    @Autowired
    private  PackageListDao  packageListDao;
    //查询医生所有包裹
    @Override
    public List<PackageList> selectAllPackageByCompangId(Integer companyId) {
        return packageListDao.selectAllPackageByCompanyId(companyId);
    }
    //查询护士所有包裹




    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<PackageList> selectAllPackageById(Integer userId) {
        return  packageListDao.selectAllPackageById(userId);
    }
    //未发货包裹
    @Override
    public List<PackageList> selectUnSendPackage(String labelStatus) {
        return packageListDao.selectUnSendPackage(labelStatus);
    }
    //途中包裹
    @Override
    public List<PackageList> selectTrackingPackage(String checkStatus) {
        return packageListDao.selectTrackingPackage(checkStatus);
    }
    //待结算包裹
    @Override
    public List<PackageList> selectUnPaiedPackage(String payStatus) {
        return packageListDao.selectUnPaiedPackage(payStatus);
    }
    //已结算
    @Override
    public List<PackageList> selectPaiedPackage(String payStatus) {
        return packageListDao.selectPaiedPackage(payStatus);
    }
    //邮寄完成包裹
    @Override
    public List<PackageList> selectMailedPackage(String checkStatus) {
        return packageListDao.selectMailedPackage(checkStatus);
    }


}
