package cn.tedu.auto_generate_mapper;

import cn.tedu.auto_generate_mapper.entity.user.TUser;
import cn.tedu.auto_generate_mapper.mapper.user.TUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AutoGenerateMapperApplicationTests {
    @Autowired(required = false)
    TUserMapper tUserMapper;

    @Test
    void userMapperInsertTest() {
        TUser tUser = new TUser();
        tUser.setUsername("周大大");
        tUser.setPhone("19999999");
        tUser.setEmail("xidada@163.com");
        tUser.setGender(1);
        tUser.setPassword("11111");
        int insert = tUserMapper.insert(tUser);
        System.out.println("是否插入成功："+insert);
    }

    @Test
    void userMapperDeleteByPrimaryKeyTest() {
        TUser tUser = new TUser();
        tUser.setUid(30);
        int delete = tUserMapper.deleteByPrimaryKey(tUser);
        System.out.println("是否删除成功："+delete);
    }

    @Test
    void userMapperUpdateByPrimaryKeySelectiveTest() {
        TUser tUser = new TUser();
        tUser.setUid(31);
        tUser.setPassword("222");
        int update = tUserMapper.updateByPrimaryKeySelective(tUser);
        System.out.println("是否修改成功："+update);
    }

    @Test
    void userMapperSelectByPrimaryKeySelectiveTest() {
        TUser tUser = new TUser();
        tUser.setUid(31);
        TUser tUser1 = tUserMapper.selectByPrimaryKey(tUser);
        System.out.println("是否查询成功："+tUser1.toString());
    }

    @Test
    void userMapperSelectBAllTest() {

        List<TUser> tUsers = tUserMapper.selectAll();
        System.out.println(tUsers);

    }


}
