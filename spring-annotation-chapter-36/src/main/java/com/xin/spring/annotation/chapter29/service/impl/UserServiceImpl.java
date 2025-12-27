package com.xin.spring.annotation.chapter29.service.impl;

import com.xin.spring.annotation.chapter29.bean.User;
import com.xin.spring.annotation.chapter29.dao.UserDao;
import com.xin.spring.annotation.chapter29.event.MyApplicationEvent;
import com.xin.spring.annotation.chapter29.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
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

    @Autowired
    private ApplicationEventPublisher publisher;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveUser(User user) {
        try {
            userDao.saveUser(user);
//            int i = 1 / 0;
        } finally {
            publisher.publishEvent(new MyApplicationEvent(user));
        }
    }
}
