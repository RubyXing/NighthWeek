package com.xing.serviceImpl;/*
 * @author Xingqilin
 *
 */

import com.xing.dao.UserDao;
import com.xing.daoImpl.UserDaoImpl;
import com.xing.pojo.User;
import com.xing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("serviceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    @Override
    public void userSave(User user) {
        dao.userSave(user);
    }

    public void setUserDao(UserDaoImpl userDao) {
    }
}
