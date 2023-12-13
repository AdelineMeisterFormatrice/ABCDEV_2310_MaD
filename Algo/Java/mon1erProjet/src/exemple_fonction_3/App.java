package exemple_fonction_3;

import java.util.Scanner;

public class App {
	/*
	Booleen Fonction Classifier(VAL entier type_livre, VAR chaîne catégorie, VAR chaîne lieu)
	retourne vrai
SELON type_livre
Quand = 1
Catégorie="Scolaire > 95"
Lieu="BIBLIO"
Quand = 2
Catégorie="Scolaire < 95"
Lieu="BOITESCOL"
Quand = 3
Catégorie="Poche-Roman"
Lieu="BIBLIO"
Quand = 4
Catégorie="Poche-Divers"
Lieu="BOITEDIV"
Quand = 5
Catégorie="Non Poche"
Lieu="BIBLIO"
autrement
retourne faux
FINSELON
ECRIRE "Le livre est de type ", categorie, "et sera rangé dans ", lieu
FIN PROCEDURE

ENTIER code_type
CHAINE libellé_type
CHAINE endroit
ECRIRE "Quel type ?"
LIRE code_type
SI Classifier(code_type, libellé_type, endroit) = vrai ALORS
ECRIRE "Le livre est de type ", libellé_type, "et sera rangé dans ", endroit
SINON
ECRIRE " Le type de livre ", code_type, " n'est pas reconnu"
FINSI

	 */
	public static String definirCategorie(int type_livre, String categorie)
	{
		switch(type_livre)
		{
			case 1:
			{
				return categorie="Scolaire > 95";
			}
			case 2:
			{
				return categorie="Scolaire < 95";
			}
			case 3:
			{
				return categorie="Poche-Roman";
			}
			case 4:
			{
				return categorie="Poche-Divers";
			}
			case 5:
			{
				return categorie="Non Poche";
			}
			default :
				return categorie = "";
		}
	}
	public static String definirLieu(int type_livre, String lieu)
	{
		switch(type_livre)
		{
			case 1:
			{
				return lieu="BIBLIO";
			}
			case 2:
			{
				return lieu="BOITESCOL";
			}
			case 3:
			{
				return lieu="BIBLIO";
			}
			case 4:
			{
				return lieu="BOITEDIV";
			}
			case 5:
			{
				return lieu="BIBLIO";
			}
			default :
				return lieu = " ";
		}
	}
	public static boolean Classifier(int type_livre)
	{
		switch(type_livre)
		{
			case 1:
			{
				return true;
			}
			case 2:
			{
				return true;
			}
			case 3:
			{
				return true;
			}
			case 4:
			{
				return true;
			}
			case 5:
			{
				return true;
			}
			default :
			{
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code_type;
		String libelle_type = "";
		String endroit = "";
		
		System.out.println("Quel est le type du livre ?");
		code_type = sc.nextInt();
		
		if(Classifier(code_type))
		{
			endroit = definirLieu(code_type, endroit);
			libelle_type = definirCategorie(code_type,libelle_type);
			System.out.println("Le livre est de type "+ libelle_type+ " et sera rangé dans "+ endroit);
		}
		else
		{
			System.out.println(" Le type de livre "+ code_type+ " n'est pas reconnu");
		}

	}

}
