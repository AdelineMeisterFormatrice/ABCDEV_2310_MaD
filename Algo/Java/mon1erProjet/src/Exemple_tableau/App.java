package Exemple_tableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// declaration d'un tableau de chaine de caractère contenant 3 élément
		
		String[] tabPrenom = new String[3];
		
		// declaration d'un tableau d'entier contenant 5 élément
		
		int[] tabNombre = new int[5];
		
		// ecrire dans un tableau en spécifiant l'index 
		
		tabPrenom[0] = "Adeline";
		tabPrenom[1] = "Benjamin";
		tabPrenom[2] = "Lores";
		
		// afficher l'element qui se trouve à l'index 1
		
		System.out.println(tabPrenom[1]);
		
		// declaration et initialisation d'un tableau contenant 4 élément
		
		String tabPrenom2[] = {"Frederic","jerome","Nicolas","Antony"};
		
		// ecriture dans un tableau à l'aide d'une boucle
		
		for(int i = 0; i <= tabNombre.length-1;i++)
		{
			System.out.println("saisir un nombre");
			tabNombre[i] = sc.nextInt();
		}
		
		// affichage de tout les element d'un tableau de l'indice 0 à l'indice max
		
		for(int j = 0;j <= tabNombre.length-1;j++ )
		{
			System.out.print(tabNombre[j]+" ");
		}
		
		System.out.println("\n");
		
		// affichage de tout les element d'un tableau de l'indice max à l'indice 0
		
		for(int k = tabNombre.length-1;k >= 0;k-- )
		{
			System.out.print(tabNombre[k]+" ");
		}
		
		System.out.println("\n");
		
		int tab[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(tab[5]);
		
		sc.close();

	}

}
