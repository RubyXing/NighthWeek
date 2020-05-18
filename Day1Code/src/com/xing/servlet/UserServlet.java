package com.xing.servlet;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.User;
import com.xing.service.UserService;
import com.xing.serviceImpl.UserServiceImpl;

public class UserServlet {
    UserService service = new UserServiceImpl();

    public void doGet(User user){
        service.userSave(user);
    }
}
