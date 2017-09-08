package com.jimmy.springBootDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 *  切面日志管理
 *  扫描 controller中的信息，切面日志
 * author : jimmyLJM
 */
@Aspect
@Component
public class LogAspect {

    private final  static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.jimmy.springBootDemo.controller.*.*(..))")
    public void log(){}

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url
        logger.info("url{}",request.getRequestURL());
        // method
        logger.info("method{}",request.getMethod());
        // ip
        logger.info("ip{}",request.getRemoteAddr());
        // class_method
        logger.info("class_method{}",joinPoint.getSignature().getDeclaringType()+"."+joinPoint.getSignature().getName());
        // args
        logger.info("args{}",joinPoint.getArgs());

    }

    @After("log()")
    public void doAfter() {
        logger.info("");
    }

    /**
     * 获取传出后的具体内容
     * 可以重写对应对象的toString() 方法
     * @param object
     */
    @AfterReturning(returning = "object" ,pointcut = "log()")
    public  void doAfterReturning(Object object){
        logger.info("responseBody{}",object.toString());
    }
}
