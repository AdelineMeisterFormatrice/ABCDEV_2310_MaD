package exo_bouteille;

public class Bouteille {
	// declaration des attributs
	private String nom;
	private final double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	
	public Bouteille()
	{
		nom = "inconnu";
		capaciteEnL = 1;
		contenanceEnL = 0;
		estOuverte = true;
	}
	
	public Bouteille(String _nom,double _capaciteEnL, double _contenanceEnL, boolean _estOuverte)
	{
		this.nom = _nom;
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estOuverte = _estOuverte;
	}
	
	public boolean ouvrir()
	{
		if(!estOuverte)
		{
			this.estOuverte = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean fermer()
	{
		if(estOuverte)
		{
			this.estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean remplirTout()
	{
		if(estOuverte)
		{
			if(this.contenanceEnL < this.capaciteEnL)
			{
				this.contenanceEnL = this.capaciteEnL;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public boolean viderTout()
	{
		if(estOuverte)
		{
			if(this.contenanceEnL > 0)
			{
				this.contenanceEnL = 0;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public boolean remplir(double quantiteEnL)
	{
		double bouteillePleine = quantiteEnL + this.contenanceEnL;
		if(estOuverte)
		{
			if(bouteillePleine <= this.capaciteEnL)
			{
				this.contenanceEnL = bouteillePleine;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public boolean vider(double quantiteEnL)
	{
		if(estOuverte)
		{
			if(quantiteEnL > 0)
			{
				if(this.contenanceEnL - quantiteEnL >= 0)
				{
					this.contenanceEnL = this.contenanceEnL - quantiteEnL;
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}
