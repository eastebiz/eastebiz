package com.eastebiz.entity;

import java.io.Serializable;

public class EbizStatus implements Serializable{

    private Integer id;
    private Integer companyId;
    private Integer userId;
    private String  status;
    private String starLevel;


    //get     set

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }


    //构造

    public EbizStatus() {
    }

    //用于修改状态


    public EbizStatus(Integer id, Integer companyId, Integer userId, String status) {
        this.id = id;
        this.companyId = companyId;
        this.userId = userId;
        this.status = status;
    }

    public EbizStatus(Integer companyId, Integer userId, String starLevel) {
        this.companyId = companyId;
        this.userId = userId;
        this.starLevel = starLevel;
    }



    public EbizStatus(Integer id, Integer companyId, Integer userId, String status, String starLevel) {
        this.id = id;
        this.companyId = companyId;
        this.userId = userId;
        this.status = status;
        this.starLevel = starLevel;
    }

    //toString

    @Override
    public String toString() {
        return "EbizStatus{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }
}
