package exo_voiture;

public class App {

	public static void main(String[] args) {
		
		Voiture voiture1 = new Voiture();
		Voiture voiture2 = new Voiture("Renault",25000.0);
		
		voiture1.afficher();
		voiture1.setMarque("Peugeot");
		voiture1.setPrix(35000.0);
		voiture1.afficher();
		voiture2.afficher();
	}

}
