package exo_bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille bouteilleParDefaut = new Bouteille();
		Bouteille bouteilleEvian = new Bouteille("Evian", 1.5, 0.75, false);
		
		//boolean test1 = bouteilleParDefaut.ouvrir();
		boolean test2 = bouteilleEvian.ouvrir();
		//boolean test3 = bouteilleParDefaut.fermer();
		//boolean test4 = bouteilleEvian.fermer();
		
		//boolean test5 = bouteilleParDefaut.remplirTout();
		//boolean test6 = bouteilleEvian.remplirTout();
		//boolean test7 = bouteilleParDefaut.viderTout();
		boolean test8 = bouteilleEvian.viderTout();
		boolean test9 = bouteilleParDefaut.remplir(1.5);
		boolean test10 = bouteilleEvian.remplir(1.5);
		boolean test11 = bouteilleParDefaut.vider(0.5);
		boolean test12 = bouteilleEvian.vider(0.75);
	}

}
