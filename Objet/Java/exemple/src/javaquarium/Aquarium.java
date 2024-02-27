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
	private static int nbPoissonEnVie = 0;
	
	
	
	
	public Aquarium()
	{
		this.listPoisson = ajouterListPoisson();
		this.listAlgue = ajouterListAlgue();
	}
	
	
	
	public ArrayList<Poisson> ajouterListPoisson()
	{
		Scanner sc = new Scanner(System.in);
		String nomPoisson;
		int sexe;
		int idrace;
		Race race;
		int nbrPoisson = nbPoisson;
		boolean estCarnivore = false;
		for(int i = 0; i < nbPoisson; i++)
		{
			System.out.println("Vous avez "+nbrPoisson+" poisson\nSaisir le nom du poisson : ");
			nomPoisson = sc.next();
			System.out.println("Saisir le sexe du poisson : ");
			sexe = sc.nextInt();
			System.out.println("Saisir la race du poisson : \nParmis : Merou, Thon, Poisson-clown, Sole, Bar et Carpe");
			idrace = sc.nextInt();
			
			this.listPoisson.add(i,new Poisson(nomPoisson, sexe, idrace));
			
			nbrPoisson--;
			nbPoissonEnVie++;
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
		String str3="";
		for(int i = 0; i < getNbPoissons(); i++)
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
		for(int i = 0; i < this.listAlgue.size();i++)
		{
			str3 += "\nindex algues : "+i+1+" point de vie : "+this.listAlgue.get(i).getPointDeVie();
		}
		return str = "Dans l'aquarium il y a : " + Algue.getNbAlgue() + " algues"
				+ " et il y a "+ getNbPoissons() + " poissons dont : "+str2+str3;
	}
	
	public void manger()
	{
		for(int i = 0; i < this.listPoisson.size();i++)
		{
			if(this.listPoisson.get(i).getAFaim())
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
					if(getNbPoissons() > 1)
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
	
	public void reproductionPoisson()
	{
		if(nbPoissonEnVie > 2 && nbPoissonEnVie <=10)
		{
			for(int i = 0; i < this.listPoisson.size(); i++)
			{
				if(this.listPoisson.get(i).getAFaim())
				{
						int indicePoisson = nbRandom.nextInt(this.listPoisson.size());
						int sexe = nbRandom.nextInt(2)+1;
						if(this.listPoisson.get(i).getRace() == this.listPoisson.get(indicePoisson).getRace() 
						&& this.listPoisson.get(i).getSexe() != this.listPoisson.get(indicePoisson).getSexe())
						{
							this.listPoisson.add(new Poisson("Adeline "+i,sexe,this.listPoisson.get(i).getIdrace()));
							nbPoissonEnVie++;
						}
				}
			}
		}
		
	}
	
	public void reproductionAlgues()
	{
		if(Algue.getNbAlgue() >= 1 && Algue.getNbAlgue() <= 10)
		{
			for(int i = 0; i < this.listAlgue.size(); i++)
			{
				if(this.listAlgue.get(i).getPointDeVie() >= 10 && Algue.getNbAlgue() <=10)
				{
					this.listAlgue.add(new Algue(5));
					this.listAlgue.get(i).setpointDeVie(5);
				}
			}
		}
	}
	
	public void cycleDeVieAlgue()
	{
		for(int i = 0; i < this.listAlgue.size() ; i++ )
		{
			if(this.listAlgue.get(i).getVivante() == true && this.listAlgue.get(i).getPointDeVie() <= 50)
			{
				this.listAlgue.get(i).setPointDeVieGagner(1);
			}
			if(this.listAlgue.get(i).getPointDeVie() <= 0)
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
				this.listPoisson.get(i).setNbTourPoisson(1);
				this.listPoisson.get(i).setAFaim();
			}
			if(this.listPoisson.get(i).getPointDeVie() <= 0)
			{
				this.listPoisson.get(i).setVivant(false);
				//this.listPoisson.remove(i);
				setNbPoisson(-1);
			}
			if(this.listPoisson.get(i).getNbTourPoisson() == 20)
			{
				this.listPoisson.get(i).setVivant(false);
				//this.listPoisson.remove(i);
				setNbPoisson(-1);
			}
		}
	}
	
	public static int getNbPoissons()
	{
		return nbPoissonEnVie;
	}
	
	
	public static void setNbPoisson(int nbPoisson)
	{
		nbPoissonEnVie += nbPoisson;
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
			for(int i = 0; i < getNbPoissons(); i++)
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
					+ " et il y a "+ getNbPoissons() + " poissons dont : ";
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
	

