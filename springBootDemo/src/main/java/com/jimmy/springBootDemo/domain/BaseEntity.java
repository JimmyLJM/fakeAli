package com.jimmy.springBootDemo.domain;

/**
 * author : jimmyLJM on 2017-09-05
 * 基础实体类包含分页信息
 */
public class BaseEntity {
    private Integer page = 1;

    private Integer rows = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
