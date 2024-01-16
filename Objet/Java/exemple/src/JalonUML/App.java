package JalonUML;

public class App {

	public static void main(String[] args) {
		
		// instanciation des objets de la classe Personne
		Personne personneMajeur = new Personne("Muller","Paul",1978);
		Personne personneMineur = new Personne("Meyer","Josephine",2018);
		
		System.out.println(personneMajeur.affichage());
		System.out.println(personneMineur.affichage());

	}

}
