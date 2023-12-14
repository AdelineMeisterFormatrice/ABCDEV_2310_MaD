package exemple_switch_case_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mois;
		
		System.out.println("Saisir le mois ");
		mois = sc.nextLine();
		
		switch(mois)
		{
		case "Janvier":
		case "Fevrier":
		case "Mars":
			System.out.println("Trimestre 1");
			break;
		case "Avril":
		case "Mai":
		case "Juin":
			System.out.println("Trimestre 2");
			break;
		case "Juillet":
		case "Aout":
		case "Septembre":
			System.out.println("Trimestre 3");
			break;
		case "Octobre":
		case "Novembre":
		case "Decembre":
			System.out.println("Trimestre 4");
			break;
		default:
			System.out.println("Ce mois n'existe pas");
		}

	}

}
