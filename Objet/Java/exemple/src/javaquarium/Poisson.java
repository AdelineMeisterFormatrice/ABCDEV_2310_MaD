package javaquarium;

enum Race {
	Merou, Thon, PoissonClown, Sole, Bar, Carpe;
}

public class Poisson {
	
	private String nom;
	private Race race;
	private boolean estCarnivore;
	private boolean estVivant;
	private boolean aFaim;
	private int genre;
	private int pointDeVie;
	private int nbTourPoisson;
	
	public Poisson(String _nom, int _sexe, int idrace)
	{
		this.nom = _nom;
		this.genre = _sexe;
		this.race = this.setRace(idrace);
		this.estCarnivore = this.setCarnivore();
		this.estVivant = true;
		this.pointDeVie = 10;
		this.aFaim = false;
		this.nbTourPoisson = 0;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getSexe()
	{
		return this.genre;
	}
	
	public boolean getAFaim()
	{
		return this.aFaim;
	}
	
	public void setAFaim()
	{
		if(this.pointDeVie > 0 && this.pointDeVie <= 5)
		{
			 this.aFaim = true;
		}
		else
		{
			 this.aFaim = false;
		}
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
	
	public int getIdrace()
	{
		switch(this.race)
		{
		case Merou:
			return 1;
		case Thon:
			return 2;
		case PoissonClown:
			return 3;
		case Sole:
			return 4;
		case Bar:
			return 5;
		case Carpe:
			return 6;
			default:
				return 0;
		}
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
	
	public void setSexe(int _sexe)
	{
		this.genre = _sexe;
	}
	
	public void setPointDeViePerdu(int _pointDeViePerdu)
	{
		this.pointDeVie -= _pointDeViePerdu;
	}
	
	public void setPointDeVieGagner(int _pointDeVieGagner)
	{
		this.pointDeVie += _pointDeVieGagner;
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
