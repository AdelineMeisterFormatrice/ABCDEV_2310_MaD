package anneeBisextille;

import java.util.Scanner;

public class App {
	/*
FONCTION Booleen anneeBisextille(entier annee)
	estBisextille est un booleen
	Debut Si
		Si annee est divisible par 4 ET pas par 100 OU annee divisible par 400
		Alors
			estBisextille <-- vrai
		Sinon
			estBisextille <-- faux
	Fin Si
	Retourner estBisextille
Fin fonction
VARIABLES
	annee est un entier
Debut du programme
	Ecrire "Saisir une annee"
	Lire annee
	
	Debut Si 
		Si anneeBisextille(annee) = vrai
		Alors
			Ecrire "L'annee est bisextille"
		Sinon 
			Ecrire "L'annee n'est pas bisextille"
	Fin Si
Fin du programme
	 */

	public static boolean anneeBissextile(int annee) 
	{
		boolean estBissextile;
		
		if ((annee %4) == 0 && (annee %100) != 0 || (annee %400) == 0) 
		{
			estBissextile = true;
		}
		
		else 
		{
			estBissextile = false;
		}
		
		return estBissextile;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int annee;
		
		System.out.println("Saisir une annee");
		annee = sc.nextInt();
		
		if (anneeBissextile(annee)) 
		{
			System.out.println("L'année est bissextile");
		}
		
		else 
		{
			System.out.println("L'année n'est pas bissextile");
		}
		
		sc.close();
	}
}