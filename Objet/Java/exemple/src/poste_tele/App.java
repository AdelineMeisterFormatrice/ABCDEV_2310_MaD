package poste_tele;

public class App {

	public static void main(String[] args) {
		
		PosteDeTelevision tele1 = new PosteDeTelevision();
		PosteDeTelevision teleDuSalon = new PosteDeTelevision("Samsung","Neo QLed",43,3840,false);
		
		boolean test1 = tele1.allumer();
		boolean test2 = teleDuSalon.eteindre();
	}

}
