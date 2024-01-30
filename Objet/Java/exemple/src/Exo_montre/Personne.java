package Exo_montre;

public class Personne {
	
	private String nom;
	private Montre maMontre;
	
	public Personne(String _nom)
	{
		this.nom = _nom;
		this.maMontre = null;
	}
	
	public boolean porteMontre(Montre _maMontre)
	{
		if(_maMontre.getPerso() == null && this.maMontre == null)
		{
			this.maMontre = _maMontre;
			maMontre.setPerso(this);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Montre getMontre()
	{
		return maMontre;
	}
	
	public Montre enleveMontre()
	{
		Montre maMontre = this.maMontre;
		this.maMontre = null;
		if(maMontre!=null)
		{
			maMontre.setPerso(null);
		}
		return maMontre;
	}
	
	public String donneHeure()
	{
		if(this.maMontre != null)
		{
			return this.maMontre.getHeures()+" h "+this.maMontre.getMinutes()+" min";
		}
		else
		{
			return " ";
		}
	}

}
