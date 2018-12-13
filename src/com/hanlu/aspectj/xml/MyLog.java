package com.hanlu.aspectj.xml;

import org.aspectj.lang.JoinPoint;

import java.util.Date;

/**
 * @author HMY
 * @date 2018/12/6-14:13
 */
public class MyLog {
    Date date= new Date();
    public void myLogBefore(JoinPoint joinPoint){
        System.out.println("日志开始时间："+date.toString());
        System.out.println("日志输入控制台");
        System.out.println("正在执行："+joinPoint.getTarget());
    }

    public void myLogAfterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println("日志异常打印：" + "出错了" + e.getMessage());
    }
    public void myLogAfterReturning(JoinPoint joinPoint) {
        System.out.print("模拟记录日志,方法成功" );
    }

    public void myLogAfter(){
        System.out.println("运行结束");
        System.out.println("日志结束时间："+date.toString());
    }
}
