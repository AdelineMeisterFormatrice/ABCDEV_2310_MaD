package Exercice1_5_inversion_de_valeurs;

import java.util.Scanner;

public class App {
	/*
	Exercice 1.5 inversion de valeurs

VARIABLES
	a est un entier
	b est un entier
	c est un entier
DEBUT DU PROGRAMME
	Ecrire "saisir la valeur de a"
	Lire a                               3
	Ecrire "Saisir la valeur de b"
	lire b                               5
	Ecrire "Valeur de a : ",a            3
	Ecrire "Valeur de b : ",b            5
	c <-- a                              c=3
	a <-- b                              a=5
	b <-- c                              b=3
	Ecrire "Valeur de a : ",a            5
	Ecrire "Valeur de b : ",b            3
FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir la valeur de a");
		a =sc.nextInt();
		System.out.println("Saisir la valeur de b");
		b = sc.nextInt();
		System.out.println("Avant inversion");
		System.out.println("Valeur de a : "+a);
		System.out.println("valeur de b : "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("Après inversion");
		System.out.println("Valeur de a : "+a);
		System.out.println("valeur de b : "+b);
		
		sc.close();

	}

}
