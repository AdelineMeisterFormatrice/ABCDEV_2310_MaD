package exercice_pourcentage_paiement;

import java.util.Scanner;

public class App {
	
	public static double[] pourcentage(int nbCB, int nbCheque, int nbVirement)
	{
		double nbPaiement = nbCB + nbCheque + nbVirement;
		double[] pourcentage = new double[3];
		pourcentage[0] = nbCB/nbPaiement*100;
		pourcentage[1] = nbCheque/nbPaiement*100;
		pourcentage[2] = nbVirement/nbPaiement*100;
		return pourcentage;
	}

	public static void main(String[] args) {
		
		int nbCB, nbCheque, nbVirement;
		int totalPaiement;
		Scanner sc = new Scanner(System.in);
		double[] resultat;
		
		System.out.println("Nombre de paiement par carte bleue ");
		nbCB = sc.nextInt();
		System.out.println("Nombre de cheques emis ");
		nbCheque = sc.nextInt();
		System.out.println("Nombre de virements automatiques ");
		nbVirement = sc.nextInt();
		totalPaiement = nbCB + nbCheque + nbVirement;
		
		resultat = pourcentage(nbCB,nbCheque,nbVirement);
		
		System.out.println("Vous avez emis "+totalPaiement+" ordres de debit dont : ");
		System.out.println("\t"+resultat[0]+" % par carte bleue");
		System.out.println("\t"+resultat[1]+" % par cheque ");
		System.out.println("\t"+resultat[2]+" % par virement ");
		
		sc.close();
	}

}
