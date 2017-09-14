package com.jimmy.springBootDemo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * author : jimmyLJM
 */
public class User implements Serializable{


    private Integer   id;                       // 主键
    private String loginName;           // 登录名
    private String name;                     // 名字
    private String passWord;            //  密码
    private Integer districtId;            //  地区
    private Integer empId;                //   部门
    private String email;                    //   邮箱
    private String qq;                         //   qq
    private String phone;                   //   电话
    private String  mobile;                 //   手机
    private Integer userType;           //   用户类型（对应角色）
    private String loginIp;                //   上次登录ip
    private Date loginDate;               //   上次登录日期
    private String statue;                     //    状态 1 可用 2冻结（不可登录） 3删除
    private Integer createBy;            //     创建人
    private Date createDate;            //    创建日期
    private Integer updateBy;          //    修改人
    private Date updateDate;           //    最后一次处理日期
    private String remarks;                //   备注

    private Set<Role> Roles = new HashSet<Role>(0);// Code12


    public User() {
    }

    public User(String name, String email, String passWord, Date loginDate, Set<Role> Roles) {

        this.name = name;
        this.email = email;
        this.passWord = passWord;
        this.loginDate = loginDate;
        this.Roles = Roles;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }


    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Set<Role> getRoles() {
        return Roles;
    }

    public void setRoles(Set<Role> roles) {
        Roles = roles;
    }
}
