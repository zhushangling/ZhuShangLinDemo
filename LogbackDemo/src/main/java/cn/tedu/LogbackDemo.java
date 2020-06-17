package cn.tedu;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
   public static final Logger logger = LoggerFactory.getLogger(LogbackDemo.class);

    @Test
    public void testQuick(){
        logger.info("hello logback");

    }
}
