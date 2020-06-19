package cn.tedu.springbootshiro02;

import cn.tedu.springbootshiro02.entity.User;
import cn.tedu.springbootshiro02.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootShiro02ApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testmapper(){
        User user = userService.findByName("sunny");
        System.out.println(user.toString());


    }

}
