package Exemple_Scanner;

import java.util.Scanner;

public class App {
	/*
	 Variables
    nb1 est un entier
    nombre2 est un entier
    resultat est un entier
Debut du programme
    Ecrire "Saisir le 1er nombre"
    Lire nb1
    Ecrire "Saisir le 2eme nombre"
    Lire nombre2
    resultat <-- nb1 + nombre2
    Ecrire "Le resultat est ",resultat
Fin du programme 
	 */

	public static void main(String[] args) {
		
		// Declaration des variables
		
		int nb1;
		int nombre2;
		int resultat;
		
		// declaration d'un scanner
		Scanner sc = new Scanner(System.in);
		
		// on demande à l'utilisateur de saisir le nombre 1 et le nombre 2 
		System.out.println("Saisir le 1er nombre");
		// on lit le nombre qu'a saisit l'utilisateur et on le stocke dans la variable nb1
		nb1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		
		// on additionne nb1 et nombre2 et on stocke dans la variable resultat
		resultat = nb1 + nombre2;
		
		// on affiche le resultat de l'addition
		System.out.println("Le resultat de l'addition de "+nb1+" et "
				+nombre2+" est "+resultat);
		
		// fermeture du scanner
		sc.close();
	}

}
