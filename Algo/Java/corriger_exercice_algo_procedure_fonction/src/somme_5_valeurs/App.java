package somme_5_valeurs;

import java.util.Scanner;

public class App {
	/*
	FONCTION 
		entier somme(entier a, entier b, entier c, entier d, entier e)
		resultat est un entier
		resultat <-- a+b+c+d+e
		retourner resultat
	FIN FONCTION
	VARIABLES
		nombre1, nombre2, nombre3, nombre4, nombre5 sont des entiers
		addition est un entier
	DEBUT DU PROGRAMME
		ecrire "Saisir le 1er nombre"
		lire nombre1
		ecrire "Saisir le 2eme nombre"
		lire nombre2
		ecrire "Saisir le 3eme nombre"
		lire nombre3
		ecrire "Saisir le 4eme nombre"
		lire nombre4
		ecrire "Saisir le 5eme nombre"
		lire nombre5
		additon <-- somme(nombre1,nombre2,nombre3,nombre4,nombre5)
		ecrire "La somme des 5 nombres est : ",addition
	FIN DU PROGRAMME
	
	 */
	
	public static int somme(int a, int b, int c, int d, int e)
	{
		int resultat;
		resultat = a+b+c+d+e;
		return resultat;
	}

	public static void main(String[] args) {
		
		int nombre1, nombre2, nombre3, nombre4, nombre5;
		int addition;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre :");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre :");
		nombre2 = sc.nextInt();
		System.out.println("Saisir le 3eme nombre :");
		nombre3 = sc.nextInt();
		System.out.println("Saisir le 4eme nombre :");
		nombre4 = sc.nextInt();
		System.out.println("Saisir le 5eme nombre :");
		nombre5 = sc.nextInt();
		
		addition = somme(nombre1, nombre2, nombre3, nombre4, nombre5);
		
		System.out.println("La somme des 5 nombres est : "+addition);
		
		sc.close();

	}

}
