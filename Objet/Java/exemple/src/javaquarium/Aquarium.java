package javaquarium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Aquarium {
	private static Random nbRandom = new Random();
	private static int nbPoisson = nbRandom.nextInt(5)+1;
	private static int nbAlgue = nbRandom.nextInt(5)+1;
	private ArrayList<Poisson> listPoisson = new ArrayList<>();
	private ArrayList<Algue> listAlgue = new ArrayList<>();
	
	
	
	
	public Aquarium()
	{
		this.listPoisson = ajouterListPoisson();
		this.listAlgue = ajouterListAlgue();
	}
	
	
	
	public ArrayList<Poisson> ajouterListPoisson()
	{
		Scanner sc = new Scanner(System.in);
		String nomPoisson;
		String sexe;
		int idrace;
		Race race;
		int nbrPoisson = nbPoisson;
		boolean estHerbivore = true;
		boolean estCarnivore = false;
		for(int i = 0; i < nbPoisson; i++)
		{
			System.out.println("Vous avez "+nbrPoisson+" poisson\nSaisir le nom du poisson : ");
			nomPoisson = sc.nextLine();
			System.out.println("Saisir le sexe du poisson : ");
			sexe = sc.nextLine();
			System.out.println("Saisir la race du poisson : \nParmis : Merou, Thon, Poisson-clown, Sole, Bar et Carpe");
			idrace = sc.nextInt();
			
			this.listPoisson.add(i,new Poisson(nomPoisson, sexe, idrace));
			
			nbrPoisson--;
		}
		sc.close();
		return this.listPoisson;
	}
	
	public ArrayList<Algue> ajouterListAlgue()
	{
		
		for(int i = this.listAlgue.size(); i >= 0; i--)
		{
			this.listAlgue.add(i, new Algue());
		}
		return this.listAlgue;
	}
	
	public String afficherEtatAquarium()
	{
		String str;
		String str2="";
		for(int i = 0; i < Poisson.getNbPoissons(); i++)
		{
			str2 += "\n\tnom : "+this.listPoisson.get(i).getNom()+" sexe : "+this.listPoisson.get(i).getSexe();
			if(this.listPoisson.get(i).getCarnivore() == true)
			{
				str2 += " c'est un : "+this.listPoisson.get(i).getRace() +" Ce poisson est carnivore, Point de vie : "+this.listPoisson.get(i).getPointDeVie() +" Nb tour "+this.listPoisson.get(i).getNbTourPoisson();
			}
			else if(this.listPoisson.get(i).getCarnivore() == false)
			{
				str2 += " c'est un : "+this.listPoisson.get(i).getRace() + " Ce poisson est herbivore, Point de vie : "+this.listPoisson.get(i).getPointDeVie()+" Nb tour "+this.listPoisson.get(i).getNbTourPoisson();
			}
		}
		return str = "Dans l'aquarium il y a : " + Algue.getNbAlgue() + " algues"
				+ " et il y a "+ Poisson.getNbPoissons() + " poissons dont : "+str2;
	}
	
	public void manger()
	{
		
		
		for(int i = 0; i < this.listPoisson.size();i++)
		{
			if(this.listPoisson.get(i).getPointDeVie() > 5)
			{
				if(this.listPoisson.get(i).getCarnivore() == false && this.listPoisson.get(i).getVivant() == true)
				{
					if(Algue.getNbAlgue() > 0)
					{
						int indiceAlgue = nbRandom.nextInt(this.listAlgue.size());
						if(this.listAlgue.get(indiceAlgue).getVivante() == true)
						{
							
							this.listAlgue.get(indiceAlgue).setPointDeViePerdu(2);
							this.listPoisson.get(i).setPointDeVieGagner(3);
						}	
					}	
				}
				else if(this.listPoisson.get(i).getCarnivore() == true && this.listPoisson.get(i).getVivant() == true)
				{
					if(Poisson.getNbPoissons() > 1)
					{
						int indicePoisson = nbRandom.nextInt(this.listPoisson.size());
							if(this.listPoisson.get(indicePoisson).getVivant() == true && this.listPoisson.get(indicePoisson).getRace()!= listPoisson.get(i).getRace())
							{
								this.listPoisson.get(indicePoisson).setPointDeViePerdu(4);
								this.listPoisson.get(i).setPointDeVieGagner(5);
							}
					}
				}
			}
			
		}
	}
	
	public void cycleDeVieAlgue()
	{
		for(int i = 0; i < this.listAlgue.size() ; i++ )
		{
			if(this.listAlgue.get(i).getVivante() == true)
			{
				this.listAlgue.get(i).setPointDeVieGagner(1);
			}
			if(this.listAlgue.get(i).getPointDeVie() == 0)
			{
				this.listAlgue.get(i).setVivante(false);
				this.listAlgue.remove(i);
				Algue.setNbAlgue(1);
			}
		}
	}
	
	public void cycleDeViePoisson()
	{
		for(int i = 0; i < this.listPoisson.size(); i++)
		{
			if(this.listPoisson.get(i).getVivant() == true)
			{
				this.listPoisson.get(i).setPointDeViePerdu(1);
				this.listPoisson.get(i).setNbTourPoisson(Tour.getNbTour());
			}
			if(this.listPoisson.get(i).getPointDeVie() <= 0)
			{
				this.listPoisson.get(i).setVivant(false);
				//this.listPoisson.remove(i);
				Poisson.setNbPoisson(1);
			}
			if(this.listPoisson.get(i).getNbTourPoisson() == 20)
			{
				this.listPoisson.get(i).setVivant(false);
				//this.listPoisson.remove(i);
				Poisson.setNbPoisson(1);
			}
		}
	}
	
	public void ecritureFichier()
	{
		try {
			// Création d'un fileWriter pour écrire dans un fichier
			// Modifier le lien du fichier 
			FileWriter fileWriter = new FileWriter("C:\\Users\\Adeline\\Documents\\Git\\ABCDEV_2310_MaD\\Objet\\Java\\exemple\\src\\javaquarium\\Fichier\\Poisson.md", true);

			// Création d'un bufferedWriter qui utilise le fileWriter
			BufferedWriter writer = new BufferedWriter(fileWriter);
			String str;
			String str2="";
			for(int i = 0; i < Poisson.getNbPoissons(); i++)
			{
				str2 += "\n\tnom : "+this.listPoisson.get(i).getNom()+" sexe : "+this.listPoisson.get(i).getSexe();
				if(this.listPoisson.get(i).getCarnivore() == true)
				{
					str2 += " c'est un : "+this.listPoisson.get(i).getRace() +" Ce poisson est carnivore, Point de vie : "+this.listPoisson.get(i).getPointDeVie() +" Nb tour "+this.listPoisson.get(i).getNbTourPoisson();
				}
				else if(this.listPoisson.get(i).getCarnivore() == false)
				{
					str2 += " c'est un : "+this.listPoisson.get(i).getRace() + " Ce poisson est herbivore, Point de vie : "+this.listPoisson.get(i).getPointDeVie()+" Nb tour "+this.listPoisson.get(i).getNbTourPoisson();
				}
			}
			 str = "Dans l'aquarium il y a : " + Algue.getNbAlgue() + " algues"
					+ " et il y a "+ Poisson.getNbPoissons() + " poissons dont : ";
			// ajout d'un texte à notre fichier
			writer.write(str);
			writer.newLine();
			writer.write(str2);
			writer.newLine();
			
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
	

