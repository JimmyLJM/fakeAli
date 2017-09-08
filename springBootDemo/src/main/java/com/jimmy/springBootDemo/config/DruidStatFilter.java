package com.jimmy.springBootDemo.config;


import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Druid的StatFilter
 * author : jimmyLJM
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/",
        initParams={
                //忽略资源  放行静态资源
                @WebInitParam(name="exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
        }
)
public class DruidStatFilter extends WebStatFilter{

}
