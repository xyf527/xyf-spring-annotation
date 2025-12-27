package com.xin.spring.annotation.chapter29.dao;

import com.xin.spring.annotation.chapter29.bean.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author XYF
 * @date 2025-12-18 17:07
 */

public interface UserDao {

    @Insert("insert into user(id, name) values (#{id}, #{name})")
    void saveUser(User user);

}
