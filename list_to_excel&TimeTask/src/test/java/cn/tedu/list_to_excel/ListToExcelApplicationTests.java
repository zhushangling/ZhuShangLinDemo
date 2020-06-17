package cn.tedu.list_to_excel;

import cn.tedu.list_to_excel.action.QueryNoticeListAction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ListToExcelApplicationTests {
    @Autowired
    QueryNoticeListAction queryNoticeListAction;

    @Test
    void queryNoticeListActionTest() {
        queryNoticeListAction.excute();
    }

}
