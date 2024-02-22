package exo_recette_cuisine_v2;

import java.util.ArrayList;

enum Etat
{
	CUIT,CRU,ENTIER,DECOUPER;
}

abstract class Ingredient {
	
	protected String nomAliment;
	protected ArrayList <Etat> etatIngredient;
	protected int quantite;
	protected String unite;
	
	public Ingredient(String _nomAliment, int _quantite, String _unite )
	{
		this.nomAliment = _nomAliment;
		this.etatIngredient = new ArrayList<Etat>();
		this.etatIngredient.add(Etat.CRU);
		this.etatIngredient.add(Etat.ENTIER);
		this.quantite = _quantite;
		this.unite = _unite;
	}
	
	public String getNom()
	{
		return this.nomAliment;
	}
	
	public ArrayList<Etat> getEtat()
	{
		return this.etatIngredient;
	}
	
	public int getQuantite()
	{
		return this.quantite;
	}
	
	public String getUnite()
	{
		return this.unite;
	}
	
	public void setEtatIngredient()
	{
		if(this.getClass() == IngredientACuire.class)
		{
			for(int i = 0; i < this.etatIngredient.size(); i++)
			{
				if(this.etatIngredient.get(i) == Etat.CRU)
				{
					this.etatIngredient.set(0, Etat.CUIT);
				}
				else if( this.etatIngredient.get(i) == Etat.ENTIER && this.getAdecouper())
				{
					this.etatIngredient.set(1, Etat.DECOUPER);
				}
			}
		}
		else
		{
			for(int i = 0; i < this.etatIngredient.size(); i++)
			{
				if(this.etatIngredient.get(i) == Etat.CRU && this.getAcuire())
				{
					this.etatIngredient.set(0, Etat.CUIT);
				}
				else if(this.etatIngredient.get(i) == Etat.ENTIER)
				{
					this.etatIngredient.set(1, Etat.DECOUPER);
				}
			}
		}
	}
	
	abstract boolean getAdecouper();
	
	abstract boolean getAcuire();
	
	public boolean equals(Object o)
	{
		return (o instanceof Ingredient) &&
				this.nomAliment.equals(((Ingredient) o).nomAliment) &&
				this.etatIngredient.equals(etatIngredient);
	}

}
