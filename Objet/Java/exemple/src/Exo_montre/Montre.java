package Exo_montre;

public class Montre {
	
	// declaration des attributs
	private int heures, minutes;
	private Personne perso;
	
	// constructeurs avec paramètre
	public Montre(int _heures, int _minutes)
	{
		this.heures = _heures;
		this.minutes = _minutes;
	}
	
	// constructeur 
	public Montre(Montre _maMontre)
	{
		this.heures = _maMontre.heures;
		this.minutes = _maMontre.minutes;
	}
	
	// methode pour avancer d'une minute
	public void avanceMinute()
	{
		if(this.minutes == 59)
		{
			if(this.heures == 23)
			{
				this.heures = 0;
				this.minutes = 0;
			}
			else
			{
				this.heures = this.heures++;
				this.minutes = 0;
			}
		}
		else
		{
			this.minutes++;
		}
	}
	
	/**********************
	 *******Getters********
	 **********************/
	public Personne getPerso()
	{
		return perso;
	}
	
	public int getHeures()
	{
		return this.heures;
	}
	
	public int getMinutes()
	{
		return this.minutes;
	}
	
	/********************
	 ******Setters*******
	 ********************/
	
	public void setPerso(Personne _perso)
	{
		this.perso = _perso;
	}
}
