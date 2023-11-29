package Exercice1_4_calcul_interet;

import java.util.Scanner;

public class App {
	/*
	 Exercice 1.4 Calcul d'interet

Variables
	somme est un entier
	interet est un reel
	nbAnnee est un entier
	interetSimple est un reel
	interetComposer est un reel
Debut du programme
	Ecrire "Saisir la somme"
	Lire somme
	Ecrire "Saisir l'interet"
	Lire interet
	Ecrire "Saisir le nombre d'annee"
	lire nbAnnee
	interetSimple <-- somme*(1+nbAnnee*interet/100)
	interetComposer <-- somme*(1+interet/100)^nbAnnee
	Ecrire "La valeur acquise avec un interet simple est : ",interetSimple
	Ecrire "La valeur acquise avec un interet composer est : ",interetComposer
Fin du programme

	 */

	public static void main(String[] args) {
		//declaration des variables
		int somme;
		double interet;
		int nbAnnee;
		double interetSimple;
		double interetCompose;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir la somme ");
		somme = sc.nextInt();
		System.out.println("Saisir l'interet ");
		interet = sc.nextDouble();
		System.out.println("Saisir le nombre d'annee ");
		nbAnnee = sc.nextInt();
		
		interetSimple = somme * (1+nbAnnee*interet/100);
		interetCompose = somme * Math.pow(1+interet/100, nbAnnee);
		
		System.out.println("La valeur acquise avec un interet simple est "+interetSimple);
		System.out.println("La valeur acquise avec un interet composer est "+interetCompose);

		sc.close();
	}

}
