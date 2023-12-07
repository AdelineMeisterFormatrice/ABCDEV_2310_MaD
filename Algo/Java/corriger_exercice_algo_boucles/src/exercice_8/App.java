package exercice_8;

import java.util.Scanner;

public class App {
	/*
	Variables
	prix est un entier
	sommeDue est un entier
	montantVerser est un entier
	reste est un entier
	nb10E est un entier
	nb5E est un entier
Debut du programme
	prix <-- 1
	sommeDue <-- 0
Debut tant que
	tant que prix != 0
	faire
	Ecrire "Saisir le prix de l'article"
	lire prix
	sommeDue <-- sommeDue + prix
Fin tant que
	Ecrire "Vous devez : ",sommeDue," Euros"
	Ecrire "Montant verser : "
	Lire montantVerser
	reste <-- montantVerser - sommeDue
	nb10E <-- 0
Debut tant que
	tant que reste >= 10
	faire nb10E <-- nb10E + 1
	      reste <-- reste - 10
Fin tant que
	nb5E <-- 0
Debut Si
	Si reste >= 5
	nb5E <-- 1
	reste <-- reste - 5
Fin Si
	Ecrire "Rendu de la monnaie"
	Ecrire "Billet de 10 Euros : ",nb10E
	Ecrire "Billet de 5 Euros : ",nb5E
	Ecrire "Piece de 1 Euros : ",reste
Fin du programme
	 */

	public static void main(String[] args) {
		int prix, sommeDue, montantVerser, reste, nb10E, nb5E;
		
		Scanner sc = new Scanner(System.in);
		
		prix = 1;
		sommeDue = 0;
		
		while(prix != 0)
		{
			System.out.println("Saisir le prix de l'article");
			prix = sc.nextInt();
			
			sommeDue = sommeDue + prix;
		}
		
		System.out.println("Vous devez : " + sommeDue +" Euros");
		System.out.println("Montant verser : ");
		montantVerser = sc.nextInt();
		reste = montantVerser - sommeDue;
		nb10E = 0;
		while(reste >= 10)
		{
			nb10E = nb10E + 1;
			reste = reste - 10;
		}
		nb5E = 0;
		if(reste >= 5)
		{
			nb5E = 1;
			reste = reste - 5;
		}
		
		System.out.println("Rendu de la monnaie");
		System.out.println("Billet de 10 Euros : " + nb10E);
		System.out.println("Billet de 5 Euros : " + nb5E);
		System.out.println("Piece de 1 Euros : " + reste);
		
		sc.close();
	}

}
