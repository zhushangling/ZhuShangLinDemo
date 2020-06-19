package cn.tedu.springbootshiro02.mapper;

import cn.tedu.springbootshiro02.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User findByName(String name);
}
