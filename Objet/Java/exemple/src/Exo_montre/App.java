package Exo_montre;

public class App {

	public static void main(String[] args) {
		
		Montre maMontre = new Montre(13,45);
		Montre maMontre2 = new Montre(maMontre);
		Personne perso = new Personne("Michel");
		Personne perso2 = new Personne("josette");
		
		perso.porteMontre(maMontre);
		perso2.porteMontre(maMontre);
		System.out.println(perso.donneHeure());
		maMontre.avanceMinute();
		System.out.println(perso.donneHeure());
		perso.enleveMontre();
		perso2.porteMontre(maMontre);

	}

}
