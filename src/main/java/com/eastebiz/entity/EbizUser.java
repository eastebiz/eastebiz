package com.eastebiz.entity;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbizUser {
        /*
        *  id` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `FirstName` varchar(400) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `LastName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `CompanyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CreateTime` date NULL DEFAULT NULL,
  `UpdateTime` date NULL DEFAULT NULL,
  `Mnote` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户状态  已激活或未激活   active  unactive',
  `UserType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医生or 护士   doctor   user',
  `Permissions` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Balance` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PersonalLimit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Introducer` varchar(10000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        **/

      private Integer id;
      private String userName;
      private String firstName;
      private String lastName;
      private String password;
      private String email;
      private String phoneNumber;
      private String address;
      private Date   createTime;
      private Date   updateTime;
      private String mnote;
      private String status;
      private String userType;
      private String permissions;
      private String balance;
      private String personalLimit;
      private String introducer;

      //关系属性
      private List<PackageList> packageList  = new ArrayList<PackageList>();

      //get set

=======


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
>>>>>>> origin/master

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
<<<<<<< HEAD
        this.userName = userName;
=======
        this.userName = userName == null ? null : userName.trim();
>>>>>>> origin/master
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
<<<<<<< HEAD
        this.firstName = firstName;
=======
        this.firstName = firstName == null ? null : firstName.trim();
>>>>>>> origin/master
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
<<<<<<< HEAD
        this.lastName = lastName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
=======
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
>>>>>>> origin/master
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
<<<<<<< HEAD
        this.email = email;
=======

        this.email = email == null ? null : email.trim();
>>>>>>> origin/master
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
<<<<<<< HEAD
        this.phoneNumber = phoneNumber;
=======
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
>>>>>>> origin/master
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
<<<<<<< HEAD
        this.address = address;
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

    public String getMnote() {
        return mnote;
    }

    public void setMnote(String mnote) {
        this.mnote = mnote;
=======
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
>>>>>>> origin/master
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
<<<<<<< HEAD
        this.status = status;
=======
        this.status = status == null ? null : status.trim();
>>>>>>> origin/master
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
<<<<<<< HEAD
        this.userType = userType;
=======
        this.userType = userType == null ? null : userType.trim();
>>>>>>> origin/master
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
<<<<<<< HEAD
        this.permissions = permissions;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPersonalLimit() {
        return personalLimit;
    }

    public void setPersonalLimit(String personalLimit) {
        this.personalLimit = personalLimit;
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer;
    }



    public List<PackageList> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<PackageList> packageList) {
        this.packageList = packageList;
    }


    public EbizUser() {
    }

    public EbizUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public EbizUser(String userName, String firstName, String lastName,  String password, String email, String phoneNumber, String address, Date createTime, Date updateTime, String mnote, String status, String userType, String permissions, String balance, String personalLimit, String introducer) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.mnote = mnote;
        this.status = status;
        this.userType = userType;
        this.permissions = permissions;
        this.balance = balance;
        this.personalLimit = personalLimit;
        this.introducer = introducer;
    }


    public EbizUser(String userName, String firstName, String lastName, String password, String email, String phoneNumber, String address, Date createTime, Date updateTime, String mnote, String status, String userType, String permissions, String balance, String personalLimit, String introducer, List<PackageList> packageList) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.mnote = mnote;
        this.status = status;
        this.userType = userType;
        this.permissions = permissions;
        this.balance = balance;
        this.personalLimit = personalLimit;
        this.introducer = introducer;
        this.packageList = packageList;
    }

    public EbizUser(Integer id, String userName, String firstName, String lastName,  String password, String email, String phoneNumber, String address, Date createTime, Date updateTime, String mnote, String status, String userType, String permissions, String balance, String personalLimit, String introducer, List<PackageList> packageList) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;

        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.mnote = mnote;
        this.status = status;
        this.userType = userType;
        this.permissions = permissions;
        this.balance = balance;
        this.personalLimit = personalLimit;
        this.introducer = introducer;
        this.packageList = packageList;
    }

    @Override
    public String toString() {
        return "EbizUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", mnote='" + mnote + '\'' +
                ", status='" + status + '\'' +
                ", userType='" + userType + '\'' +
                ", permissions='" + permissions + '\'' +
                ", balance='" + balance + '\'' +
                ", personalLimit='" + personalLimit + '\'' +
                ", introducer='" + introducer + '\'' +
                ", packageList=" + packageList +
                '}';
    }
}
=======
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

>>>>>>> origin/master
