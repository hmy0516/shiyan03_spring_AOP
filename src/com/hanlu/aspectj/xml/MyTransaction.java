package com.hanlu.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author HMY
 * @date 2018/12/6-14:46
 */
public class MyTransaction {

    public Object myTranAround (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("模拟开启事务");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("模拟关闭事务");
        return obj;
    }

    public void myTranAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("事务打印：出错了" + e.getMessage()+",并回滚");
    }


}
