package exercice_7;

import java.util.Scanner;

public class App {
	/*
	Variables
	nombre est un entier
	plusGrand est un entier
	position est un entier
	i est un entier
Debut du programme
	nombre <-- 1
	i <-- 0
	plusGrand <-- 0
	position <-- 0
Debut tant que
	tant que nombre != 0
	faire
		Ecrire "Saisir un nombre"
		Lire nombre
		i <-- i + 1
		Debut Si
			Si i = 1 OU nombre > plusGrand
			Alors 
				plusGrand <-- nombre
				position <-- i-1
		Fin Si
Fin tant que
	Ecrire "Le nombre le plus grand est : ",nombre
	Ecrire "Il a ete saisi en position numero : ",position
Fin du programme
	 */

	public static void main(String[] args) {
		int nombre, plusGrand, position;
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		nombre = 1;
		plusGrand = 0;
		position = 0;
		
		while(nombre != 0)
		{

			System.out.println("Saisir un nombre");
			nombre = sc.nextInt();
			i = i + 1;
			if(nombre > plusGrand)
			{
				plusGrand = nombre;
				position = i;
			}
		}
		
		
		System.out.println("Le plus grand nombre est : "+plusGrand);
		System.out.println("Il a ete saisi en position numero : " +position);
		
		sc.close();

	}

}
