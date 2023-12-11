package exercice_7;

import java.util.Scanner;

public class App {
	/*
	EXERCICE 7

Variables
	nb est un entier
	i est un entier
	tab[] est un tableau d'entier
Debut du programme
	Ecrire "Saisir le nombre de valeur du tableau :"
	Lire nb
	tab[] <-- tab[nb]
Debut pour
	Pour i allant de 0 à nb - 1
		Ecrire "Saisir le nombre n° ",i+1
		Lire tab[i]
	i Suivant
Fin pour
	Ecrire "Nouveau tableau : "
Debut pour 
	pour i allant de 0 à nb-1
		tab[i] <-- tab[i]+1
	Ecrire tab[i]
	i suivant
Fin pour
Fin du programme
	 */

	public static void main(String[] args) {
		int nb;
		int tab[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de valeur du tableau :");
		nb = sc.nextInt();
		
		tab = new int[nb];
		
		for(int i = 0; i <= tab.length-1;i++)
		{
			System.out.println("Saisir le nombre n° "+ (i+1));
			tab[i] = sc.nextInt();
		}
		
		System.out.println("Nouveau tableau : ");
		
		for(int i = 0; i <= tab.length-1;i++)
		{
			tab[i] = tab[i] +1;
			System.out.print(tab[i]+" ");
		}
		
		sc.close();
	}

}
