package Exemple_random;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 10;
		// declaration d'un objet random
		Random nbAleatoire = new Random();
		
		int nbStagiaire;
		// generation d'un nombre aleatoire
		nbStagiaire = nbAleatoire.nextInt(max - min +1) + min;
		
		switch(nbStagiaire)
		{
		case 1 :
			System.out.println("Lores");
			break;
		case 2 :
			System.out.println("Valentin");
			break;
		case 3 :
			System.out.println("Nicolas");
			break;
		case 4 :
			System.out.println("Frederic");
			break;
		case 5 :
			System.out.println("Benjamin");
			break;
		case 6 :
			System.out.println("Lucas");
			break;
		case 7 :
			System.out.println("Christopher");
			break;
		case 8 :
			System.out.println("Fatima");
			break;
		case 9 :
			System.out.println("Antony");
			break;
		case 10 :
			System.out.println("Jerome");
			break;
			default :
				System.out.println("Adeline");
		}

	}

}
