package ExempleExpressionBooleenne;

public class App {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 5;
		int c = 7;
		// test1 est vrai si a < b
		boolean test1 = (a < b);
		// test2 est vrai si a < b ET a > c
		boolean test2 = (a < b) && (a > c);
		// test3 est vrai si a < b OU a > c
		boolean test3 = (a < b) || (a > c);
		System.out.println(test1); // True
		System.out.println(test2); // False
		System.out.println(test3); // True
	}
}
