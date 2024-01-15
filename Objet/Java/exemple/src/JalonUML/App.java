package JalonUML;

public class App {

	public static void main(String[] args) {
		
		Personne personneMajeur = new Personne("Muller","Paul",1978);
		Personne personneMineur = new Personne("Meyer","Josephine",2018);
		
		System.out.println(personneMajeur.affichage());
		System.out.println(personneMineur.affichage());

	}

}
