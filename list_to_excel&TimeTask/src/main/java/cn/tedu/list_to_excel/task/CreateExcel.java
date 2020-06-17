package cn.tedu.list_to_excel.task;

import cn.tedu.list_to_excel.action.QueryNoticeListAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CreateExcel {
    private Logger logger = LoggerFactory.getLogger(CreateExcel.class);
    @Autowired
    QueryNoticeListAction queryNoticeListAction;

    @Scheduled(cron = "0 0/2 * * * ?") //每2分钟生成一次Excel
    public void createExcelAtMr(){
        logger.info("---开始生成Excel---");
        queryNoticeListAction.excute();
        logger.info("---完成生成Excel---");
    }
}
