package com.hanlu.aspectj.xml;

import com.hanlu.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HMY
 * @date 2018/12/6-0:21
 */
public class TestXmlAspectj {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/hanlu/aspectj/xml/applicationContext.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
//        userDao.addUser();
        userDao.deleteUser();
    }
}
