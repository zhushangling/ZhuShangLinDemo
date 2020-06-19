package cn.tedu.springbootshiro02.service;

import cn.tedu.springbootshiro02.entity.User;

public interface UserService {
    public User findByName(String name);
}
