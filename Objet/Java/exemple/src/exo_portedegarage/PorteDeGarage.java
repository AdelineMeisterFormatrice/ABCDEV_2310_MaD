package exo_portedegarage;

public class PorteDeGarage {
	
	private String marque;
	private boolean estOuverte;
	private boolean estVerrouiller;
	private int degresOuverture;
	private final int degresMax;
	private final int degresMin;
	
	public PorteDeGarage(String _marque, boolean _estOuverte, boolean _estVerrouiller,int _degresOuverture)
	{
		this.marque = _marque;
		this.estOuverte = _estOuverte;
		this.estVerrouiller = _estVerrouiller;
		this.degresOuverture = _degresOuverture;
		this.degresMax = 100;
		this.degresMin = 0;
	}
	
	public boolean ouvrir()
	{
		if(!estOuverte && !estVerrouiller)
		{
			this.estOuverte = true;
			this.degresOuverture = this.degresMax;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean fermer()
	{
		if(estOuverte && !estVerrouiller)
		{
			this.estOuverte = false;
			this.degresOuverture = this.degresMin;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verrouiller()
	{
		if(!estOuverte  && !estVerrouiller)
		{
			this.estVerrouiller = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean deverrouiller()
	{
		if(!estOuverte && this.estVerrouiller)
		{
			this.estVerrouiller = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean ouvrirPartiellement(int degresAOuvrir)
	{
		if(!estVerrouiller)
		{
			if(this.degresOuverture + degresAOuvrir <= this.degresMax)
			{
				this.degresOuverture = this.degresOuverture + degresAOuvrir;
				if(!estOuverte)
				{
					this.estOuverte = true;
				}
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
	
	public boolean fermerPartiellement(int degresAFermer)
	{
		if(!estVerrouiller)
		{
			if(this.degresOuverture - degresAFermer >= degresMin)
			{
				this.degresOuverture = this.degresOuverture - degresAFermer;
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
}
