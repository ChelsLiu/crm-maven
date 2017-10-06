package com.newlyfly.crm_maven.service.impl;


import com.newlyfly.crm_maven.dao.UserDao;
import com.newlyfly.crm_maven.domain.User;
import com.newlyfly.crm_maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by llf in 11:55 2017/9/28
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByUserNameAndPassword(String userName, String password) {
        return userDao.getUserByUserNameAndPassword(userName, password);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

//    @Override
//    public void save(User user) {
//        user.setUserName("1");
//        user.setPassword(MD5Utils.md5("1"));
//        userDao.save(user);
//    }
}
