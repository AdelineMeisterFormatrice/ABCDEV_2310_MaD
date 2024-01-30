package Exo_montre;

public class App {

	public static void main(String[] args) {
		
		Montre maMontre = new Montre(23,59);
		Montre maMontre2 = new Montre(maMontre);
		Personne perso = new Personne("Michel");
		Personne perso2 = new Personne("josette");
		
		perso.porteMontre(maMontre);
		perso2.porteMontre(maMontre2);
		System.out.println(perso.donneHeure());
		System.out.println(perso2.donneHeure());
		maMontre.avanceMinute();
		System.out.println(perso.donneHeure());
		System.out.println(perso2.donneHeure());
		perso.enleveMontre();
		perso2.enleveMontre();
		perso2.porteMontre(maMontre);
		perso.porteMontre(maMontre2);
		System.out.println(perso.donneHeure());
		System.out.println(perso2.donneHeure());
		

	}

}
