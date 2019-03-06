package com.eastebiz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbizCompany implements Serializable {
    /*
            id ,CompanyName	公司名（可以用了登陆）,OwerName   医生名
		Password   密码,Status	,Permision     经营范围:可以操作哪个模块  ,Balance
		Mote,UNote,PayTimeInfor  支付记录,Address       公司注册地址
		Address1Name  公司仓库名1,Address1Value 公司仓库地址1
	Address2Name  公司仓库名2,Address2Value 公司仓库地址2
	Address3Name  公司仓库名3,Address3Value 公司仓库地址3
	Email,PhoneNumber,UserManual  公司规则/使用手册,CreateTime,UpdateTime

    */


    private Integer id;
    private String companyName;
    private String owerName;
    private String password;
    private String email;
    private String status;
    private String permision;
    private String balance;
    private String mote;
    private String uNote;
    private String payTimeInfor;
    private String address;
    private String address1Name;
    private String address1Value;
    private String address2Name;
    private String address2Value;
    private String address3Name;
    private String address3Value;
    private String phoneNumber;
    private String userManual;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    //关系属性
    private List<PackageList> packageLists = new ArrayList<PackageList>();
    private List<ProductList> productLists = new ArrayList<ProductList>();

    //get set


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

    public String getOwerName() {
        return owerName;
    }

    public void setOwerName(String owerName) {
        this.owerName = owerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPermision() {
        return permision;
    }

    public void setPermision(String permision) {
        this.permision = permision;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public String getuNote() {
        return uNote;
    }

    public void setuNote(String uNote) {
        this.uNote = uNote;
    }

    public String getPayTimeInfor() {
        return payTimeInfor;
    }

    public void setPayTimeInfor(String payTimeInfor) {
        this.payTimeInfor = payTimeInfor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress1Name() {
        return address1Name;
    }

    public void setAddress1Name(String address1Name) {
        this.address1Name = address1Name;
    }

    public String getAddress1Value() {
        return address1Value;
    }

    public void setAddress1Value(String address1Value) {
        this.address1Value = address1Value;
    }

    public String getAddress2Name() {
        return address2Name;
    }

    public void setAddress2Name(String address2Name) {
        this.address2Name = address2Name;
    }

    public String getAddress2Value() {
        return address2Value;
    }

    public void setAddress2Value(String address2Value) {
        this.address2Value = address2Value;
    }

    public String getAddress3Name() {
        return address3Name;
    }

    public void setAddress3Name(String address3Name) {
        this.address3Name = address3Name;
    }

    public String getAddress3Value() {
        return address3Value;
    }

    public void setAddress3Value(String address3Value) {
        this.address3Value = address3Value;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserManual() {
        return userManual;
    }

    public void setUserManual(String userManual) {
        this.userManual = userManual;
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

    public List<PackageList> getPackageLists() {
        return packageLists;
    }

    public void setPackageLists(List<PackageList> packageLists) {
        this.packageLists = packageLists;
    }

    public List<ProductList> getProductLists() {
        return productLists;
    }

    public void setProductLists(List<ProductList> productLists) {
        this.productLists = productLists;
    }

    //构造

    public EbizCompany() {
    }

    public EbizCompany(Integer id) {
        this.id = id;
    }

    //登陆
    public EbizCompany(String companyName, String password) {
        this.companyName = companyName;
        this.password = password;
    }


    //修改信息

    public EbizCompany(Integer id, String password, String email, String status, String permision, String balance, String mote, String uNote, String address, String address1Name, String address1Value, String address2Name, String address2Value, String address3Name, String address3Value, String phoneNumber, String userManual) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.status = status;
        this.permision = permision;
        this.balance = balance;
        this.mote = mote;
        this.uNote = uNote;
        this.address = address;
        this.address1Name = address1Name;
        this.address1Value = address1Value;
        this.address2Name = address2Name;
        this.address2Value = address2Value;
        this.address3Name = address3Name;
        this.address3Value = address3Value;
        this.phoneNumber = phoneNumber;
        this.userManual = userManual;
    }


    public EbizCompany( String companyName, String owerName, String password, String email, String status, String permision, String balance, String mote, String uNote, String payTimeInfor, String address, String address1Name, String address1Value, String address2Name, String address2Value, String address3Name, String address3Value, String phoneNumber, String userManual, Date createTime) {
        this.companyName = companyName;
        this.owerName = owerName;
        this.password = password;
        this.email = email;
        this.status = status;
        this.permision = permision;
        this.balance = balance;
        this.mote = mote;
        this.uNote = uNote;
        this.payTimeInfor = payTimeInfor;
        this.address = address;
        this.address1Name = address1Name;
        this.address1Value = address1Value;
        this.address2Name = address2Name;
        this.address2Value = address2Value;
        this.address3Name = address3Name;
        this.address3Value = address3Value;
        this.phoneNumber = phoneNumber;
        this.userManual = userManual;
        this.createTime = createTime;
    }

    public EbizCompany(Integer id, String companyName, String owerName, String password, String email, String status, String permision, String balance, String mote, String uNote, String payTimeInfor, String address, String address1Name, String address1Value, String address2Name, String address2Value, String address3Name, String address3Value, String phoneNumber, String userManual, Date createTime, Date updateTime, List<PackageList> packageLists, List<ProductList> productLists) {
        this.id = id;
        this.companyName = companyName;
        this.owerName = owerName;
        this.password = password;
        this.email = email;
        this.status = status;
        this.permision = permision;
        this.balance = balance;
        this.mote = mote;
        this.uNote = uNote;
        this.payTimeInfor = payTimeInfor;
        this.address = address;
        this.address1Name = address1Name;
        this.address1Value = address1Value;
        this.address2Name = address2Name;
        this.address2Value = address2Value;
        this.address3Name = address3Name;
        this.address3Value = address3Value;
        this.phoneNumber = phoneNumber;
        this.userManual = userManual;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.packageLists = packageLists;
        this.productLists = productLists;
    }

    @Override
    public String toString() {
        return "EbizCompany{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", owerName='" + owerName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", permision='" + permision + '\'' +
                ", balance='" + balance + '\'' +
                ", mote='" + mote + '\'' +
                ", uNote='" + uNote + '\'' +
                ", payTimeInfor='" + payTimeInfor + '\'' +
                ", address='" + address + '\'' +
                ", address1Name='" + address1Name + '\'' +
                ", address1Value='" + address1Value + '\'' +
                ", address2Name='" + address2Name + '\'' +
                ", address2Value='" + address2Value + '\'' +
                ", address3Name='" + address3Name + '\'' +
                ", address3Value='" + address3Value + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userManual='" + userManual + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", packageLists=" + packageLists +
                '}';
    }
}
