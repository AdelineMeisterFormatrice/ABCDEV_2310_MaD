package exercice_3;

import java.util.Scanner;

public class App {
	/*
	Variables
	age est un entier
Debut du programme
	Ecrire "Saisir l'age de l'enfant : "
	Lire age
Debut Si
	Si age >= 12
	Alors Ecrire "Categorie Cadet"
	Sinon Si age >= 10
	Alors Ecrire "Categorie Minime"
	Sinon Si age >= 8
	Alors Ecrire "Categorie Pupille"
	Sinon Si age >= 6
	Alors Ecrire "Categorie Poussin"
Fin Si
Fin du programme
	 */

	public static void main(String[] args) {
		// declaration des variables
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir l'age de l'enfant : ");
		age = sc.nextInt();
		
		if(age >= 12 && age <= 18)
		{
			System.out.println("Categorie cadet");
		}
		else if(age >= 10)
		{
			System.out.println("Categorie Minime");
		}
		else if(age >= 8)
		{
			System.out.println("Categorie Pupille");
		}
		else if (age >= 6)
		{
			System.out.println("Categorie Poussin");
		}
		else
		{
			System.out.println("Hors Categorie");
		}
		
		sc.close();
	}

}
