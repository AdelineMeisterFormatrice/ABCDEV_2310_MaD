package Exercice1_3_aire_secteur_circulaire;

import java.util.Scanner;

public class App {
	/*
	 Exercice 1.3 Calcul de la surface d'un secteur circulaire

Variable
	rayonR est un entier 
	angleA est un entier
	aire est un reel
Constante
	pi est un reel
Début du programme
	Ecrire " Saisir le rayon R"
	lire rayonR
	Ecrire " Saisir l'angle a"
	lire angleA
	aire <-- (pi*rayonR^2*angleA)/360
	ecrire "L'aire du secteur circulaire est : ",aire 
fin du programme 
	 */

	public static void main(String[] args) {
		// declaration des variables
		int rayonR;
		int angleA;
		double aire;
		// declaration d'une constante
		final double pi = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon : ");
		rayonR = sc.nextInt();
		System.out.println("Saisir l'angle :");
		angleA = sc.nextInt();
		
		aire = (pi * Math.pow(rayonR, 2) * angleA)/360;
		
		aire = Math.round(aire*1000.00)/1000.00;
		
		System.out.println("L'aire du secteur circulaire est : "+aire);
		
		sc.close();
	}

}
