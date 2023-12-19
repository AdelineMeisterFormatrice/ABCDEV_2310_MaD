package perimetreAireTriangle;

import java.util.Scanner;

public class App {
	/*
	Exercice 2 calcul du perimetre et aire d'un triangle

PROCEDURE
	perimetreAire(entier a,entier b, entier c)
		entier perimetre
		reel  aire
		perimetre <-- a + b + c
		aire <-- ((p/2-a)(p/2-b)(p/2-c))^1/2
		Ecrire "Le perimetre est ",perimetre," l'aire est ",aire
FIN PROCEDURE
VARIABLES
	cote1, cote2, cote3 sont des entiers
DEBUT DU PROGRAMME
	Ecrire "Saisir le coté 1"
	Lire cote1
	Ecrire "Saisir le coté 2"
	Lire cote2
	Ecrire "Saisir le coté 3"
	Lire cote3
	perimetreAire(cote1, cote2, cote3)
FIN PROGRAMME
	 */
	public static void perimetreAire(int a,int b, int c)
	{
		int perimetre;
		double aire;
		perimetre = a + b + c;
		aire = Math.pow(((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c)), 1/2);
		System.out.println("Le perimetre est "+perimetre+" l'aire est "+aire);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cote1, cote2, cote3;
		
		System.out.println("Saisir le coté 1");
		cote1 = sc.nextInt();
		System.out.println("Saisir le coté 2");
		cote2 = sc.nextInt();
		System.out.println("Saisir le coté 3");
		cote3 = sc.nextInt();
		
		perimetreAire(cote1,cote2,cote3);
		
		sc.close();

	}

}
