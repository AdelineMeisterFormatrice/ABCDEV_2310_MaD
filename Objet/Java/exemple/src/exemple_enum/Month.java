package exemple_enum;

import java.util.Calendar;

public enum Month {
	
	
	JANVIER ("Janvier",31),
	FEVRIER ("Fevrier", 28),
	MARS ("Mars", 31),
	AVRIL ("Avril", 30),
	MAI ("Mai",31),
	JUIN ("Juin",30),
	JUILLET ("Juillet", 31),
	AOUT ("Aout", 31),
	SEPTEMBRE ("Septembre", 30),
	OCTOBRE ("octobre", 31),
	NOVEMBRE ("Novembre",30),
	DECEMBRE ("Decembre", 31);
	
	private String nom;
	private int nbJour;
	
	
	Month(String _nom, int _nbJour)
	{
		this.nom = _nom;
		this.nbJour = _nbJour;
	}
	
	public static Month[] getMoisHiver()
	{
		return new Month[] {DECEMBRE, JANVIER, FEVRIER};
	}
	
	public static Month[] getMoisEte()
	{
		return new Month[] {JUIN, JUILLET, AOUT};
	}
	
	public static Month[] getMoisAutomne()
	{
		return new Month[] {SEPTEMBRE, OCTOBRE, NOVEMBRE};
	}
	
	public static Month[] getMoisPrintemps()
	{
		return new Month[] {MARS, AVRIL, MAI};
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getNbJour()
	{
		return this.nbJour;
	}
	
	public void setNom(String _nom)
	{
		this.nom = _nom;
	}
	
	public static void setNbJour(int _annee)
	{
		Boolean estBisextille = (_annee%4 == 0 && _annee%100 != 0) || _annee%400 == 0;
		if(Month.FEVRIER.nom == "Fevrier" && estBisextille)
		{
			Month.FEVRIER.nbJour =  29;
		}
		else if(Month.FEVRIER.nom == "Fevrier" && !estBisextille)
		{
			Month.FEVRIER.nbJour = 28;
		}
	}
	
	@Override
	public String toString()
	{
		return "Mois{" + this.nom + " nombre de jour "+this.nbJour+"}";
	}

}
