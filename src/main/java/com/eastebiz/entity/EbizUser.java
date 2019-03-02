package com.eastebiz.entity;



public class EbizUser {
    private Integer id;

    private String userName;

    private String firstName;

    private String lastName;

    private String companyName;

    private String passWord;

    private String tempPassWord;

    private String email;

    private String phoneNumber;

    private String address;

    private String createTime;

    private String updateTime;

    private String note;

    private String status;

    private String userType;
    //权限
    private String permissions;

    private Double balance;
    //个人领取任务限制
    private Integer personalLimit;

    private String parameterString;

    private String payTimeInfor;
    //状态
    private String operatingStatus;
    //操作记录
    private String operationRecord;
    //活跃记录
    private String activityRecord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getTempPassWord() {
        return tempPassWord;
    }

    public void setTempPassWord(String tempPassWord) {
        this.tempPassWord = tempPassWord == null ? null : tempPassWord.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email == null ? null : email.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions == null ? null : permissions.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getPersonalLimit() {
        return personalLimit;
    }

    public void setPersonalLimit(Integer personalLimit) {
        this.personalLimit = personalLimit;
    }

    public String getParameterString() {
        return parameterString;
    }

    public void setParameterString(String parameterString) {
        this.parameterString = parameterString == null ? null : parameterString.trim();
    }

    public String getPayTimeInfor() {
        return payTimeInfor;
    }

    public void setPayTimeInfor(String payTimeInfor) {
        this.payTimeInfor = payTimeInfor == null ? null : payTimeInfor.trim();
    }

    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus == null ? null : operatingStatus.trim();
    }

    public String getOperationRecord() {
        return operationRecord;
    }

    public void setOperationRecord(String operationRecord) {
        this.operationRecord = operationRecord == null ? null : operationRecord.trim();
    }

    public String getActivityRecord() {
        return activityRecord;
    }

    public void setActivityRecord(String activityRecord) {
        this.activityRecord = activityRecord == null ? null : activityRecord.trim();
    }
}

