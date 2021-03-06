package cn.tedu.springbootshiro02.service.impl;

import cn.tedu.springbootshiro02.entity.User;
import cn.tedu.springbootshiro02.mapper.UserMapper;
import cn.tedu.springbootshiro02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
