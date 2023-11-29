package Exercice2_7;

import java.util.Scanner;

public class App {
	/*
	 Exercice 2.7 conversion km miles

Variable
	kilometre est reel
	miles est un reel
	fermeture_prog est un booleen
	quit est une chaine de caractere
	saisieUtilisateur est une chaine de caractere

Debut du programme
	quit <-- "q"
	Debut tant que
	Tant que fermeture_prog est faux
	faire
		Ecrire "saisir le nombre de kilometre ou tapez q pour quitter"
		lire saisiUtilisateur
		debut si
			Si saisiUtilisateur est egale à quit
			Alors
				fermeture_prog est vrai
			Sinon
				kilometre <-- convertion en reel de saisieUtilisateur
				Debut si
					Si kilometre est < 0.01 OU kilometre > 1 000000
					Alors
						Ecrire "saisie invalide, saisissez une valeur comprise entre 0.01 et 1000000"
						Lire saisie utilisateur
					Sinon
						miles <-- kilometre/1.609
						Ecrire kilometre, " kilometre est egale à ",miles," miles"
		Fin si
	Fin tant que
Fin du programme
	 */

	public static void main(String[] args) {
		double kilometre,miles;
		boolean fermeture_prog;
		boolean isNumeric;
		String quit, saisieUtilisateur;
		
		quit = "q";
		fermeture_prog = false;
		isNumeric = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(!fermeture_prog)
		{
			System.out.println("saisir le nombre de kilometre ou tapez q pour quitter");
			saisieUtilisateur = sc.next();
			if(saisieUtilisateur.equals(quit))
			{
				fermeture_prog = true;
			}
			else
			{
				for(int i = 0;i< saisieUtilisateur.length();i++)
				{
					if(!Character.isDigit(saisieUtilisateur.charAt(i)))
					{
						isNumeric = false;
					}
					else
					{
						isNumeric = true;
					}
				}
				if(isNumeric)
				{
					kilometre = Double.parseDouble(saisieUtilisateur);
					if(kilometre < 0.01 || kilometre > 1000000)
					{
						System.out.println("Saisie invalide, saisissez un nombre entre 0.01 et 1000000");
						saisieUtilisateur = sc.next();
					}
					else
					{
						miles = kilometre / 1.609;
						miles = Math.round(miles * 100.00)/100.00;
						System.out.println(kilometre + " est egale à "+ miles+" miles");
					}
				}
			}
		}
		sc.close();
	}
	
}
