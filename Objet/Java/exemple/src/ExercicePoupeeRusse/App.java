package ExercicePoupeeRusse;

public class App {

	public static void main(String[] args) {
		
		PoupeeRusse poupee1 = new PoupeeRusse('A',2);
		PoupeeRusse poupee2 = new PoupeeRusse('B',4);
		
		boolean test1 = poupee2.ouvrir();
		boolean test2 = poupee1.placerDans(poupee2);
		boolean test3 = poupee1.sortirDe(poupee2);

	}

}
