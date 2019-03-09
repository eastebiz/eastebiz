package com.eastebiz.service;

import com.eastebiz.entity.PackageList;

import java.util.List;

public interface PackageListService {

    //根据当前登录用户id查询所有包裹
    public List<PackageList> selectAllPackageById(Integer userId);
    //根据当前登录医生(公司)id查询所有包裹
    public  List<PackageList> selectAllPackageByCompangId(Integer companyId);
    //未确认包裹  :护士议价求收购  医生没有确认

    //未发货包裹  :label 已发  护士未填写tracking
    public  List<PackageList>  selectUnSendPackage( String  labelStatus);
    //途中    tracking 已填写.但未对单unchecked
    public List<PackageList> selectTrackingPackage(String checkStatus);
    //家里     领取任务后货物下到家里


    //待结算   label 已发,checked 已对单.unpaied
    public List<PackageList> selectUnPaiedPackage(String payStatus);

    //已结算
    public List<PackageList> selectPaiedPackage(String payStatus);

    //邮寄完成      对单完成无误
    public List<PackageList>  selectMailedPackage(String checkStatus);

    //不匹配       对单发现数量或者品牌不匹配

}
