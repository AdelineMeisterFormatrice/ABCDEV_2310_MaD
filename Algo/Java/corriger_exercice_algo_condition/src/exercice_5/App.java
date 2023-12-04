package exercice_5;

import java.util.Scanner;

public class App {
	/*
	Variables
	nombre est un entier
	prix est un reel
Debut du programme
	Ecrire "Saisir le nombre de photocopie"
	Lire nombre
Debut Si
	Si nombre <= 10
	Alors
	prix <-- nombre * 0,1
	Sinon Si nombre <= 30
	Alors
	prix <-- 10 * 0,1 + (nombre - 10) * 0,09
	Sinon
	prix <-- 10 * 0,1 + 20 * 0,09 + (nombre - 30) * 0,08
Fin Si
Ecrire "Le prix total est : ", prix
Fin du programme
	 */

	public static void main(String[] args) {
		int nombre;
		double prix;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de photocopie");
		nombre = sc.nextInt();
		
		if(nombre <= 10)
		{
			prix = nombre * 0.1;
		}
		else if(nombre <= 30)
		{
			prix = 10 * 0.1 + (nombre - 10) * 0.09;
		}
		else
		{
			prix = 10 * 0.1 + 20 * 0.09 + (nombre - 30) * 0.08;
		}
		
		System.out.println("Le prix total est : "+prix);
		
		sc.close();

	}

}
