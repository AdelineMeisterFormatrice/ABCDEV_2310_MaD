package exercice_1;

import java.util.Scanner;

public class App {
	/*
	Variables
	nombre est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
Debut Si
	Si nombre > 0 
	Alors Ecrire "Ce nombre est positif"
	Sinon Ecrire "Ce nombre est negatif"
Fin Si
Fin du programme

	 */

	public static void main(String[] args) {
		// declaration des variables
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entier positif ou negatif");
		nombre = sc.nextInt();
		
		//si nombre est superieur à 0
		if(nombre > 0)
		{
			//Alors ce nombre est positif
			System.out.println("ce nombre est positif");
		}
		else
		{
			// sinon ce nombre est negatif
			System.out.println("ce nombre est negatif");
		}
		
		sc.close();

	}

}
