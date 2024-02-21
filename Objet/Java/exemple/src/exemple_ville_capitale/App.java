package exemple_ville_capitale;

public class App {

	public static void main(String[] args) {
		
		//Capitale inconnu = new Capitale();
		Capitale paris = new Capitale("Paris","France",2000000,"La tour Eiffel");
		Ville Mulhouse = new Ville("Mulhouse","France",106000);
		
		System.out.println(paris.decrisToi());
		System.out.println(Mulhouse.decrisToi());

	}

}
