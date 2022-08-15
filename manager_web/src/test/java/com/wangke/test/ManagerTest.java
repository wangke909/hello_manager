package com.wangke.test;

import com.wangke.mapper.UserMapper;
import com.wangke.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest(){
        User user = new User();
        user.setUserName("王五");
        user.setUserAge(27);
        this.userMapper.insertUser(user);
    }
}
