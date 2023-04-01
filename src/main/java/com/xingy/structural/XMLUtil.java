package com.xingy.structural;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.adapter.objectAdapter.XMLUtil
 * @date 2019/06/22 20:03
 * @description
 */
public class XMLUtil {
    public static Object getBean(String args, Integer index) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/main/java/config.xml"));

            //获取包含类名的文本节点
            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            String pageName = "com.xingy.structural.adapter.objectAdapter";
            Class c = null;
            nl = doc.getElementsByTagName("className");

            if (args.equalsIgnoreCase("database")) {
                nl = doc.getElementsByTagName("database");
                pageName = "com.xingy.structural.bridge.learn1";
            } else if (args.equalsIgnoreCase("file")) {
                nl = doc.getElementsByTagName("file");
                pageName = "com.xingy.structural.bridge.learn1";
            }

            index = index == null || index == 0 ? 0 : index;
            classNode = nl.item(index).getFirstChild();
            cName = pageName + "." + classNode.getNodeValue();
            //通过类名生成实例对象并返回
            c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

