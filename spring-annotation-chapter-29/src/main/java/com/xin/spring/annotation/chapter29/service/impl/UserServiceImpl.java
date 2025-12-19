package com.xin.spring.annotation.chapter29.service.impl;

import com.xin.spring.annotation.chapter29.bean.User;
import com.xin.spring.annotation.chapter29.dao.UserDao;
import com.xin.spring.annotation.chapter29.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author XYF
 * @date 2025-12-18 17:10
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveUser(User user) {
        userDao.saveUser(user);
        int i = 1 / 0;
    }
}
