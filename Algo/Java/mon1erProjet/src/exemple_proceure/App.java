package exemple_proceure;

import java.util.Scanner;

public class App {
	/*
	PROCEDURE Ranger(VAL chaîne lieu)
ECRIRE "Ranger ce livre dans", lieu
FIN PROCEDURE

PROCEDURE Classifier(VAL entier type_livre, VAR chaîne catégorie, VAR chaîne lieu)
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
FINSELON
ECRIRE "Le livre est de type ", categorie, "et sera rangé dans ", lieu
FIN PROCEDURE


Si type_livre="scol" alors
Ranger("BOITESCOL")
Sinon
Ranger("BOITEDIV")
Finsi

ENTIER code_type
CHAINE libellé_type
CHAINE endroit
ECRIRE "Quel type ?"
LIRE code_type
Classifier(code_type, libellé_type, endroit)



	 */
	
	public static void Ranger(String lieu)
	{
		System.out.println("Ranger ce livre dans " + lieu);
	}
	
	public static void Classifier(int type_livre, String categorie, String lieu)
	{
		switch(type_livre)
		{
			case 1:
			{
				categorie="Scolaire > 95";
				lieu="BIBLIO";
				break;
			}
			case 2:
			{
				categorie="Scolaire < 95";
				lieu="BOITESCOL";
				break;
			}
			case 3:
			{
				categorie="Poche-Roman";
				lieu="BIBLIO";
				break;
			}
			case 4:
			{
				categorie="Poche-Divers";
				lieu="BOITEDIV";
				break;
			}
			case 5:
			{
				categorie="Non Poche";
				lieu="BIBLIO";
				break;
			}	
		}
		System.out.println("Le livre est de type " + categorie + " et sera rangé dans " + lieu);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String type_livre;
		
		System.out.println("Quel est le type du livre ?");
		type_livre = sc.next();
		
		if(type_livre.equals("scol"))
		{
			Ranger("BOITESCOL");
		}
		else
		{
			Ranger("BOITEDIV");
		}
		
		int code_type;
		String libelle_type = "";
		String endroit = "";
		
		System.out.println("Quel est le type du livre ?");
		code_type = sc.nextInt();
		
		Classifier(code_type,libelle_type,endroit);
		
		
		
		sc.close();

	}

}
