package exo_portedegarage;

public class App {

	public static void main(String[] args) {
		
		PorteDeGarage maPorte1 = new PorteDeGarage("Leroy Merlin", true, false, 25);
		PorteDeGarage maPorte2 = new PorteDeGarage("Bricot Depot", true,false, 0);
		
		//boolean test1 = maPorte1.ouvrir();
		//boolean test2 = maPorte2.ouvrir();
		//boolean test3 = maPorte1.fermer();
		//boolean test4 = maPorte2.fermer();
		//boolean test5 = maPorte1.verrouiller();
		//boolean test6 = maPorte2.verrouiller();
		//boolean test7 = maPorte1.ouvrirPartiellement(50);
		//boolean test9 = maPorte2.deverrouiller();
		//boolean test8 = maPorte2.ouvrirPartiellement(100);
		boolean test10 = maPorte1.fermerPartiellement(25);
		boolean test11 = maPorte2.fermerPartiellement(30);

	}

}
