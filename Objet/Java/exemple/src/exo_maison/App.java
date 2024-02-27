package exo_maison;

public class App {

	public static void main(String[] args) {
		
		Maison maMaison = new Maison(200);
		Personne personne1 = new Personne("Adeline",maMaison);
		Porte unePorte = new Porte("Rouge");
		maMaison.setPorte(unePorte);
		//System.out.println(personne1);
		
		Appartement monAppartement = new Appartement();
		Personne personne2 = new Personne();
		personne2.setNom("David");
		personne2.setMaison(monAppartement);
		monAppartement.setPorte(unePorte);
		monAppartement.setSurface(125);
		System.out.println(personne2);

	}

}
