package exo_bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille bouteilleParDefaut = new Bouteille();
		Bouteille bouteilleEvian = new Bouteille("Evian", 1.5, 1.5, false);
		
		//boolean test1 = bouteilleParDefaut.ouvrir();
		boolean test2 = bouteilleEvian.ouvrir();
		//boolean test3 = bouteilleParDefaut.fermer();
		//boolean test4 = bouteilleEvian.fermer();
		
		boolean test5 = bouteilleParDefaut.remplirTout();
		boolean test6 = bouteilleEvian.remplirTout();

	}

}
