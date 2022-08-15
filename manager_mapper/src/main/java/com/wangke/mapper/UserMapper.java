package com.wangke.mapper;

import com.wangke.pojo.User;
import java.util.List;

public interface UserMapper {
    void insertUser(User user);
    List<User> selectAllUser();
}
