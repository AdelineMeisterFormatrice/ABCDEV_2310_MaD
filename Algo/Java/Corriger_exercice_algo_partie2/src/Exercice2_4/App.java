package Exercice2_4;

import java.util.Scanner;

public class App {
	/*
	 Exercice 2.4 Annee bisextille

Variable
	annee est un entier
Debut du programme
	Ecrire "saisir une année"
	Lire annee
	Debut Si
		Si annee mod 4 = 0 ET annee mod 100 != 0 OU annee mod 400 = 0 
		Alors
			Ecrire "l'annee ",annee," est bisextille"
		Sinon
			Ecrire "l'annee ",annee," n'est pas bisextille"
	Fin Si
Fin du programme
	 */

	public static void main(String[] args) {
		int annee;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir une année ");
		annee = sc.nextInt();
		
		if(annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0)
		{
			System.out.println("L'annee "+annee+" est bissextile");
		}
		else
		{
			System.out.println("L'annee "+annee+" n'est pas bissextile");
		}
		
		sc.close();
		
	}

}
