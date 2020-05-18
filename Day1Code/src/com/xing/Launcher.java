package com.xing;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.User;
import com.xing.servlet.UserServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {
//        methDef1();
//
//        methDef2();

        methDef3();

    }

    private static void methDef2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-dao.xml");
//        UserServlet bean = context.getBean(UserServlet.class);
//        bean.doGet(new User());

//        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }

    private static void methDef1() {
        //       加载配置文件
//        spting context对象，spring的上下文对象
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        从IOC容器中获取对象，IOC容器用于创建和管理各个bean对象
//        User user1 = (User) context.getBean("user");
//        User user2 = (User) context.getBean("user2");

//        System.out.println(user1);
//        System.out.println(user2);
    }

    private static void methDef3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-anno.xml");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }

}
