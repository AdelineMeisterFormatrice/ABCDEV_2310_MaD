package exercice_6;

public class App {
	/*
	EXERCICE 6

Variables
	tab1, tab2 sont des tableaux d'entiers
	resultat est un entier
	i est un entier
	j est un entier
Debut du programme
	tab1 <-- {4,8,7,12}
	tab2 <-- {3,6}
	resultat <-- 0
Debut pour
	pour i allant de 0 à |tab1|-1
	Debut pour
		pour j allant de 0 à |tab2|-1
		resultat <-- resultat + tab1[i] * tab2[j]
		j suivant
	Fin pour
	i suivant
Fin pour
	Ecrire "Le resultat est : ",resultat
Fin du programme

	 */

	public static void main(String[] args) {
		int tab1[] = {4,8,7,12};
		int tab2[] = {3,6};
		int resultat = 0;
		
		for(int i = 0; i <= tab1.length-1;i++)
		{
			for(int j = 0; j <= tab2.length-1;j++)
			{
				resultat = resultat + tab1[i] * tab2[j];
			}
		}
		
		System.out.println("Le resultat est : " + resultat);

	}

}
