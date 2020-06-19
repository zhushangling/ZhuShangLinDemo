package cn.tedu.springbootshiro02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.springbootshiro02.mapper")
public class SpringbootShiro02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShiro02Application.class, args);
    }

}
