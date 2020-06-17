package cn.tedu;

public class XmlStrToObjectDemo {
    public static void main(String[] args) {
        String reqHead = "\t<HEAD>\n" +
                "\t\t<TRANSCODE>D2106</TRANSCODE>\n" +
                "\t\t<MSGID>67A1FC3ED5DB646E2E15505551972834053</MSGID>\n" +
                "\t\t<ORGNLMSGID>begin123456789123456789</ORGNLMSGID>\n" +
                "\t\t<SESSIONNO></SESSIONNO>\n" +
                "\t\t<SENDDATE>20190219</SENDDATE>\n" +
                "\t\t<SENDTIME>134637</SENDTIME>\n" +
                "\t\t<ERRCODE>000000</ERRCODE>\n" +
                "\t\t<ERRMSG></ERRMSG>\n" +
                "\t\t<MARK1></MARK1>\n" +
                "\t\t<MARK2></MARK2>\n" +
                "\t\t<MARK3></MARK3>\n" +
                "\t</HEAD>";
        String reqBody = "<BODY>\n" +
                "\t\t<LIST>\n" +
                "\t\t\t<ANN_INFO>\n" +
                "\t\t\t\t<ANN_CODE>ann_001</ANN_CODE>\n" +
                "\t\t\t\t<STATUS>1</STATUS>\n" +
                "\t\t\t\t<CONFIRM_TIME>20171231120000</CONFIRM_TIME>\n" +
                "\t\t\t\t<PROCUREMENT_TYPE>1</PROCUREMENT_TYPE>\n" +
                "\t\t\t\t<PLAN_NUMBER>plan_001</PLAN_NUMBER>\n" +
                "\t\t\t\t<PROJECT_NAME>延迟送货1</PROJECT_NAME>\n" +
                "\t\t\t\t<TOTAL>123456789012345678.12</TOTAL>\n" +
                "\t\t\t\t<DEPARTMENT_NAME>延迟送货1</DEPARTMENT_NAME>\n" +
                "\t\t\t\t<AGENCY_NAME>延迟送货1</AGENCY_NAME>\n" +
                "\t\t\t\t<SUPPLIER_NAME>供应商1</SUPPLIER_NAME>\n" +
                "\t\t\t\t<SUPPLIER_ID>supp1</SUPPLIER_ID>\n" +
                "\t\t\t\t<OBJ_TYPE>1</OBJ_TYPE>\n" +
                "\t\t\t\t<JAT_TPS_NUM>2</JAT_TPS_NUM>\n" +
                "\t\t\t\t<MARK1>a</MARK1>\n" +
                "\t\t\t\t<MARK2>a</MARK2>\n" +
                "\t\t\t\t<MARK3>a</MARK3>\n" +
                "\t\t\t\t<MARK4>a</MARK4>\n" +
                "\t\t\t\t<MARK5>a</MARK5>\n" +
                "\t\t\t\t<LIST>\n" +
                "\t\t\t\t\t<JAT_TP_INFO>\n" +
                "\t\t\t\t\t\t<JAT_TP_PRO_ID>pro_1001</JAT_TP_PRO_ID>\n" +
                "\t\t\t\t\t\t<JAT_TP_PRO_NAME>教育局配送</JAT_TP_PRO_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TPS_PRO_ID>ann_jat_1001</JAT_TPS_PRO_ID>\n" +
                "\t\t\t\t\t\t<JAT_TPS_NAME>1001</JAT_TPS_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TPS_CONTENT>asdflkajque91010920990</JAT_TPS_CONTENT>\n" +
                "\t\t\t\t\t\t<JAT_TP_PEOPLE_NAME>供应商1</JAT_TP_PEOPLE_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TP_PEOPLE_ID>supp1</JAT_TP_PEOPLE_ID>\n" +
                "\t\t\t\t\t\t<JAT_WIN_PRICE>123456789012345678.12</JAT_WIN_PRICE>\n" +
                "\t\t\t\t\t\t<JAT_WIN_TIME>20171231120000</JAT_WIN_TIME>\n" +
                "\t\t\t\t\t\t<OBJ_TYPE>1</OBJ_TYPE>\n" +
                "\t\t\t\t\t\t<MARK1>a</MARK1>\n" +
                "\t\t\t\t\t\t<MARK2>a</MARK2>\n" +
                "\t\t\t\t\t\t<MARK3>a</MARK3>\n" +
                "\t\t\t\t\t\t<MARK4>a</MARK4>\n" +
                "\t\t\t\t\t\t<MARK5>a</MARK5>\n" +
                "\t\t\t\t\t</JAT_TP_INFO>\n" +
                "\t\t\t\t\t<JAT_TP_INFO>\n" +
                "\t\t\t\t\t\t<JAT_TP_PRO_ID>pro_1002</JAT_TP_PRO_ID>\n" +
                "\t\t\t\t\t\t<JAT_TP_PRO_NAME>教育局配送</JAT_TP_PRO_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TPS_PRO_ID>ann_jat_1002</JAT_TPS_PRO_ID>\n" +
                "\t\t\t\t\t\t<JAT_TPS_NAME>1002</JAT_TPS_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TPS_CONTENT>asdflkajque91010920990</JAT_TPS_CONTENT>\n" +
                "\t\t\t\t\t\t<JAT_TP_PEOPLE_NAME>供应商1</JAT_TP_PEOPLE_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TP_PEOPLE_ID>supp1</JAT_TP_PEOPLE_ID>\n" +
                "\t\t\t\t\t\t<JAT_WIN_PRICE>123456789012345678.12</JAT_WIN_PRICE>\n" +
                "\t\t\t\t\t\t<JAT_WIN_TIME>20171231120000</JAT_WIN_TIME>\n" +
                "\t\t\t\t\t\t<OBJ_TYPE>1</OBJ_TYPE>\n" +
                "\t\t\t\t\t\t<MARK1>a</MARK1>\n" +
                "\t\t\t\t\t\t<MARK2>a</MARK2>\n" +
                "\t\t\t\t\t\t<MARK3>a</MARK3>\n" +
                "\t\t\t\t\t\t<MARK4>a</MARK4>\n" +
                "\t\t\t\t\t\t<MARK5>a</MARK5>\n" +
                "\t\t\t\t\t</JAT_TP_INFO>\n" +
                "\t\t\t\t</LIST>\n" +
                "\t\t\t</ANN_INFO>\n" +
                "\t\t\t<ANN_INFO>\n" +
                "\t\t\t\t<ANN_CODE>ann_002</ANN_CODE>\n" +
                "\t\t\t\t<STATUS>1</STATUS>\n" +
                "\t\t\t\t<CONFIRM_TIME>20171231120000</CONFIRM_TIME>\n" +
                "\t\t\t\t<PROCUREMENT_TYPE>1</PROCUREMENT_TYPE>\n" +
                "\t\t\t\t<PLAN_NUMBER>plan_002</PLAN_NUMBER>\n" +
                "\t\t\t\t<PROJECT_NAME>延迟送货2</PROJECT_NAME>\n" +
                "\t\t\t\t<TOTAL>123456789012345678.12</TOTAL>\n" +
                "\t\t\t\t<DEPARTMENT_NAME>延迟送货2</DEPARTMENT_NAME>\n" +
                "\t\t\t\t<AGENCY_NAME>延迟送货2</AGENCY_NAME>\n" +
                "\t\t\t\t<SUPPLIER_NAME>供应商1</SUPPLIER_NAME>\n" +
                "\t\t\t\t<SUPPLIER_ID>supp1</SUPPLIER_ID>\n" +
                "\t\t\t\t<OBJ_TYPE>1</OBJ_TYPE>\n" +
                "\t\t\t\t<JAT_TPS_NUM>2</JAT_TPS_NUM>\n" +
                "\t\t\t\t<MARK1>a</MARK1>\n" +
                "\t\t\t\t<MARK2>a</MARK2>\n" +
                "\t\t\t\t<MARK3>a</MARK3>\n" +
                "\t\t\t\t<MARK4>a</MARK4>\n" +
                "\t\t\t\t<MARK5>a</MARK5>\n" +
                "\t\t\t\t<LIST>\n" +
                "\t\t\t\t\t<JAT_TP_INFO>\n" +
                "\t\t\t\t\t\t<JAT_TP_PRO_ID>pro_2001</JAT_TP_PRO_ID>\n" +
                "\t\t\t\t\t\t<JAT_TP_PRO_NAME>教育局配送</JAT_TP_PRO_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TPS_PRO_ID>ann_jat_2001</JAT_TPS_PRO_ID>\n" +
                "\t\t\t\t\t\t<JAT_TPS_NAME>2001</JAT_TPS_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TPS_CONTENT>asdflkajque91010920990</JAT_TPS_CONTENT>\n" +
                "\t\t\t\t\t\t<JAT_TP_PEOPLE_NAME>供应商1</JAT_TP_PEOPLE_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TP_PEOPLE_ID>supp1</JAT_TP_PEOPLE_ID>\n" +
                "\t\t\t\t\t\t<JAT_WIN_PRICE>123456789012345678.12</JAT_WIN_PRICE>\n" +
                "\t\t\t\t\t\t<JAT_WIN_TIME>20171231120000</JAT_WIN_TIME>\n" +
                "\t\t\t\t\t\t<OBJ_TYPE>1</OBJ_TYPE>\n" +
                "\t\t\t\t\t\t<MARK1>a</MARK1>\n" +
                "\t\t\t\t\t\t<MARK2>a</MARK2>\n" +
                "\t\t\t\t\t\t<MARK3>a</MARK3>\n" +
                "\t\t\t\t\t\t<MARK4>a</MARK4>\n" +
                "\t\t\t\t\t\t<MARK5>a</MARK5>\n" +
                "\t\t\t\t\t</JAT_TP_INFO>\n" +
                "\t\t\t\t\t<JAT_TP_INFO>\n" +
                "\t\t\t\t\t\t<JAT_TP_PRO_ID>pro_2002</JAT_TP_PRO_ID>\n" +
                "\t\t\t\t\t\t<JAT_TP_PRO_NAME>教育局配送</JAT_TP_PRO_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TPS_PRO_ID>ann_jat_2002</JAT_TPS_PRO_ID>\n" +
                "\t\t\t\t\t\t<JAT_TPS_NAME>2002</JAT_TPS_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TPS_CONTENT>asdflkajque91010920990</JAT_TPS_CONTENT>\n" +
                "\t\t\t\t\t\t<JAT_TP_PEOPLE_NAME>供应商1</JAT_TP_PEOPLE_NAME>\n" +
                "\t\t\t\t\t\t<JAT_TP_PEOPLE_ID>supp1</JAT_TP_PEOPLE_ID>\n" +
                "\t\t\t\t\t\t<JAT_WIN_PRICE>123456789012345678.12</JAT_WIN_PRICE>\n" +
                "\t\t\t\t\t\t<JAT_WIN_TIME>20171231120000</JAT_WIN_TIME>\n" +
                "\t\t\t\t\t\t<OBJ_TYPE>1</OBJ_TYPE>\n" +
                "\t\t\t\t\t\t<MARK1>a</MARK1>\n" +
                "\t\t\t\t\t\t<MARK2>a</MARK2>\n" +
                "\t\t\t\t\t\t<MARK3>a</MARK3>\n" +
                "\t\t\t\t\t\t<MARK4>a</MARK4>\n" +
                "\t\t\t\t\t\t<MARK5>a</MARK5>\n" +
                "\t\t\t\t\t</JAT_TP_INFO>\n" +
                "\t\t\t\t</LIST>\n" +
                "\t\t\t</ANN_INFO>\n" +
                "\t\t</LIST>\n" +
                "\t</BODY>";

        //将reqHead转为PubReqBo对象
        PubReqBo pubReqBo = XMLUtil.convertXmlStrToObject(PubReqBo.class,
                reqHead);
        System.out.println(pubReqBo.toString());


        //将reqBody转为D2106ReqBo对象
        Class<?> clazz = null;
        try {
            clazz = Class.forName("cn.tedu.D2106ReqBo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //将xml字符串reqBody，转为clazz对象
        Object obj = XMLUtil.convertXmlStrToObject(clazz, reqBody);
        D2106ReqBo d2106ReqBo = (D2106ReqBo)obj;
        System.out.println(d2106ReqBo.toString());

    }
}
