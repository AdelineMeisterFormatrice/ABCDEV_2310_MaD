package exercice_5;

public class App {
	/*
	EXERCICE 5

Variables
	tab1, tab2, tab3 sont des tableaux d'entiers
	i est un entier
Debut du programme
	tab1 <-- {4,8,7,9,1,5,4,6}
	tab2 <-- {7,6,5,2,1,3,7,4}
Debut pour
	pour i allant de 0 à |tab1|-1
	tab3[i] <-- tab1[i] + tab2[i]
	i suivant
Fin pour
Fin du programme

	 */

	public static void main(String[] args) {
		
		int tab1[] = {4,8,7,9,1,5,4,6};
		int tab2[] = {7,6,5,2,1,3,7,4};
		int tab3[] = new int[8];
		
		for(int i = 0; i <= tab1.length-1;i++)
		{
			tab3[i] = tab1[i] + tab2[i];
		}
		
		for(int j = 0; j <= tab3.length-1;j++)
		{
			System.out.print(tab3[j] + " ");
		}
	}

}
