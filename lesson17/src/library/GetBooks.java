package library;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class GetBooks {
    public static ArrayList<Book> getAllBooks() {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("D:/tms/TMS_110121/lesson17/src/library/Book.xml"));
            Element getElement = document.getDocumentElement();
            NodeList nl = getElement.getChildNodes();
            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                Book book = new Book();
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    book.setId(Integer.parseInt(element.getAttribute("id")));
                    book.setTitle(element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
                    book.setAuthor(element.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                    book.setGenre(element.getElementsByTagName("genre").item(0).getChildNodes().item(0).getNodeValue());
                    book.setYear(element.getElementsByTagName("year").item(0).getChildNodes().item(0).getNodeValue());
                    book.setCover(element.getElementsByTagName("cover").item(0).getChildNodes().item(0).getNodeValue());

                    bookArrayList.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bookArrayList;
    }
}