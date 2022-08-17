package hw_15.task_1;

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

public class DomParserExample {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File xmlFile = new File("src/main/java/hw_15/task_1/Students.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);

        NodeList nList = doc.getElementsByTagName("student");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.println("Student group no : "
                        + eElement
                        .getElementsByTagName("group")
                        .item(0)
                        .getTextContent());
                System.out.println("First Name : "
                        + eElement
                        .getElementsByTagName("name")
                        .item(0)
                        .getTextContent());
                System.out.println("Surname : "
                        + eElement
                        .getElementsByTagName("surname")
                        .item(0)
                        .getTextContent());
                System.out.println("Faculty : "
                        + eElement
                        .getElementsByTagName("faculty")
                        .item(0)
                        .getTextContent());
            }
        }
    }
}

