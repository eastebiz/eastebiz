package com.eastebiz.entity;

import java.io.Serializable;
import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class User implements Serializable{
	/*（user）：id、phoneNum（手机号）、username、password、salt（盐值/加密后的密码）、dharmaName（法名）、gender（sex）、
sign（签名）、profile（图像）、province（省）、city(市)、status、registerTime（注册时间）
*/

    private String  id;
    private String phoneNum;
    private String username;
    private String password;
    private String salt;
    private String dharmaName;
    private String sex;
    private String sign;
    private String profile;
    private String province;
    private String city;
    private Integer status;
    @JSONField(format="yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date registerTime;

    //关系属性


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getDharmaName() {
        return dharmaName;
    }

    public void setDharmaName(String dharmaName) {
        this.dharmaName = dharmaName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }


    public User(String id, String phoneNum, String username, String password, String salt, String dharmaName, String sex, String sign, String profile, String province, String city, Integer status, Date registerTime) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.dharmaName = dharmaName;
        this.sex = sex;
        this.sign = sign;
        this.profile = profile;
        this.province = province;
        this.city = city;
        this.status = status;
        this.registerTime = registerTime;
    }


    public User() {
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", dharmaName='" + dharmaName + '\'' +
                ", sex='" + sex + '\'' +
                ", sign='" + sign + '\'' +
                ", profile='" + profile + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", status=" + status +
                ", registerTime=" + registerTime +
                '}';
    }
}
