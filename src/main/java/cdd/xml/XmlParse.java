package cdd.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlParse {

    /**
     * DOM解析
     * 四个核心操作：Document Node NodeList NamedNodeMap
     */
    public static void doParse01() {
        String path = "E:\\repository\\learn01\\src\\main\\resources\\xml01.xml";
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            doc = documentBuilder.parse(new File(path));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        NodeList teacher = doc.getElementsByTagNameNS("*", "teacher");
        Node item = teacher.item(0);
        Element el = (Element) item;
        String teacherName = el.getElementsByTagNameNS("*", "name").item(0).getTextContent();

    }
}
