package Exemple_condition;

import java.util.Scanner;

public class App {
	/*
	 Variables
	 	nombre est un entier
	 Debut du programme
	 	Ecrire "Saisir un nombre entre 1 et 100"
	 	lire nombre
	 	Debut Si
	 		Si nombre > 50
	 		Alors 
	 			Ecrire "Votre nombre est supérieur à 50"
	 		Sinon
	 			Ecrire "Votre nombre est inférieur à 50"
	 		Fin Si
	 Fin du programme
	 */

	public static void main(String[] args) {
		int nombre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir un nombre entre 1 et 100");
		nombre = sc.nextInt();
		
		if(nombre > 50)
		{
			System.out.println("Votre nombre est superieur a 50");
		}
		else if(nombre == 50)
		{
			System.out.println("Votre nombre est egale a 50");
		}
		else if(nombre > 0)
		{
			System.out.println("Votre nombre est inférieur a 50");
		}
		else
		{
			System.out.println("Votre nombre est négatif");
		}
		
		sc.close();
	}

}
