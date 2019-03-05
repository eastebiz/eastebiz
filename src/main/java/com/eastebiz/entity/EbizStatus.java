package com.eastebiz.entity;

public class EbizStatus {

    private Integer id;
    private Integer companyId;
    private Integer userId;
    private String  status;


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

    //构造

    public EbizStatus() {
    }

    //用于修改状态
    public EbizStatus(String status) {
        this.status = status;
    }

    public EbizStatus(Integer companyId, Integer userId, String status) {
        this.companyId = companyId;
        this.userId = userId;
        this.status = status;
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
