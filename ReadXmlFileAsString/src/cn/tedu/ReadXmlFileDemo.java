package cn.tedu;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class ReadXmlFileDemo {
    public static String path = "";
    static {
        File f = new File(ReadXmlFileDemo.class.getResource("/").getPath());
        try {
            path = URLDecoder.decode(f.getPath(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        //路径是相对于src下的路径
        String xmlFilePath = path+"/key_test_SM2/xml/D2106请求报文data参数明文.xml";
        //将D2106请求报文data参数明文.xml文件转为了字符串
        String xml = XMLUtils.getInstance().readFileToString(xmlFilePath, "UTF-8");
        System.out.println("xml:"+xml);
        //提取head和body标签里面的内容
        String head = xml.substring(xml.lastIndexOf("<HEAD>") + "<HEAD>".length(), xml.lastIndexOf("</HEAD>"));
        String body = xml.substring(xml.lastIndexOf("<BODY>") + "<BODY>".length(), xml.lastIndexOf("</BODY>"));
        System.out.println("head="+head);
        System.out.println("body="+body);
    }

}
