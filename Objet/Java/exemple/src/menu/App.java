package menu;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class App {

	public static void main(String[] args) throws ParserConfigurationException, SAXException {
		try {
			File file = new File("menu.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(file);
			document.getDocumentElement().normalize();
			System.out.println("Root Element :" + document.getDocumentElement().getNodeName());
			NodeList nList = document.getElementsByTagName("entree");
			System.out.println("------------------------------");
			for(int temp = 0; temp < nList.getLength(); temp++)
			{
				Node nNode = nList.item(temp);
				System.out.println("\nElement courant : " + nNode.getNodeName());
				if(nNode.getNodeType() == Node.ELEMENT_NODE)
				{
					Element eElement = (Element) nNode;
					System.out.println("Entrée id : " + eElement.getAttribute("id"));
					System.out.println("Nom : " + eElement.getElementsByTagName("nom").item(0).getTextContent());
					System.out.println("Prix : " + eElement.getElementsByTagName("prix").item(0).getTextContent()+" Euros");
					System.out.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
