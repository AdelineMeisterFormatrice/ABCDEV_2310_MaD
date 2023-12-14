package exemple_procedure_2;

import java.util.Scanner;

public class App {
	
	// procedure qui ne prend aucun argument
	public static void disBonjour()
	{
		System.out.println("Bonjour !!!");
	}
	
	// procedure qui prend un argument
	public static void disBonjourPrenom(String prenom)
	{
		System.out.println("Bonjour " + prenom);
	}

	public static void main(String[] args) {
		
		disBonjour();
		
		String saisie;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir votre prenom ");
		saisie = sc.nextLine();
		
		disBonjourPrenom(saisie);
		
		sc.close();
		
		
	}

}
