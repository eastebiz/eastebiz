package com.eastebiz.entity;

<<<<<<< HEAD
public class PackageList {
=======
import java.util.Date;

public class PackageList {//护士包裹列表
    private  Integer  id;
    private  String  companyName;
    private  String  trackingNumber;
    private  String  shipId;

    private  String   modelNumber; //该包裹里商品的型号
    private  String   productName;
    private  String   productCondition;//商品的新旧程度
    private  String   UPC;
    private  String   ASIN;
    private  String   SKU;
    private  String  brand;//商品品牌
    private  double price;//商品本身价格
    private  double   basePrice;//加价收购价格
    private  double   promPrice;//大量加价收购价格,促销价格
    private  Integer  quantity;//数量
    private  Integer  promQuantity;
    private String    storeName;
    private String    userName;//该包裹对应哪个护士
    private String   shippingAddress;
    private String  email;
    private String phoneNumber;
    private String receiver;
    private String  note;//备注
    private Date createTime;
    private Date  updateTime;
    private String creditCardNumber;//信用卡信息
    private String status;//状态  对单完成的状态
    private String checkStatus;//该包裹是否已经进行对单
    private String checker;//对单人是谁
    private String labelStatus;//护士把家里的货往出发,是否给其发送了label
    private String labeler;//是谁给护士发的label
    private String payStatus;//酬劳支付状态
    private  String payer;
    private String  userNote;//护士写的备注

    public PackageList(String ASIN) {
        this.ASIN = ASIN;
    }

    public PackageList(Integer id, String companyName, String trackingNumber, String shipId, String modelNumber, String productName, String productCondition, String UPC, String ASIN, String SKU, String brand, double price, double basePrice, double promPrice, Integer quantity, Integer promQuantity, String storeName, String userName, String shippingAddress, String email, String phoneNumber, String receiver, String note, Date createTime, Date updateTime, String creditCardNumber, String status, String checkStatus, String checker, String labelStatus, String labeler, String payStatus, String payer, String userNote) {
        this.id = id;
        this.companyName = companyName;
        this.trackingNumber = trackingNumber;
        this.shipId = shipId;
        this.modelNumber = modelNumber;
        this.productName = productName;
        this.productCondition = productCondition;
        this.UPC = UPC;
        this.ASIN = ASIN;
        this.SKU = SKU;
        this.brand = brand;
        this.price = price;
        this.basePrice = basePrice;
        this.promPrice = promPrice;
        this.quantity = quantity;
        this.promQuantity = promQuantity;
        this.storeName = storeName;
        this.userName = userName;
        this.shippingAddress = shippingAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.receiver = receiver;
        this.note = note;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.creditCardNumber = creditCardNumber;
        this.status = status;
        this.checkStatus = checkStatus;
        this.checker = checker;
        this.labelStatus = labelStatus;
        this.labeler = labeler;
        this.payStatus = payStatus;
        this.payer = payer;
        this.userNote = userNote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPromPrice() {
        return promPrice;
    }

    public void setPromPrice(double promPrice) {
        this.promPrice = promPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPromQuantity() {
        return promQuantity;
    }

    public void setPromQuantity(Integer promQuantity) {
        this.promQuantity = promQuantity;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
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

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    @Override
    public String toString() {
        return "PackageList{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", shipId='" + shipId + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", productCondition='" + productCondition + '\'' +
                ", UPC='" + UPC + '\'' +
                ", ASIN='" + ASIN + '\'' +
                ", SKU='" + SKU + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", basePrice=" + basePrice +
                ", promPrice=" + promPrice +
                ", quantity=" + quantity +
                ", promQuantity=" + promQuantity +
                ", storeName='" + storeName + '\'' +
                ", userName='" + userName + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", receiver='" + receiver + '\'' +
                ", note='" + note + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", status='" + status + '\'' +
                ", checkStatus='" + checkStatus + '\'' +
                ", checker='" + checker + '\'' +
                ", labelStatus='" + labelStatus + '\'' +
                ", labeler='" + labeler + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", payer='" + payer + '\'' +
                ", userNote='" + userNote + '\'' +
                '}';
    }
>>>>>>> origin/master
}
