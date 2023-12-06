package tables_multiplication_v2;

import java.util.Scanner;

public class App {
	/*
	Variables
		nombre est un entier
		resultat est un entier
		i est un entier
		fermeture_prog est un booleen
		saisie_utilisateur est une chaine de caractere
		saisieValide est booleen 
	Debut du programme
		debut faire tant que
			faire
			Ecrire "saisir un nombre de 1 à 10"
			Lire nombre
		Debut si
			si nombre >= 1 et nombre <=10
				saisievalide = vrai
		Debut pour
				pour i allant de 0 à 10
				resultat <-- i * nombre
				Ecrire i, " * ",nombre," = ",resultat
		Fin pour
			debut faire tant que
				faire
					Ecrire "souhaitez vous achiffer une autre tables ? Oui(O) ou Non(N)"
					Lire saisie-utilisateur
				Debut si
					si saisie_utilisateur egale "N"
					Alors 
						fermeture_prog = vrai
						saisie_utilisateur = vrai
					Sinon si saisie_utilisateur egale "O"
						fermeture_prog = faux
						saisie_utilisateur = vrai
					Sinon
						saisie_utilisateur = faux
				Fin si
				tant que saisie_utilisateur = faux
			fin faire tant que
		tant que fermeture_prog = faux				
		Fin du programme
	 */


	public static void main(String[] args) {
		int nombre, resultat;
		boolean fermeture_prog, saisieValide;
		String saisieUtilisateur;
		Scanner sc = new Scanner(System.in);
		fermeture_prog = false;
		do
		{
			System.out.println("saisir un nombre de 1 à 10");
			nombre = sc.nextInt();
			if(nombre >= 1 && nombre <= 10)
			{
				saisieValide = true;
				for(int i = 0; i <= 10; i++)
				{
					resultat = i * nombre;
					System.out.println(i + " * " + nombre + " = " + resultat);
				}
				do
				{
					System.out.println("souhaitez vous achiffer une autre tables ? Oui(O) ou Non(N)");
					saisieUtilisateur = sc.next();
					if(saisieUtilisateur.equals("N"))
					{
						fermeture_prog = true;
						saisieValide = true;
					}
					else if(saisieUtilisateur.equals("O"))
					{
						fermeture_prog = false;
						saisieValide = true;
					}
					else
					{
						System.out.println("Saise invalide");
						saisieValide = false;
					}
				}while(!saisieValide);
			}
			
		}while(!fermeture_prog);
		
		sc.close();

	}

}
