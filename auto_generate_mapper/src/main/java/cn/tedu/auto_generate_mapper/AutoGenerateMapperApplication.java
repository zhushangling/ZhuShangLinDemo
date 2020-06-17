package cn.tedu.auto_generate_mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("cn.tedu.auto_generate_mapper")//扫描mapper接口包
@SpringBootApplication
public class AutoGenerateMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoGenerateMapperApplication.class, args);
    }

}
