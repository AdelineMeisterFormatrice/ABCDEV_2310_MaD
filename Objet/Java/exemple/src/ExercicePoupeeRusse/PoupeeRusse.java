package ExercicePoupeeRusse;

public class PoupeeRusse {
	
	private char identifiantPoupee;
	private int taille;
	private boolean estOuverte;
	private PoupeeRusse contient;
	private PoupeeRusse estContenuDans;
	private static final PoupeeRusse estVide = new PoupeeRusse(' ',-1);
	
	public PoupeeRusse(char _identifiantPoupee, int _taille)
	{
		this.identifiantPoupee = _identifiantPoupee;
		this.taille = _taille;
		this.estOuverte = false;
		this.contient = estVide;
		this.estContenuDans = estVide;
	}
	
	public boolean ouvrir()
	{
		if(!this.estOuverte && this.estContenuDans.equals(estVide))
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
		if(this.estOuverte && this.estContenuDans.equals(estVide))
		{
			this.estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean placerDans(PoupeeRusse p)
	{
		if(!this.estOuverte
				&& p.estOuverte
				&& p.contient.equals(estVide)
				&& this.estContenuDans.equals(estVide)
				&& p.taille > this.taille)
		{
			this.estContenuDans = p;
			p.contient = this;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean sortirDe(PoupeeRusse p)
	{
		if ( p.estOuverte && this.estContenuDans.equals(p))
		{
			p.contient = estVide;
			this.estContenuDans = estVide;
			return true;
		}
		else
		{
			return false;
		}
	}

}
