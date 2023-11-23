package Exercice1_calcul_de_moyenne;

import java.util.Scanner;

public class App {
	/*
	 Exercice 1.1 calcul de la moyenne de 2 nombre

VARIABLES
	nombre1 est un entier
	nombre2 est un entier
	moyenne est un reel
DEBUT DU PROGRAMME
	Ecrire "Saisir le 1er nombre"
	Lire nombre1
	Ecrire "saisir le 2eme nombre"
	Lire nombre2
	moyenne <-- (nombre1 + nombre2)/2d
	Ecrire "La moyenne est :",moyenne
FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		// declaration des variables
		int nombre1;
		int nombre2;
		double moyenne;
		// declaration d'un objet scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1 er nombre");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		moyenne = (nombre1 + nombre2)/2d;
		System.out.println("La moyenne est :" + moyenne);
		sc.close();
				

	}

}
