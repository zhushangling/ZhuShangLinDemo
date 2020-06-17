package cn.tedu;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
    @Test
    public void testQuick(){
        //1.获取日志记录器对象
        Logger logger = Logger.getLogger(Log4jTest.class);
        //2.日志记录输出
        logger.info("hello log4j");
    }
}
