package exo_plus_grand_nombre_tableau;

public class App {
	
	public static int plusGrandNombre(int[] tab)
	{
		int plusGrand = 0;
		for (int i = 0; i < tab.length; i++)
		{
			if(tab[i] > plusGrand)
			{
				plusGrand = tab[i];
			}
		}
		return plusGrand;
	}

	public static void main(String[] args) {
		
		int[] tab = {1,2,9,4};
		int nbPlusGrand;
		nbPlusGrand = plusGrandNombre(tab);
		
		System.out.println(nbPlusGrand);

	}

}
