package com.hanlu.aspectj.annoatation;

import com.hanlu.jdk.UserDao;
import com.hanlu.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// 测试类
public class TestAnnotationAspectj {
	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hanlu/aspectj/annoatation/applicationContext.xml");
		UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
//		userDao.addUser();
		userDao.deleteUser();
	}
}
