package exemple_mois_if_else_if;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mois;
		
		System.out.println("Saisir le mois ");
		mois = sc.nextLine();
		
		if(mois.equals("Janvier") || mois.equals("Fevrier") || mois.equals("Mars"))
		{
			System.out.println("Trimestre 1");
		}
		else if(mois.equals("Avril") || mois.equals("Mai") || mois.equals("Juin"))
		{
			System.out.println("Trimestre 2");
		}
		else if(mois.equals("juillet") || mois.equals("Aout") || mois.equals("Septembre"))
		{
			System.out.println("Trimestre 3");
		}
		else if(mois.equals("Octobre") || mois.equals("Novembre") || mois.equals("Decembre"))
		{
			System.out.println("Trimestre 4");
		}
		else
		{
			System.out.println("Ce mois n'existe pas");
		}

	}

}
