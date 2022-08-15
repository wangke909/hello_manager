package com.wangke.service.impl;

import com.wangke.mapper.UserMapper;
import com.wangke.pojo.User;
import com.wangke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        this.userMapper.insertUser(user);
    }
}
