package superheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class App {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		Object obj = new JSONParser().parse(new FileReader("superheros.json"));
		
		JSONObject js = (JSONObject) obj;
		
		String nomEquipe = (String) js.get("nom_equipe");
		String villeOrigine = (String) js.get("ville_origine");
		JSONArray membre = (JSONArray) js.get("membre_equipe");
		String membreEquipe = "";
		for(int i = 0; i < membre.size(); i++)
		{
			membreEquipe = "\nNom : "+(String) js.get("nom")
							+"\nAge : "+js.get("age")
							+"\nIdentite Secrete : "+js.get("identite_secrete")
							+"\nPouvoirs : "+js.get("pouvoirs");
		}
		
		System.out.println("Equipe : "+nomEquipe+"\nville d'origine : "+villeOrigine+"\nMembres : "+membreEquipe);
	}

}
