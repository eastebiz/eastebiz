package com.eastebiz.entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {

    /*id,CompanyName ,MOdel,ProductName,Condition, UPC, ASIN,SKU,Brand,Weight,Length,
Width,Height,HomeBasePrice,
HomePromotQuantity,HomePromotPrice,WareHouseBasePrice,WareHousePromotQuantity,
WareHousePromotPrice,Status,Tickets,LimitPerPerson,URI,Mnote,CreatedTime,UpdateTime

*/
    private Integer id;
    private String companyName;
    private String mOdel;
    private String productName;
    private String condition;
    private String UPC;
    private String ASIN;
    private String SKU;
    private String brand;
    private Double weight;
    private Double length;
    private Double width;
    private Double height;
    private Double homeBasePrice;
    private Integer homePromotQuantity;
    private Double homePromotPrice;
    private Double wareHouseBasePrice;
    private Integer wareHousePromotQuantity;
    private Double wareHousePromotPrice;
    private String status;
    private String tickets;
    private String limitPerPerson;
    private String URI;
    private String mnote;
    private Date createdTime;
    private Date updateTime;

    //关系属性
    private EbizCompany  ebizCompany  = new EbizCompany();


    //gst set


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

    public String getmOdel() {
        return mOdel;
    }

    public void setmOdel(String mOdel) {
        this.mOdel = mOdel;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getHomeBasePrice() {
        return homeBasePrice;
    }

    public void setHomeBasePrice(Double homeBasePrice) {
        this.homeBasePrice = homeBasePrice;
    }

    public Integer getHomePromotQuantity() {
        return homePromotQuantity;
    }

    public void setHomePromotQuantity(Integer homePromotQuantity) {
        this.homePromotQuantity = homePromotQuantity;
    }

    public Double getHomePromotPrice() {
        return homePromotPrice;
    }

    public void setHomePromotPrice(Double homePromotPrice) {
        this.homePromotPrice = homePromotPrice;
    }

    public Double getWareHouseBasePrice() {
        return wareHouseBasePrice;
    }

    public void setWareHouseBasePrice(Double wareHouseBasePrice) {
        this.wareHouseBasePrice = wareHouseBasePrice;
    }

    public Integer getWareHousePromotQuantity() {
        return wareHousePromotQuantity;
    }

    public void setWareHousePromotQuantity(Integer wareHousePromotQuantity) {
        this.wareHousePromotQuantity = wareHousePromotQuantity;
    }

    public Double getWareHousePromotPrice() {
        return wareHousePromotPrice;
    }

    public void setWareHousePromotPrice(Double wareHousePromotPrice) {
        this.wareHousePromotPrice = wareHousePromotPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public String getLimitPerPerson() {
        return limitPerPerson;
    }

    public void setLimitPerPerson(String limitPerPerson) {
        this.limitPerPerson = limitPerPerson;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public String getTnote() {
        return mnote;
    }

    public void setTnote(String tnote) {
        this.mnote = mnote;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public EbizCompany getEbizCompany() {
        return ebizCompany;
    }

    public void setEbizCompany(EbizCompany ebizCompany) {
        this.ebizCompany = ebizCompany;
    }

    //构造


    public Product() {
    }






    //修改

    public Product(Integer id, String companyName, String productName, String condition, String SKU, String brand, Double weight, Double length, Double width, Double height, Double homeBasePrice, Integer homePromotQuantity, Double homePromotPrice, Double wareHouseBasePrice, Integer wareHousePromotQuantity, Double wareHousePromotPrice, String status, String tickets, String limitPerPerson, String URI, String mnote,Date updateTime) {
        this.id = id;
        this.companyName = companyName;
        this.productName = productName;
        this.condition = condition;
        this.SKU = SKU;
        this.brand = brand;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.homeBasePrice = homeBasePrice;
        this.homePromotQuantity = homePromotQuantity;
        this.homePromotPrice = homePromotPrice;
        this.wareHouseBasePrice = wareHouseBasePrice;
        this.wareHousePromotQuantity = wareHousePromotQuantity;
        this.wareHousePromotPrice = wareHousePromotPrice;
        this.status = status;
        this.tickets = tickets;
        this.limitPerPerson = limitPerPerson;
        this.URI = URI;
        this.mnote = mnote;
        this.updateTime = updateTime;
    }




    public Product( String companyName, String mOdel, String productName, String condition, String UPC, String ASIN, String SKU, String brand, Double weight, Double length, Double width, Double height, Double homeBasePrice, Integer homePromotQuantity, Double homePromotPrice, Double wareHouseBasePrice, Integer wareHousePromotQuantity, Double wareHousePromotPrice, String status, String tickets, String limitPerPerson, String URI, String mnote, Date createdTime, EbizCompany ebizCompany) {

        this.companyName = companyName;
        this.mOdel = mOdel;
        this.productName = productName;
        this.condition = condition;
        this.UPC = UPC;
        this.ASIN = ASIN;
        this.SKU = SKU;
        this.brand = brand;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.homeBasePrice = homeBasePrice;
        this.homePromotQuantity = homePromotQuantity;
        this.homePromotPrice = homePromotPrice;
        this.wareHouseBasePrice = wareHouseBasePrice;
        this.wareHousePromotQuantity = wareHousePromotQuantity;
        this.wareHousePromotPrice = wareHousePromotPrice;
        this.status = status;
        this.tickets = tickets;
        this.limitPerPerson = limitPerPerson;
        this.URI = URI;
        this.mnote = mnote;
        this.createdTime = createdTime;
        this.ebizCompany = ebizCompany;
    }

    public Product(Integer id, String companyName, String mOdel, String productName, String condition, String UPC, String ASIN, String SKU, String brand, Double weight, Double length, Double width, Double height, Double homeBasePrice, Integer homePromotQuantity, Double homePromotPrice, Double wareHouseBasePrice, Integer wareHousePromotQuantity, Double wareHousePromotPrice, String status, String tickets, String limitPerPerson, String URI, String mnote, Date createdTime, EbizCompany ebizCompany) {
        this.id = id;
        this.companyName = companyName;
        this.mOdel = mOdel;
        this.productName = productName;
        this.condition = condition;
        this.UPC = UPC;
        this.ASIN = ASIN;
        this.SKU = SKU;
        this.brand = brand;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.homeBasePrice = homeBasePrice;
        this.homePromotQuantity = homePromotQuantity;
        this.homePromotPrice = homePromotPrice;
        this.wareHouseBasePrice = wareHouseBasePrice;
        this.wareHousePromotQuantity = wareHousePromotQuantity;
        this.wareHousePromotPrice = wareHousePromotPrice;
        this.status = status;
        this.tickets = tickets;
        this.limitPerPerson = limitPerPerson;
        this.URI = URI;
        this.mnote = mnote;
        this.createdTime = createdTime;
        this.ebizCompany = ebizCompany;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", mOdel='" + mOdel + '\'' +
                ", productName='" + productName + '\'' +
                ", condition='" + condition + '\'' +
                ", UPC='" + UPC + '\'' +
                ", ASIN='" + ASIN + '\'' +
                ", SKU='" + SKU + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", homeBasePrice=" + homeBasePrice +
                ", homePromotQuantity=" + homePromotQuantity +
                ", homePromotPrice=" + homePromotPrice +
                ", wareHouseBasePrice=" + wareHouseBasePrice +
                ", wareHousePromotQuantity=" + wareHousePromotQuantity +
                ", wareHousePromotPrice=" + wareHousePromotPrice +
                ", status='" + status + '\'' +
                ", tickets='" + tickets + '\'' +
                ", limitPerPerson='" + limitPerPerson + '\'' +
                ", URI='" + URI + '\'' +
                ", mnote='" + mnote + '\'' +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +

                '}';
    }

    public Product(String companyName, String mOdel, String productName, String condition, String UPC, String ASIN, String SKU, String brand, Double weight, Double length, Double width, Double height, Double homeBasePrice, Integer homePromotQuantity, Double homePromotPrice, Double wareHouseBasePrice, Integer wareHousePromotQuantity, Double wareHousePromotPrice, String status, String tickets, String limitPerPerson, String URI, String mnote, Date createdTime) {
        this.companyName = companyName;
        this.mOdel = mOdel;
        this.productName = productName;
        this.condition = condition;
        this.UPC = UPC;
        this.ASIN = ASIN;
        this.SKU = SKU;
        this.brand = brand;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.homeBasePrice = homeBasePrice;
        this.homePromotQuantity = homePromotQuantity;
        this.homePromotPrice = homePromotPrice;
        this.wareHouseBasePrice = wareHouseBasePrice;
        this.wareHousePromotQuantity = wareHousePromotQuantity;
        this.wareHousePromotPrice = wareHousePromotPrice;
        this.status = status;
        this.tickets = tickets;
        this.limitPerPerson = limitPerPerson;
        this.URI = URI;
        this.mnote = mnote;
        this.createdTime = createdTime;
    }

}
