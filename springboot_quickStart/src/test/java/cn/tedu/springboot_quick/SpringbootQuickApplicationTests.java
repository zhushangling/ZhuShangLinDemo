package cn.tedu.springboot_quick;

import cn.tedu.springboot_quick.entity.User;
import cn.tedu.springboot_quick.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootQuickApplicationTests {
    @Autowired(required = false)
    UserMapper userMapper;

    @Test
    public void testQueryUser(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }


}
