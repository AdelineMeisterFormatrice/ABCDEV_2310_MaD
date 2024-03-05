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
	
	public static void creationListe(NodeList uneListe)
	{
		for(int temp = 0; temp <uneListe.getLength(); temp++)
		{
			Node nNode = uneListe.item(temp);
			if(nNode.getNodeType() == Node.ELEMENT_NODE)
			{
				Element eElement = (Element) nNode;
				System.out.println(nNode.getNodeName()+" id : " + eElement.getAttribute("id"));
				System.out.println("Nom : " + eElement.getElementsByTagName("nom").item(0).getTextContent());
				System.out.println("Prix : " + eElement.getElementsByTagName("prix").item(0).getTextContent()+" Euros");
				System.out.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
			}
		}
	}

	public static void main(String[] args) throws ParserConfigurationException, SAXException {
		try {
			File file = new File("menu.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(file);
			document.getDocumentElement().normalize();
			System.out.println("Root Element :" + document.getDocumentElement().getNodeName());
			NodeList listeEntree = document.getElementsByTagName("entree");
			System.out.println("------------------------------");
			creationListe(listeEntree);
			NodeList listPlat = document.getElementsByTagName("plat");
			System.out.println("------------------------------");
			creationListe(listPlat);
			NodeList listeDessert = document.getElementsByTagName("dessert");
			System.out.println("------------------------------");
			creationListe(listeDessert);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
