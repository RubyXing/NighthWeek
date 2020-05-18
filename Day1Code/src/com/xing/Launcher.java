package com.xing;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main(String[] args) {
//       加载配置文件
//        spting context对象，spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        从IOC容器中获取对象，IOC容器用于创建和管理各个bean对象
        User user1 = (User) context.getBean("user");

        User user2 = (User) context.getBean("user2");

        System.out.println(user1);
        System.out.println(user2);

    }
}
