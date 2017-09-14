package com.jimmy.springBootDemo.domain;

import java.util.Date;

/**
 * author : jimmyLJM on 2017-09-11
 */
public class Role {
    private Integer   id;                       // 主键
    private String name;                     // 名字
    private String remarks;                //   备注
    private String statue;                     //    状态 1 可用 2冻结（不可登录） 3删除
    private Integer createBy;            //     创建人
    private Date createDate;            //    创建日期
    private Integer updateBy;          //    修改人
    private Date updateDate;           //    最后一次处理日期


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
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
}
