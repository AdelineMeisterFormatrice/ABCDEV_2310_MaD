package purge;

import java.util.Scanner;

public class App {
	/*
	 FONCTION
	 	Chaine de caractère purge(chaine de caractère chaine, Chaine de caractère lettre)
	 	Chaine de caractère chainePurger <-- ""
	 	caractère lettreChar <-- lettre
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
	 Variables
	 	chaineSaisie, lettreSaisie sont des chaine de caractère
	 Debut du programme
	 	Ecrire "Saisir un mot ou une phrase"
	 	Lire chaineSaisie
	 	Ecrire "Saisir une lettre"
	 	lire lettreSaisie
	 	Ecrire purge(chaineSaisie,lettreSaisie)
	 Fin du programme
	 	
	 */
	
	public static String purge(String chaine, String lettre)
	{
		String chainePurger = "";
		char lettreChar = lettre.charAt(0);
		
		for(int i = 0; i < chaine.length();i++)
		{
			if(chaine.charAt(i) != lettreChar)
			{
				chainePurger = chainePurger + chaine.charAt(i);
			}
		}
		return chainePurger;
	}

	public static void main(String[] args) {
		
		String chaineSaisie, lettreSaisie;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisr un mot ou une prhase");
		chaineSaisie = sc.nextLine();
		System.out.println("Saisr une lettre");
		lettreSaisie = sc.nextLine();
		
		System.out.println(purge(chaineSaisie,lettreSaisie));
		
		sc.close();

	}

}
