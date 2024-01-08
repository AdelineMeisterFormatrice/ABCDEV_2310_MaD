package la_vengence_de_la_fourchette;

import java.util.Random;
import java.util.Scanner;

public class App {

/*
FONCTION entier nbAleatoire(entier min, entier max)
	entier nombre
	nombre <-- est generer aleatoirement
	retourner nombre
Fin Fonction
VARIABLES
	nombreMystere est un entier
	nbJoueur est un entier
	nbOrdi est un entier
	max est un entier
	min est un entier
	essai est un entier
CONSTANTE
	nbEssaiMax = 6

DEBUT DU PROGRAMME
	essai <-- 0
	min <-- 0
	max <-- 100
	nombreMystere <-- nbAleatoire(min,max)
	Debut boucle
	tant que nombreMystere est different de nbJoueur 
				ET nombreMystere est different de nbOrdi 
				ET essai est infèrieur à nbEssaiMax
	Faire
		Ecrire "Saisir un nombre entre ", min," et ",max
		Lire nbJoueur
		nbOrdi <-- nbAleatoire(min,max)
		essai++
		Debut si
			si nbJoueur egale nombreMystere
				Ecrire "Le joueur humain à gagner en ",essai
			sinon
				Debut si
					si nbJoueur < nombreMystere
						Ecrire "C'est plus"
						min <-- nbJoueur
					Sinon
						Ecrire "C'est moins"
						max <-- nbJoueur+1
				Fin SI
		Fin Si
		Debut Si
			si nbOrdi egale nombreMystere
				Ecrire "L'ordi à gagner en ",essai
			sinon
				Debut Si
					si nbOrdi > nombreMystere
						Ecrire "Le nombre choisit par l'ordi est trop grand"
						Debut si 
							Si max > nbOrdi
							max <-- nbOrdi 
						Fin Si
					Sinon
						Ecrire "Le nombre choisit par l'ordi est trop petit"
						Debut Si
							Si min < nbOrdi
							min <-- nbOrdi 
						Fin Si
					Fin Si
		Fin Si
	Fin tant que
	Debut Si 
		Si essai egale nbEssaiMax
			Debut Si
				Si nombreMystere different de nbJoueur
				Ecrire "Le joueur humain a perdu"
			Fin Si
			Debut Si
				Si nombreMystere different de nbOrdi
				Ecrire "L'ordi a perdu
			Fin si
	Fin Si
Fin du programme

 */
	public static int nbAleatoire(int min, int max)
	{
		int nombre;
		Random rand = new Random();
		nombre = rand.nextInt(max - min +1) + min;
		return nombre;
	}
	public static void main(String[] args) 
	{
	
// Déclaration des variables
	int nombreMystere;
	int nbJoueur;
	int nbOrdi;
	int max;
	int min;
	int essai;
	boolean jouer = true;
	boolean saisieValide;
	boolean humainWin = false;
	boolean ordiWin = false;
	String rejouer ="";
	
	final int nbEssaiMax = 6;
	
	
	
	Scanner sc = new Scanner(System.in);
	do
	{
		// initialisation des variables
		essai = 0;
		min = 0;
		max = 100;
		nbJoueur= -1;
		nbOrdi= -1;
		nombreMystere = nbAleatoire(min,max);
		
		//System.out.println(nombreMystere);
		// tant que personne(l'humain et l'ordi) n'a trouvé le nombre et que l'on a des essais on joue
		while(nombreMystere != nbJoueur && nombreMystere != nbOrdi && essai < nbEssaiMax)
		{
			// le joueur humain choisit un nombre
			System.out.println("Saisir un nombre compris entre "+min+" et " +max);
			nbJoueur = sc.nextInt();
			// l'ordi choisit un nombre
			nbOrdi = nbAleatoire(min,max);
			System.out.println(nbOrdi);
			essai++;
				//on teste si l'humain a trouver le nombre
				if(nbJoueur == nombreMystere) 
				{
					System.out.println("Le joueur humain à gagner en "+essai);
					humainWin = true;
				}
				else 
				{
					//sinon on teste si le nombre de l'humain est inférieur au nombre à trouver
					if(nbJoueur < nombreMystere)
					{
						// on affiche c'est plus et on met à jour le nouveau minimum
						System.out.println("C'est plus");
						min = nbJoueur;
					}
					else
					{
						// sinon on affiche c'est moin et on met à jour le nouveau maximum
						System.out.println("C'est moins");
						max = nbJoueur;
					}
				}	
				// on teste si l'ordi a trouver le nombre
				if(nbOrdi == nombreMystere) 
				{
					System.out.println("L'ordi à gagner en "+essai);
					ordiWin = true;
				}
				else 
				{
					// sinon on teste si le nombre de l'ordi est superieur au nombre a trouver
					if(nbOrdi > nombreMystere)
					{
						System.out.println("Le nombre choisit par l'ordi est trop grand");
						// on teste si le maximum est superieur au nombre de l'ordi
						if(max > nbOrdi)
						{
							// on met à jour le nouveau maximum
							max = nbOrdi;
						}
						
					}
					else
					{
						System.out.println("Le nombre choisit par l'ordi est trop petit");
						// sinon on teste si le minimum est inferieur au nombre de l'ordi
						if(min < nbOrdi)
						{
							// on met à jour le nouveau minimum
							min = nbOrdi;
						}
						
					}
				}				
		} 
		// si on sort de la boucle while on teste si le nombre d'essai est egale au nombre d'essai max
		if(essai == nbEssaiMax || humainWin || ordiWin)
		{
			// on teste si le nombre mystère est différent du nombre du joueur humain
			if(nombreMystere != nbJoueur)
			{
				// si oui l'humain a perdu
				System.out.println("Le joueur humain a perdu");
			}
			// on teste si le nombre mystère est différent du nombre de l'ordi
			if(nombreMystere != nbOrdi)
			{
				// si oui l'ordi a perdu
				System.out.println("L'ordi a perdu");
			}
		}
		do
		{
			// on demande au joueur humain si il veut rejouer
			System.out.println("Voulez vous rejouer ? Oui(O) ou Non(N) ");
			rejouer = sc.next();
			// on teste si il a repondu oui(soit O ou o)
			if(rejouer.equals("O") || rejouer.equals("o"))
			{
				jouer = true;
				saisieValide = true;
			}
			else if(rejouer.equals("N") || rejouer.equals("n"))
			{
				jouer = false;
				saisieValide = true;
			}
			else
			{
				saisieValide = false;
			}
		}while(!saisieValide);
		
		// on joue tant que l'on souhaite rejouer
	}while(jouer);
	
	sc.close();
	}
}
