package exo_employe;

public class Date {
	
	private int jour;
	private int mois;
	private int annee;
	
	public Date(int _jour, int _mois, int _annee)
	{
		this.jour = _jour;
		this.mois = _mois;
		this.annee = _annee;
	}
	
	public int getMois()
	{
		return this.mois;
	}
	
	public int getJour()
	{
		return this.jour;
	}
	
	public int getAnnee()
	{
		return this.annee;
	}

}
