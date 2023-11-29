package Exercice2_1;

import java.util.Scanner;

public class App {
	/*
	 Exercice 2.1 comparaison de nombre

VARIABLES
	age est un entier
Debut du programme
	Ecrire "Quel est votre age ?"
	Lire age
	Debut Si
		Si age >= 18
		Alors
			Ecrire "Vous êtes majeur"
		Sinon Si age < 0 
			Alors
			Ecrire "Vous n'êtes pas encore né"
		Sinon
			Ecrire "Vous êtes mineur"
	Fin Si
Fin du programme
	 */

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir votre age ");
		age = sc.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Vous êtes majeur");
		}
		else if(age < 0)
		{
			System.out.println("Vous n'êtes pas encore né");
		}
		else
		{
			System.out.println("Vous êtes mineur");
		}
		
		sc.close();

	}

}
