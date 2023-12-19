package compteur_de_voyelle;

import java.util.Scanner;

public class App {
	/*
	 FONCTION
	 	entier compteurVoyelle (chaine de caractere chaine)
	 	compteur est un entier
	 	compteur <-- 0
	 	Debut boucle pour
	 	Pour i allant de 0 à |chaine|
	 		Debut Si
	 			Si  chaine[i] = 'a' 
	 				ou chaine[i] = 'e' 
	 				ou chaine[i] = 'i' 
	 				ou chaine[i] = 'o' 
	 				ou chaine[i] = 'u' 
	 				ou chaine[i] = 'y'
	 			Alors compteur = compteur + 1
	 		Fin Si
	 		i suivant
	 	Fin pour
	 FIN FONCTION
	 VARIABLES
	 	chaineSaisie est une chaine de caractere
	 DEBUT DU PROGRAMME
	 	ecrire "Saisir une chaine de caractere"
	 	lire chaineSaisie
	 	ecrire "La chaine saisie contient ",compteurVoyelle(chaineSaisie)," voyelle"
	 FIN DU PROGRAMME
	 	
	 */
	
	public static int compteurVoyelle(String chaine)
	{
		int compteur = 0;
		for(int i = 0; i < chaine.length(); i++)
		{
			if(chaine.charAt(i) == 'a' 
			|| chaine.charAt(i) == 'e' 
			|| chaine.charAt(i) == 'i' 
			|| chaine.charAt(i) == 'o' 
			|| chaine.charAt(i) == 'u' 
			|| chaine.charAt(i) == 'y')
			{
				compteur += 1;
			}
		}
		return compteur;
	}

	public static void main(String[] args) {
		
		String chaineSaisie;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir une chaine de caractere : ");
		chaineSaisie = sc.nextLine();
		System.out.println("La chaine saisie contient "+compteurVoyelle(chaineSaisie)+" voyelles");
		
		sc.close();

	}

}
