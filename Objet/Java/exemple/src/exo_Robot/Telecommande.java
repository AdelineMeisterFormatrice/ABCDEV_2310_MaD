package exo_Robot;

import java.util.Scanner;

public class Telecommande {
	
	private Robot r2d2;
	
	public Telecommande()
	{
		this.r2d2 = new Robot();
	}
	
	public void controleRobot()
	{
		Scanner sc = new Scanner(System.in);
		char  choixBouton;
		String infoRobot;
		boolean saisieValide;
		
		do
		{
			System.out.println("Pour allumer le robot appuyer sur la touvhe s");
			choixBouton = sc.next().charAt(0);
			if(choixBouton == 's')
			{
				r2d2.action(Bouton.ALLUMER);
				saisieValide = true;
			}
			else
			{
				System.out.println("saisie invalide");
				saisieValide = false;
			}
		}while (!saisieValide);
		
		do
		{
			System.out.println("Que voulez vous faire avec le robot ? "
								+"\n\t z pour avancer \t\t x pour reduire vitesse"
								+"\n\t q pour tourner a gauche \t d pour tourner à droite"
								+"\n\t 0 pour eteindre et quitter le programme");
			choixBouton = sc.next().charAt(0);
			switch(choixBouton)
			{
			case 'z':
				r2d2.action(Bouton.AVANCER);
				break;
			case 'x':
				r2d2.action(Bouton.RECULER);
				break;
			case 'q':
				r2d2.action(Bouton.TOURNERAGAUCHE);
				break;
			case 'd':
				r2d2.action(Bouton.TOURNERADROITE);
				break;
			case '0':
				r2d2.action(Bouton.ETEINDRE);
				break;
			default :
				System.out.println("Le robot ne sais pas faire ça");
				break;
			}
			infoRobot = r2d2.affichageRobotInfo();
			System.out.println(infoRobot);
		}while(r2d2.getestAllumer());
		sc.close();
	}

}
