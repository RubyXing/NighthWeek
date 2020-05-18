package com.xing.daoImpl;/*
 * @author Xingqilin
 *
 */

import com.xing.dao.UserDao;
import com.xing.pojo.User;
import org.springframework.stereotype.Component;

@Component("userDaoImpl")
public class UserDaoImpl implements UserDao {

    @Override
    public void userSave(User user) {
        System.out.println("保存了"+ user);
    }
}
