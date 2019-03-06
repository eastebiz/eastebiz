package com.eastebiz.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PackageList implements Serializable {//包裹列表

    private  Integer  id;
    private  Date createTime;
    private  Date  updateTime;
    private  String companyName;
    private  String trackingNumber;
    private  String storeName;
    private  String userName;
    private  String shippingAddress;
    private  String email;
    private  String phoneNumber;
    private  String receiver;
    private String recipient;
    private  String mnote;
    private  String unote;
    private  Integer  packageQuantity;
    private  double homeBasePrice;
    private  Integer homePromotQuantity;
    private  double homePromotPrice;
    private  double wareHouseBasePrice;
    private  Integer wareHousePromotQuantity;
    private  double wareHousePromotPrice;
    private  String creditCardNumber;//信用卡号
    private  String status;
    private  String checkStatus;//对单状态
    private  String checker;
    private String labelStatus;//label是否已发送
    private String labeler;
    private String payStatus;
    private String payer;
    private List<ProductList>  productLists=new ArrayList<ProductList>();
    private Integer userId;
    private Integer companyId;

    @Override
    public String toString() {
        return "PackageList{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", companyName='" + companyName + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", storeName='" + storeName + '\'' +
                ", userName='" + userName + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", receiver='" + receiver + '\'' +
                ", recipient='" + recipient + '\'' +
                ", mnote='" + mnote + '\'' +
                ", unote='" + unote + '\'' +
                ", packageQuantity=" + packageQuantity +
                ", homeBasePrice=" + homeBasePrice +
                ", homePromotQuantity=" + homePromotQuantity +
                ", homePromotPrice=" + homePromotPrice +
                ", wareHouseBasePrice=" + wareHouseBasePrice +
                ", wareHousePromotQuantity=" + wareHousePromotQuantity +
                ", wareHousePromotPrice=" + wareHousePromotPrice +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", status='" + status + '\'' +
                ", checkStatus='" + checkStatus + '\'' +
                ", checker='" + checker+'\''+
                ", labelStatus='" + labelStatus + '\'' +
                ", labeler='" + labeler + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", payer='" + payer + '\'' +
                ", productLists=" + productLists +
                ", userId=" + userId +
                ", companyId=" + companyId +
                '}';
    }

    public PackageList() {
        super();
    }

    public PackageList(Integer id, Date createTime, Date updateTime, String companyName, String trackingNumber, String storeName, String userName, String shippingAddress, String email, String phoneNumber, String receiver, String recipient, String mnote, String unote, Integer packageQuantity, double homeBasePrice, Integer homePromotQuantity, double homePromotPrice, double wareHouseBasePrice, Integer wareHousePromotQuantity, double wareHousePromotPrice, String creditCardNumber, String status, String checkStatus,String checker, String labelStatus, String labeler, String payStatus, String payer, List<ProductList> productLists, Integer userId, Integer companyId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.companyName = companyName;
        this.trackingNumber = trackingNumber;
        this.storeName = storeName;
        this.userName = userName;
        this.shippingAddress = shippingAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.receiver = receiver;
        this.recipient = recipient;
        this.mnote = mnote;
        this.unote = unote;
        this.packageQuantity = packageQuantity;
        this.homeBasePrice = homeBasePrice;
        this.homePromotQuantity = homePromotQuantity;
        this.homePromotPrice = homePromotPrice;
        this.wareHouseBasePrice = wareHouseBasePrice;
        this.wareHousePromotQuantity = wareHousePromotQuantity;
        this.wareHousePromotPrice = wareHousePromotPrice;
        this.creditCardNumber = creditCardNumber;
        this.status = status;
        this.checkStatus = checkStatus;
        this.checker=checker;
        this.labelStatus = labelStatus;
        this.labeler = labeler;
        this.payStatus = payStatus;
        this.payer = payer;
        this.productLists = productLists;
        this.userId = userId;
        this.companyId = companyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMnote() {
        return mnote;
    }

    public void setMnote(String mnote) {
        this.mnote = mnote;
    }

    public String getUnote() {
        return unote;
    }

    public void setUnote(String unote) {
        this.unote = unote;
    }

    public Integer getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(Integer packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public double getHomeBasePrice() {
        return homeBasePrice;
    }

    public void setHomeBasePrice(double homeBasePrice) {
        this.homeBasePrice = homeBasePrice;
    }

    public Integer getHomePromotQuantity() {
        return homePromotQuantity;
    }

    public void setHomePromotQuantity(Integer homePromotQuantity) {
        this.homePromotQuantity = homePromotQuantity;
    }

    public double getHomePromotPrice() {
        return homePromotPrice;
    }

    public void setHomePromotPrice(double homePromotPrice) {
        this.homePromotPrice = homePromotPrice;
    }

    public double getWareHouseBasePrice() {
        return wareHouseBasePrice;
    }

    public void setWareHouseBasePrice(double wareHouseBasePrice) {
        this.wareHouseBasePrice = wareHouseBasePrice;
    }

    public Integer getWareHousePromotQuantity() {
        return wareHousePromotQuantity;
    }

    public void setWareHousePromotQuantity(Integer wareHousePromotQuantity) {
        this.wareHousePromotQuantity = wareHousePromotQuantity;
    }

    public double getWareHousePromotPrice() {
        return wareHousePromotPrice;
    }

    public void setWareHousePromotPrice(double wareHousePromotPrice) {
        this.wareHousePromotPrice = wareHousePromotPrice;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getLabelStatus() {
        return labelStatus;
    }

    public void setLabelStatus(String labelStatus) {
        this.labelStatus = labelStatus;
    }

    public String getLabeler() {
        return labeler;
    }

    public void setLabeler(String labeler) {
        this.labeler = labeler;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public List<ProductList> getProductLists() {
        return productLists;
    }

    public void setProductLists(List<ProductList> productLists) {
        this.productLists = productLists;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

}
