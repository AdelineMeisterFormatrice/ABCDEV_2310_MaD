package exercice_6_v1;

import java.util.Scanner;

public class App {
/*
Variables
	nombre est un entier
	plusGrand est un entier
	i est un entier
  Debut du programme
	plusGrand <-- 0
  Debut pour
	pour i allant de 1 à 20
		Ecrire "Saisir un nombre"
		Lire nombre
	Debut Si
		Si  nombre > plusGrand
		Alors plusGrand <-- nombre
	Fin Si
	i suivant
 Fin pour
	Ecrire "Le nombre le plus grand est : ",plusGrand
 Fin du programme
 */

	public static void main(String[] args) {
		int nombre, plusGrand;
		
		Scanner sc = new Scanner(System.in);
		
		plusGrand = 0;
		
		for(int i = 1; i <= 20; i++)
		{
			System.out.println("Saisir un nombre");
			nombre = sc.nextInt();
			if(nombre > plusGrand)
			{
				plusGrand = nombre;
			}
		}
		
		System.out.println("Le plus grand nombre est : "+plusGrand);
		
		sc.close();

	}

}
