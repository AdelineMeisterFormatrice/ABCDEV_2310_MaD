package table_multiplication_v1;

import java.util.Scanner;

public class App {
	/*
	Variables
		nombre est un entier
		resultat est un entier
		i est un entier
	Debut du programme
		Ecrire "saisir un nombre de 1 à 10"
		Lire nombre
		Debut pour
				pour i allant de 0 à 10
				resultat <-- i * nombre
				Ecrire i, " * ",nombre," = ",resultat
		Fin pour
		Fin du programme
	 */

	public static void main(String[] args) {
		int nombre, resultat;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir un nombre de 1 à 10");
		nombre = sc.nextInt();
		
		for(int i = 0; i <= 10; i++)
		{
			resultat = i * nombre;
			System.out.println(i + " * " + nombre + " = " + resultat);
		}
		sc.close();
	}

}
