package files;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class FileClass {

    public static void main(String[] args)
            throws IOException, ParserConfigurationException, SAXException, TransformerException {

        Map<String, String> inData = parserFile();
        Document xml = readXml();

        inData.entrySet().forEach(e -> {
            getNode(e.getKey(), xml).setTextContent(e.getValue());
            System.out.println(getNode(e.getKey(),xml).getTextContent());
        });

        saveXml(xml);
    }

    public static void saveXml(Document doc) throws TransformerException, FileNotFoundException {
        Transformer tr = TransformerFactory.newInstance().newTransformer();
        tr.setOutputProperty(OutputKeys.METHOD, "xml");
        tr.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("C:/temp/1.xml")));
    }

    public static Element getNode(String name, Document document){

        NodeList nList = document.getChildNodes().item(0).getChildNodes();
        for(int temp = 0; temp < nList.getLength(); temp++){
            Node node = nList.item(temp);
            if((node.getNodeType() == Node.ELEMENT_NODE) &&
                    (node.getNodeName().equals(name))) {
                return (Element) node;
            }
        }

        return null;
    }

    private static Map<String, String> parserFile() throws IOException {
        HashMap<String, String> data = new HashMap<>();
        Files.readAllLines(Paths.get("C:/temp/1.txt")).forEach(
                l ->{
                    String[] tmp = l.split(": ");
                    data.put(tmp[0].trim(), tmp[1].trim());
                }
        );
        return data;
    }

    public static Document readXml() throws ParserConfigurationException, IOException, SAXException {
        File fXmlFile = new File("C:/temp/1.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc;
    }


}
