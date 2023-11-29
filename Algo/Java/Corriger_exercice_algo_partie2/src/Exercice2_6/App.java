package Exercice2_6;

import java.util.Scanner;

public class App {
	/*
	Variables
	nombre est un entier
	i est un entier
	compteur est un entier
Debut du programme
	Ecrire "Saisir un nombre entier"
	lire nombre
	compteur <-- 0
	Debut boucle pour
	Pour i allant de 2 a nombre-1
		Debut Si
			Si nombre mod i = 0
			Alors
				Compteur <-- compteur+1
		Fin si
	Fin pour
	Debut si
		Si compteur = 0
		Alors
			Ecrire "Le nombre ",nombre," est premier"
		Sinon
			Ecrire "le nombre ",nombre," n'est pas premier"
	Fin si
Fin du programme
	 */

	public static void main(String[] args) {
		int nombre,compteur;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		compteur = 0;
		
		for(int i = 2; i < nombre;i++)
		{
			if(nombre % i == 0)
			{
				compteur = compteur+1;
			}
		}
		
		if(compteur == 0)
		{
			System.out.println("Le nombre "+nombre+" est un nombre premier");
		}
		else
		{
			System.out.println("Le nombre "+nombre+" n'est pas un nombre premier");
		}
		sc.close();
	}

}
