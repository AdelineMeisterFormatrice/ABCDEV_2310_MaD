package exempleVille;

public class App {

	public static void main(String[] args) {
		
		Ville ville1 = new Ville();
		Ville ville2 = new Ville("Mulhouse","France", 118000);
		
		System.out.println(ville2.decrisToi());
		
		ville2.setNomVille("New York");
		ville2.setNomPays("USA");
		ville2.setNbhabitants(10000000);
		
		System.out.println(ville2.decrisToi());
		
		
		
	}

}
