package exo_recette_cuisine_v2;

import java.util.ArrayList;

public class Plat {
	
	private String nomPlat;
	private ArrayList <Ingredient> listIngredient;
	
	public Plat(String _nomPlat)
	{
		this.nomPlat = _nomPlat;
		this.listIngredient = new ArrayList<Ingredient>();
	}
	
	public String getNom()
	{
		return this.nomPlat;
	}
	
	public Ingredient getIngredient(int index)
	{
		return this.listIngredient.get(index);
	}
	
	public void addIngredient(Ingredient i)
	{
		this.listIngredient.add(i);
	}
	
	public void cuireOuDecouper()
	{
		for(int i = 0; i < this.listIngredient.size(); i++)
		{
			this.listIngredient.get(i).setEtatIngredient();
		}
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Plat)
		{
			for(Ingredient i:this.listIngredient)
			{
				if(!((Plat) o).listIngredient.contains(i)) return false;
			}
			return this.listIngredient.size() == ((Plat) o).listIngredient.size();
		}
		else
		{
			return true;
		}
	}
	
	@Override
	public String toString()
	{
		String str = this.nomPlat;
		for(int i = 0; i < this.listIngredient.size();i++)
		{
			str = str+ "\nIngredient " +(i+1)+" : "+this.listIngredient.get(i).getNom()
					+" "+ this.listIngredient.get(i).getEtat()+" "+this.listIngredient.get(i).getQuantite()
					+" "+ this.listIngredient.get(i).getUnite();
		}
		
		return str;
	}

}