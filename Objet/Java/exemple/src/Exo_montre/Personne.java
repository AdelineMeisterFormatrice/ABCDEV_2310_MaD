package Exo_montre;

public class Personne {
	
	// declaration des attributs
	private String nom;
	private Montre maMontre;
	
	// constructeur avec parametre
	public Personne(String _nom)
	{
		this.nom = _nom;
		this.maMontre = null;
	}
	
	// methode pour faire porter une montre à une personne
	public boolean porteMontre(Montre _maMontre)
	{
		// on teste si la montre est portée par une personne
		if(_maMontre.getPerso() == null && this.maMontre == null)
		{
			// alors la montre de la personne devient _maMontre
			this.maMontre = _maMontre;
			// et on relie la personne à la montre
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
	
	// methode pour enlever une montre à une personne
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
	
	// methode pour donner l'heure d'une montre porter
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
