package com.eastebiz.dao;

import com.eastebiz.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    //添加
    public void insertProduct(Product product);

    //修改
    public void updatebProduct(Product product);

    //使用属性条件模糊查询
    public List<Product> selectAllNameAndValue(@Param("ebizcompanyId")Integer ebizcompanyId,@Param("name")String name , @Param("value")String value);

    //根据提供的条件进行模糊查询  全部的查询
    public List<Product> selectAllValue(@Param("ebizcompanyId")Integer ebizcompanyId,@Param("value")String value);

    //根据状态查询
    public List<Product> selectAndStatus(@Param("status") String status);

    //根据公司ID查询公司旗下有多少产品
    public List<Product> seclectAllEbizcompanyId(@Param("ebizcompanyId")Integer ebizcompanyId);
}
