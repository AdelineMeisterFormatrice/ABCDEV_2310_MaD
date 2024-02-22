package javaquarium;

enum Race {
	Merou, Thon, PoissonClown, Sole, Bar, Carpe;
}

public class Poisson {
	
	private String nom;
	private String sexe;
	private Race race;
	private boolean estCarnivore;
	private boolean estVivant;
	private static int nbPoissons = 0;
	private int pointDeVie;
	private int nbTourPoisson;
	
	public Poisson(String _nom, String _sexe, int idrace)
	{
		this.nom = _nom;
		this.sexe = _sexe;
		this.race = this.setRace(idrace);
		this.estCarnivore = this.setCarnivore();
		this.estVivant = true;
		this.pointDeVie = 10;
		this.nbTourPoisson = 0;
		nbPoissons++;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getSexe()
	{
		return this.sexe;
	}
	
	
	public boolean getCarnivore()
	{
		return this.estCarnivore;
	}
	
	public boolean setCarnivore()
	{
		if(this.race.equals(race.Merou) || this.race.equals(Race.Thon)  || this.race.equals(Race.PoissonClown) )
		{
			return this.estCarnivore = true;
		}
		else
		{
			return this.estCarnivore = false;
		}
	}
	
	public Race getRace()
	{
		return this.race;
	}
	
	public  Race setRace(int idrace)
	{
		switch (idrace)
		{
		case 1:
			this.race = Race.Merou;
			break;
		case 2:
			this.race = Race.Thon;
			break;
		case 3:
			this.race = Race.PoissonClown;
			break;
		case 4:
			this.race = Race.Sole;
			break;
		case 5:
			this.race = Race.Bar;
			break;
		case 6:
			this.race = Race.Carpe;
			break;
		}
		return race;
	}
	
	public int getPointDeVie()
	{
		return this.pointDeVie;
	}
	
	public void setNom(String _nom)
	{
		this.nom = _nom;
	}
	
	public void setSexe(String _sexe)
	{
		this.sexe = _sexe;
	}
	
	public void setPointDeViePerdu(int _pointDeViePerdu)
	{
		this.pointDeVie -= _pointDeViePerdu;
	}
	
	public void setPointDeVieGagner(int _pointDeVieGagner)
	{
		this.pointDeVie += _pointDeVieGagner;
	}
	
	public static int getNbPoissons()
	{
		return nbPoissons;
	}
	
	
	public static void setNbPoisson(int nbPoisson)
	{
		nbPoissons -= nbPoisson;
	}
	
	
	public boolean getVivant()
	{
		return this.estVivant;
	}
	
	public void setVivant(boolean _estVivant)
	{
		this.estVivant = _estVivant;
	}
	
	public int getNbTourPoisson()
	{
		return this.nbTourPoisson;
	}
	
	public void setNbTourPoisson(int nbTour)
	{
		this.nbTourPoisson = nbTour;
	}
}
