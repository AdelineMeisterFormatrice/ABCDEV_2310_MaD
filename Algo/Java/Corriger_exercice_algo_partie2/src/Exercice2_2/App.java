package Exercice2_2;

import java.util.Scanner;

public class App {
	/*
	 Exercice 2.2 tri de nombre

VARIABLES
	a est un entier
	b est un entier
	inferieurEgale est une chaine de caractère
Debut du programme
	inferieurEgale <-- " <= "
	Ecrire "Saisir le nombre a"
	Lire a
	Ecrire "Saisir le nombre b"
	lire b
	Debut Si
		Si a <= b
		Alors
			Ecrire a, inferieurEgale, b
		Sinon
			Ecrire b, inferieurEgale, a
	Fin Si
Fin du programme
	 */

	public static void main(String[] args) {
		int a,b;
		String inferieurEgale = " <= ";
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Saisir le nombre a ");
		a = sc.nextInt();
		System.out.println("Saisir le nombre b ");
		b = sc.nextInt();
		
		if(a <= b)
		{
			System.out.println(a + inferieurEgale + b);
		}
		else
		{
			System.out.println(b + inferieurEgale + a);
		}
		
		sc.close();
		

	}

}
