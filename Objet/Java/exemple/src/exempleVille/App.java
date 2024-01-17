package exempleVille;

public class App {

	public static void main(String[] args) {
		
		Ville ville1 = new Ville();
		Ville ville2 = new Ville("Marseille","France", 870000);
		Ville ville3 = new Ville("Mulhouse", "France", 108000);
		Ville ville4 = new Ville("Paris", "France", 2000000);
		
		System.out.println(ville2.decrisToi());
		System.out.println(ville2.comparerVille(ville3));
		System.out.println("Le nombre d'instance de la classe Ville est : "+Ville.getNbInstances());
		
		
		
		
		
	}

}
