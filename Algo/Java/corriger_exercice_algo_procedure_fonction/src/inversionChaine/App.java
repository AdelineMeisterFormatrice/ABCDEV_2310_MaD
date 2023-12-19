package inversionChaine;

import java.util.Scanner;

public class App {
	
	public static String inverserChaine(String chaineSaisie)
	{
		String chaineInverser = "";
		for(int i = chaineSaisie.length()-1; i >= 0;i--)
		{
			chaineInverser = chaineInverser + chaineSaisie.charAt(i);
		}
		return chaineInverser;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chaine;
		String eniahc;
		System.out.println("Saisir une chaine de caractère");
		chaine = sc.nextLine();
		eniahc = inverserChaine(chaine);
		
		System.out.println("La chaine inverser : "+eniahc);
		
		sc.close();
		

	}

}
