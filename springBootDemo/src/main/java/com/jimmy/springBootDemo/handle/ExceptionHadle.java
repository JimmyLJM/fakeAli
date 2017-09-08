package com.jimmy.springBootDemo.handle;

import com.jimmy.springBootDemo.vo.Result;
import com.jimmy.springBootDemo.exception.DemoException;
import com.jimmy.springBootDemo.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author : jimmyLJM
 */
@ControllerAdvice
public class ExceptionHadle {

    private final  static Logger logger = LoggerFactory.getLogger(ExceptionHadle.class);

    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Result ExceptionAcquirer(Exception e){
        if(e instanceof DemoException) {
            DemoException demoException = (DemoException) e;
            return ResultUtil.error(demoException.getCode(),demoException.getMessage());
        } else {
            logger.error("[系统异常]{}",e);
            return ResultUtil.error(-1,"系统错误");
        }
    }
}
