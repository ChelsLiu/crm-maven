package com.newlyfly.crm_maven.dao;

import com.newlyfly.crm_maven.domain.User;

/**
 * Created by llf in 11:53 2017/9/28
 */
public interface UserDao extends BaseDao<User>{
    // 根据用户名和密码查询用户
    User getUserByUserNameAndPassword(String userName, String password);

    // 根据用户名查询单条用户
    User getUserByUserName(String userName);

}
