package cn.tedu;

public class Demo01 {

    public static void main(String[] args) {
        String responseMsg= "<DOCUMENT><TITLE>gpp_test</TITLE><HEAD></HEAD><BODY></BODY><MSG><ERRCODE>110001</ERRCODE><ERRMSG>异常信息：收到信息格式不合法.</ERRMSG></MSG></DOCUMENT>";

        String rspMsgStr = responseMsg.substring(responseMsg.lastIndexOf("<MSG>") + "<MSG>".length(),
                responseMsg.lastIndexOf("</MSG>"));
        String errCodeStr = rspMsgStr.substring(rspMsgStr.lastIndexOf("<ERRCODE>") + "<ERRCODE>".length(),
                rspMsgStr.lastIndexOf("</ERRCODE>"));
        String errMsgStr = rspMsgStr.substring(rspMsgStr.lastIndexOf("<ERRMSG>") + "<ERRMSG>".length(),
                rspMsgStr.lastIndexOf("</ERRMSG>"));
        System.out.println("rspMsgStr="+rspMsgStr);
        System.out.println("errCodeStr="+errCodeStr);
        System.out.println("errMsgStr="+errMsgStr);
    }
}
