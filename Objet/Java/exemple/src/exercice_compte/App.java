package exercice_compte;

public class App {

	public static void main(String[] args) {
		
		Comptes livretA = new Comptes(500);
		
		livretA.afficher();
		livretA.deposer(1000);
		livretA.afficher();
		livretA.retirer(250);
		livretA.afficher();

	}

}
