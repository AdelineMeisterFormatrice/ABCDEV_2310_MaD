package exercice_1;

public class App {
	/*
	EXERCICE 1

Variables
	 tab1[7] est un tableau d'entier
	i est un entier
Debut du programme
	Debut pour
		pour i allant de 0 à 6
		tab1[i] <-- 0
		i suivant
	Fin pour
Fin du programme

	 */

	public static void main(String[] args) {
		
		// declaration d'un tableau d'entier avec 7 élémets
		int[] tab = new int[7];
		
		// remplissage du tableau avec une boucle for en mettant chaque élément à zero
		for(int i = 0; i <= tab.length-1;i++)
		{
			tab[i] = 0;
		}
	}
}
