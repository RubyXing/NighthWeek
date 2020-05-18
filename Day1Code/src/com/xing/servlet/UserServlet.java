package com.xing.servlet;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.User;
import com.xing.service.UserService;
import com.xing.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("servlet")
public class UserServlet {
    @Autowired
    UserService service;

    public void doGet(User user) {
        service.userSave(user);
    }

    public void setUserService(UserServiceImpl userService) {
    }
}
