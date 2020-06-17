package cn.tedu;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * XML常用操作工具类
 *
 * @author Lanxiaowei@citic-finance.com
 * @date 2015-6-16下午3:39:10
 * @since 1.0
 */
public class XMLUtils {
    private DocumentBuilder builder;

    private XPath xpath;

    private XMLUtils() {
        init();
    }

    private static class SingletonHolder {
        private static final XMLUtils INSTANCE = new XMLUtils();
    }

    public static final XMLUtils getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private void init() {
        if (builder == null) {
            DocumentBuilderFactory domfactory = DocumentBuilderFactory
                    .newInstance();
            domfactory.setValidating(false);
            domfactory.setIgnoringComments(true);
            try {
                builder = domfactory.newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                throw new RuntimeException(
                        "Create DocumentBuilder instance occur one exception.");
            }
        }

        if (xpath == null) {
            XPathFactory xpfactory = XPathFactory.newInstance();
            xpath = xpfactory.newXPath();
        }
    }

    /**
     * @param @param  doc
     * @param @return
     * @return String
     * @throws
     * @Author: Lanxiaowei(736031305 @ qq.com)
     * @Title: document2String
     * @Description: W3C Document对象转成XML String
     */
    public String document2String(Document doc) {
        DOMSource domSource = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = tf.newTransformer();
            transformer.transform(domSource, result);
        } catch (TransformerException e) {
            throw new RuntimeException(
                    "Transformer org.w3c.dom.document object occur one exception.");
        }
        return writer.toString();
    }

    /**
     * @param path
     * @return Document
     * @throws
     * @Author Lanxiaowei
     * @Title: parseDocument
     * @Description: 根据XML路径解析XML文档
     */
    public Document parseDocument(String path) {
        try {
            return builder.parse(path);
        } catch (SAXException e) {
            throw new RuntimeException(
                    "The xml path is invalid or parsing xml occur exception.");
        } catch (IOException e) {
            throw new RuntimeException(
                    "The xml path is invalid or parsing xml occur exception.");
        }
    }

    /**
     * @param file
     * @return Document
     * @throws
     * @Author Lanxiaowei
     * @Title: parseDocument
     * @Description: 根据文件解析XML文档
     */
    public Document parseDocument(File file) {
        try {
            return builder.parse(file);
        } catch (SAXException e) {
            throw new RuntimeException(
                    "The input xml file is null or parsing xml occur exception.");
        } catch (IOException e) {
            throw new RuntimeException(
                    "The input xml file is null or parsing xml occur exception.");
        }

    }

    /**
     * @param is
     * @return Document
     * @throws IOException
     * @throws SAXException
     * @throws
     * @Author Lanxiaowei
     * @Title: parseDocument
     * @Description: 根据输入流解析XML文档
     */
    public Document parseDocument(InputStream is) {
        try {
            return builder.parse(is);
        } catch (SAXException e) {
            throw new RuntimeException(
                    "The input xml fileInputStream is null or parsing xml occur exception.");
        } catch (IOException e) {
            throw new RuntimeException(
                    "The input xml fileInputStream is null or parsing xml occur exception.");
        }
    }

    /**
     * @param @param  fragment
     * @param @return
     * @return Document
     * @throws
     * @Author: Lanxiaowei(736031305 @ qq.com)
     * @Title: fragment2Document
     * @Description: 将html代码片段转换成document对象
     */
    public Document fragment2Document(String fragment) {
        try {
            return builder.parse(new InputSource(new StringReader(fragment)));
        } catch (SAXException e) {
            throw new RuntimeException(
                    "parse fragment to document occur SAXException,please check your fragment.");
        } catch (IOException e) {
            throw new RuntimeException(
                    "parse fragment to document occur one IOException.");
        }
    }

    /**
     * @param node
     * @param expression
     * @return NodeList
     * @throws XPathExpressionException
     * @throws
     * @Author Lanxiaowei
     * @Title: selectNodes
     * @Description: 通过xpath获取节点列表
     */
    public NodeList selectNodes(Node node, String expression) {
        XPathExpression xpexpreesion = null;
        try {
            xpexpreesion = this.xpath.compile(expression);
            return (NodeList) xpexpreesion.evaluate(node,
                    XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(
                    "Compile xpath expression occur excetion,please check out your xpath expression.");
        }
    }

    /**
     * @param node
     * @param expression
     * @return Node
     * @throws
     * @Author Lanxiaowei
     * @Title: selectSingleNode
     * @Description: 通过xpath获取单个节点
     */
    public Node selectSingleNode(Node node, String expression) {
        XPathExpression xpexpreesion = null;
        try {
            xpexpreesion = this.xpath.compile(expression);
            return (Node) xpexpreesion.evaluate(node, XPathConstants.NODE);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(
                    "Compile xpath expression occur excetion,please check out your xpath expression.");
        }
    }

    /**
     * @param node
     * @param expression
     * @return String
     * @throws
     * @Author Lanxiaowei
     * @Title: getNodeText
     * @Description: 根据xpath获取节点的文本值(只返回匹配的第一个节点的文本值)
     */
    public String getNodeText(Node node, String expression) {
        XPathExpression xpexpreesion = null;
        try {
            xpexpreesion = this.xpath.compile(expression);
            return (String) xpexpreesion.evaluate(node, XPathConstants.STRING);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(
                    "Compile xpath expression occur excetion,please check out your xpath expression.");
        }
    }

    /**
     * @param @param  node
     * @param @param  expression
     * @param @return
     * @return List<String>
     * @throws
     * @Author: Lanxiaowei(736031305 @ qq.com)
     * @Title: getMultiNodeText
     * @Description: 根据xpath获取节点的文本值(若xpath表达式匹配到多个节点, 则会提取所有匹配到节点的文本值)
     */
    public List<String> getMultiNodeText(Node node, String expression) {
        NodeList nodeList = selectNodes(node, expression);
        if (null == nodeList || nodeList.getLength() == 0) {
            return null;
        }
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node n = nodeList.item(i);
            String text = n.getTextContent();
            list.add(text);
        }
        return list;
    }

    /**
     * @param @param  node
     * @param @param  expression
     * @param @param  atrributeName
     * @param @return
     * @return String
     * @throws
     * @Author: Lanxiaowei(736031305 @ qq.com)
     * @Title: getNodeAttributeValue
     * @Description: 根据xpath获取节点的属性值(若xpath表达式匹配到多个节点, 则只会提取匹配到的第一个节点的属性值)
     */
    public String getNodeAttributeValue(Node node,
                                        String expression, String atrributeName) {
        Node matchNode = selectSingleNode(node, expression);
        if (null == matchNode) {
            return null;
        }
        Node attNode = matchNode.getAttributes().getNamedItem(
                atrributeName);
        if (null == attNode) {
            return null;
        }
        return attNode.getNodeValue();
    }

    /**
     * @param @param  node
     * @param @param  expression      Xpath表达式,如div\span[@class]
     * @param @param  atrributeName   属性名称
     * @param @return
     * @return List<String>
     * @throws
     * @Author: Lanxiaowei(736031305 @ qq.com)
     * @Title: getMultiNodeAttributeValue
     * @Description: 根据xpath获取节点的属性值(若xpath表达式匹配到多个节点, 则会提取所有匹配到节点的属性值)
     */
    public List<String> getMultiNodeAttributeValue(Node node, String expression, String atrributeName) {
        NodeList nodeList = selectNodes(node, expression);
        if (null == nodeList || nodeList.getLength() == 0) {
            return null;
        }
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node currentItem = nodeList.item(i);
            Node attNode = currentItem.getAttributes().getNamedItem(atrributeName);
            if (null == attNode) {
                continue;
            }
            String val = currentItem.getAttributes().getNamedItem(atrributeName).getNodeValue();
            list.add(val);
        }
        return list;
    }

    /**
     * 将文件都成XML串
     *
     * @param xmlFilePath
     * @param charSet
     * @return
     * @throws IOException
     */
    public String readFileToString(String xmlFilePath, String charSet) throws IOException {
        StringBuffer resultSting = new StringBuffer();
        BufferedReader br = null;
        String line = "";
        InputStreamReader in = null;
        try {
            //3.获取返回报文
            in = new InputStreamReader(
                    new FileInputStream(new File(xmlFilePath)), charSet);
            br = new BufferedReader(in);
            for (line = br.readLine(); line != null; line = br.readLine()) {
                resultSting.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return resultSting.toString();
    }

    public static String htmlEncode(String source) {
        if (source == null) {
            return "";
        }
        String html = "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            switch (c) {
                case '<':
                    buffer.append("&lt;");
                    break;
                case '>':
                    buffer.append("&gt;");
                    break;
                case '&':
                    buffer.append("&amp;");
                    break;
                case '"':
                    buffer.append("&quot;");
                    break;
                case 10:
                case 13:
                    break;
                default:
                    buffer.append(c);
            }
        }
        html = buffer.toString();
        return html;
    }

    public  String htmlDecode(String source) {
        if (source == null) {
            return "";
        }
        String newTarget = source
                .replaceAll("&lt;", "<")
                .replaceAll("&gt;", ">")
                .replaceAll("&amp;", "&")
                .replaceAll("&quot;", "\"");
        return newTarget;
    }

    public static void main(String[] args) {
        String fragment = "<data><employee><name id=\"1\">益达</name><name id=\"2\">yida</name><title>Manager</title></employee></data>";
        String fragment1 = "<soap:Envelope><soap:Body><ns2:serviceAndFileResponse xmlns:ns2=\"http://webservice.gpp.ws.rfp.com/\"><return>&lt;DOCUMENT&gt;&lt;MSG&gt;&lt;ERRCODE&gt;100002&lt;/ERRCODE&gt;&lt;ERRMSG&gt;应用错误：null&lt;/ERRMSG&gt;&lt;ERRCONTENT&gt;&lt;/ERRCONTENT&gt;&lt;/MSG&gt;&lt;/DOCUMENT&gt;</return></ns2:serviceAndFileResponse></soap:Body></soap:Envelope>";
        XMLUtils util = XMLUtils.getInstance();
        Document doc = util.fragment2Document(fragment);
  /*      List<String> strList = util.getMultiNodeText(doc, "//employee");
        System.out.println(strList.get(0));
        strList = util.getMultiNodeAttributeValue(doc, "//employee/name[@id]", "id");
        System.out.println(strList.get(0));*/
        Document doc1 = util.fragment2Document(fragment1);
        List<String> strList = util.getMultiNodeText(doc1, "return");
        System.out.println(strList.get(0));
        strList = util.getMultiNodeAttributeValue(doc1, "//employee/name[@id]", "id");
        System.out.println(strList.get(0));
    }
}