package com.jimmy.springBootDemo.util;

import com.jimmy.springBootDemo.vo.Result;
import com.jimmy.springBootDemo.enums.ResultEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *  http返回结果result工具类
 * author : jimmyLJM
 */
public class ResultUtil {

    /**
     * 设置成功时候带数据返回值
     *
     * @param data 返回数据
     * @return
     */
    public static Result success(Object data) {
        Result rs = new Result();
        rs.setCode(ResultEnum.SUCCESS.getCode());
        rs.setMessage(ResultEnum.SUCCESS.getMsg());
        rs.setData(data);
        return rs;
    }

    /**
     * 设置成功时候不带数据返回值
     *
     * @return
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 设置失败的返回值
     * @param resultEnum
     * @return Result
     */
    public static Result error(ResultEnum resultEnum) {
        Result rs = new Result();
        rs.setCode(resultEnum.getCode());
        rs.setMessage(resultEnum.getMsg());
        return rs;
    }

    /**
     * 设置失败的返回值
     * @param code
     * @param mess
     * @return
     */
    @Deprecated
    public static Result error(Integer code, String mess){
        Result rs = new Result();
        rs.setCode(code);
        rs.setMessage(mess);
        return rs;
    }

    @GetMapping(value = "girls/getAge/{id}")
    public void getAge(@PathVariable Integer id){

    }
}
