package com.hanlu.aspectj.annoatation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author HMY
 * @date 2018/12/6-14:13
 */
@Aspect
@Component
public class MyLog {
    Date date= new Date();

    @Pointcut("execution(* com.hanlu.jdk.*.*(..))")
    private void myPointCut(){}

    @Before("myPointCut()")
    public void myLogBefore(JoinPoint joinPoint){
        System.out.println("日志开始时间："+date.toString());
        System.out.println("日志输入控制台");
        System.out.println("正在执行："+joinPoint.getTarget());
    }

    @AfterThrowing(value="myPointCut()",throwing="e")
    public void myLogAfterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println("异常通知：" + "出错了" + e.getMessage());
    }

    @After("myPointCut()")
    public void myLogAfter(){
        System.out.println("运行结束");
        System.out.println("日志结束时间："+date.toString());
    }
}
