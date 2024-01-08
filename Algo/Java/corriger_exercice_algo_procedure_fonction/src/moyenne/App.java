package moyenne;

import java.util.Scanner;

public class App {
	/*
	Exercice 3 moyenne

FONCTION
	reel calculMoyenne(entier a, entier b)
		reel resultat
		resultat <-- (a+b)/2
		Retourne resultat
FIN FONCTION
VARIABLES
	nombre1, nombre2 sont des entiers
	moyenne est un reel
DEBUT PROGRAMME
	Ecrire "saisir le 1er nombre"
	Lire nombre1
	Ecrire "saisir le 2eme nombre"
	Lire nombre2
	moyenne <-- calculMoyenne(nombre1,nombre2)
	Ecrire "La moyenne de ",nombre1," et ",nombre2," est ",moyenne
FIN PROGRAMME
	 */
	
	public static double calculMoyenne(int a, int b)
	{
		double resultat;
		resultat = (a+b)/2d;
		return resultat;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nombre1, nombre2;
		double moyenne;
		System.out.println("saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		
		moyenne = calculMoyenne(nombre1,nombre2);
		
		System.out.println("La moyenne de "+nombre1+" et "+nombre2+" est "+moyenne);
		
		sc.close();

	}

}
