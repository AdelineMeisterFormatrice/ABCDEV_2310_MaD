package purgeBis;

import java.util.Scanner;

public class App {
	/*
	 FONCTION
	 	Chaine de caractère purge(chaine de caractère chaine,  caractère lettreChar)
	 	Chaine de caractère chainePurger <-- ""
	 	Debut boucle pour
	 		pour i allant de 0 à |chaine|-1
	 		Debut Si
	 			Si chaine[i] different de lettreChar
	 			Alors
	 				chainePurger <-- chainePurger + chaine[i]
	 		Fin Si
	 	Fin pour
	 	retourner chainePurger
	 Fin Fonction
	 FONCTION
	 	Chaine de caractère purgeBis(chaine de caractère chaine, chaine de caractère lettre)
	 	caractère lettreChar
	 	Debut boucle pour
	 		pour i allant de 0 à |lettre|-1
	 		lettreChar <-- lettre[i]
	 		Debut si
	 			si i = 0
	 			Alors
	 				purge(chaine, lettreChar)
	 			sinon si i > 0
	 			Alors
	 				Debut si 
	 					Si chaine[i] different de chainePurgerBis[i]
	 					Alors
	 						chainePurgerBis = purge(chainePurgerBis,lettreChar)
	 				Fin Si
	 		Fin Si
	 	Fin pour
	 	retourner purge(chaine, lettreChar)
	 Fin fonction
	 		
	 Variables
	 	chaineSaisie, lettreSaisie sont des chaine de caractère
	 Debut du programme
	 	Ecrire "Saisir un mot ou une phrase"
	 	Lire chaineSaisie
	 	Ecrire "Saisir une ou plusieurs lettre"
	 	lire lettreSaisie
	 	Ecrire purgeBis(chaineSaisie,lettreSaisie)
	 Fin du programme
	 	
	 */
	public static String purge(String chaine, char lettre)
	{
		String chainePurger = "";
		
		for(int i = 0; i < chaine.length();i++)
		{
			if(chaine.charAt(i) != lettre)
			{
				chainePurger = chainePurger + chaine.charAt(i);
			}
		}
		return chainePurger;
	}
	
	public static String purgeBis(String chaine, String lettre)
	{
		char lettreChar;
		String chainePurgerBis = "";
		for(int i = 0; i < lettre.length();i++)
		{
			lettreChar = lettre.charAt(i);
			// si i = 0 on a saisi qu'une seule ou plusieurs lettre
			if(i == 0)
			{
				// on purge la chaine saisie
				chainePurgerBis = purge(chaine,lettreChar);
			}
			// si i > 0 on a saisie plusieurs lettre
			else if(i > 0)
			{
					// on purge la chaine deja purger une ou plusieurs fois 
					chainePurgerBis = purge(chainePurgerBis,lettreChar);
				
			}
			
		}
		if(lettre.equals(null))
		{
			chainePurgerBis = chaine;
		}
		 
		return chainePurgerBis;
	}

	public static void main(String[] args) {
		
		String chaineSaisie, lettreSaisie;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisr un mot ou une prhase");
		chaineSaisie = sc.nextLine();
		System.out.println("Saisr une ou plusieurs lettre");
		lettreSaisie = sc.nextLine();
		
		System.out.println(purgeBis(chaineSaisie,lettreSaisie));
		
		sc.close();

	}

}
