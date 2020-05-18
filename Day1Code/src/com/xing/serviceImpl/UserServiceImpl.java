package com.xing.serviceImpl;/*
 * @author Xingqilin
 *
 */

import com.xing.dao.UserDao;
import com.xing.daoImpl.UserDaoImpl;
import com.xing.pojo.User;
import com.xing.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao dao = new UserDaoImpl();
    @Override
    public void userSave(User user) {
        dao.userSave(user);
    }
}
