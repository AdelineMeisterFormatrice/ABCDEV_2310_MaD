package exercice_3;

import java.util.Scanner;

public class App {
	/*
	EXERCICE 3

Variables
	nb est un entier
	nbPositif est un entier
	nbNegatif est un entier
	i est un entier
	tab[] est un tableau d'entier
Debut du programme
	Ecrire "Saisir le nombre de valeur du tableau :"
	Lire nb
	tab[] <-- tab[nb]
	nbPositif <-- 0
	nbNegatif <-- 0
Debut pour
	Pour i allant de 0 à nb - 1
		Ecrire "Saisir le nombre n° ",i+1
		Lire tab[i]
	Debut Si
		Si tab[i] > 0
		Alors
			nbPositif <-- nbPositif + 1
		Sinon
			nbNegatif <-- nbNegatif + 1
	Fin Si
	i Suivant
Fin pour
	Ecrire "Le nombre de valeurs positive : ",nbPositif
	Ecrire "Le nombre de valeurs negative : ",nbNegatif
Fin du programme
	 */

	public static void main(String[] args) {
		int nb, nbPositif, nbNegatif;
		int[] tab;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de valeur du tableau :");
		nb = sc.nextInt();
		
		tab = new int[nb];
		
		nbPositif = 0;
		nbNegatif = 0;
		
		for(int i = 0; i <= tab.length-1;i++)
		{
			System.out.println("Saisir le nombre n° " + (i+1));
			tab[i] = sc.nextInt();
			
			if(tab[i] > 0)
			{
				nbPositif = nbPositif + 1;
			}
			else if(tab[i] < 0)
			{
				nbNegatif = nbNegatif + 1;
			}
		}
		
		System.out.println("Le nombre de valeurs positive : " + nbPositif);
		System.out.println("Le nombre de valeurs negative : " + nbNegatif);
		
		sc.close();

	}

}
