package cn.tedu.list_to_excel;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("cn.tedu.list_to_excel") //指定mapper接口被扫描的包
@EnableScheduling  //表示应用可以支持定时任务
@SpringBootApplication
public class ListToExcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListToExcelApplication.class, args);
    }

}
