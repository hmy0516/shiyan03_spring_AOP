package com.hanlu.aspectj.annoatation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author HMY
 * @date 2018/12/6-14:46
 */
public class MyTransaction {

    @Pointcut("execution(* com.hanlu.jdk.*.delete*(..))")
    private void myPointCut(){}

    @Around("myPointCut()")
    public Object myTranAround (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("模拟开启事务");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("模拟关闭事务,并回滚");
        return obj;
    }

    @AfterThrowing(value="myPointCut()",throwing="e")
    public void myTranAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("出错了" + e.getMessage());
    }

    @After("myPointCut()")
    public void myTranAfter() {
        System.out.println("释放资源");
    }
}
