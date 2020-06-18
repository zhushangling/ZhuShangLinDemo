package cn.tedu.springboot_quick.mapper;

import cn.tedu.springboot_quick.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
