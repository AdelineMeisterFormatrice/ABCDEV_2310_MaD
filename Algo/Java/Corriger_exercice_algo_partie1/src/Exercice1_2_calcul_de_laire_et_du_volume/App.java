package Exercice1_2_calcul_de_laire_et_du_volume;

import java.util.Scanner;

public class App {
	/*
	 Exercice 1.2 calcul de l'aire et du volume d'une sphère

VARIABLE
	rayonR est un entier
	aireSphere est un reel
	volumeSphere est un reel
CONSTANTE
	pi est un reel
DEBUT DU PROGRAMME
	Ecrire "Saisir le rayon"
	Lire rayonR
	aireSphere <-- 4 * pi * rayonR^2
	volumeSphere <-- 4/3 * pi * rayonR^3
	Ecrire "l'aire de la sphere est : ",aireSphere
	Ecrire "le volume de la sphere est : ",volumeSphere
FIN DU PROGRAMME

	 */

	public static void main(String[] args) {
		//declaration des variables
	int rayon;
	double aireSphere;
	double volumeSphere;
	//declaration d'une constante avec le mot clé final
    final double pi = Math.PI;
    // declaration d'un objet scanner
    Scanner sc = new Scanner (System.in); 
    System.out.println("saisir le rayon");
    rayon = sc.nextInt();
    // calcul de l'aire et utilisation de Math.pow pour le calcul des puissances
    aireSphere = 4*pi*Math.pow(rayon,2);
    // utilisation de Math.round pour arrondir à deux chiffres après la virgule
    aireSphere = Math.round(aireSphere * 100.00)/100.00;
    volumeSphere = 4/3*pi*Math.pow(rayon,3);
    volumeSphere = Math.round(volumeSphere * 100.00)/100.00;
    // affichage de l'aire et du volume
    System.out.println("l'aire de la sphere est "+aireSphere);
    System.out.println("Le volume de la sphere est "+volumeSphere);
    
    sc.close();
	}

}
