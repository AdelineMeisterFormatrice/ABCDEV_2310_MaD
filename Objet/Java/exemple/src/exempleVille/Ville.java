package exempleVille;

public class Ville {
	
	private String nomVille;
	private String nomPays;
	private int nbHabitants;
	private char categorie;
	public static int nbInstances = 0;
	private static int nbInstancesBis = 0;
	
	public Ville()
	{
		System.out.println("Creation d'une ville par defaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
		this.setCategorie();
		nbInstances++;
		nbInstancesBis++;
	}
	
	public Ville(String _nomVille, String _nomPays, int _nbHabitants)
	{
		System.out.println("Creation d'une ville avec parametre");
		nomVille = _nomVille;
		nomPays = _nomPays;
		nbHabitants = _nbHabitants;
		this.setCategorie();
		nbInstances++;
		nbInstancesBis++;
	}
	
	// ********** Getters***********
	
	// retourne le nom de la ville
	
	public String getNomVille()
	{
		return nomVille;
	}
	
	// retourne le nom du pays
	
	public String getNomPays()
	{
		return nomPays;
	}
	
	// retourne nombre d'habitant
	
	public int getNbHabitants()
	{
		return nbHabitants;
	}
	
	public char getCategorie()
	{
		return categorie;
	}
	
	public static int getNbInstances()
	{
		return nbInstancesBis;
	}
	// ********** Setters **********
	
	// definir le nom de la ville
	
	public void setNomVille(String _nomVille)
	{
		nomVille = _nomVille;
	}
	
	// definir le nom du pays
	
	public void setNomPays(String _nomPays)
	{
		nomPays = _nomPays;
	}
	
	// definir le nombre d'habitant
	
	public void setNbhabitants(int _nbHabitants)
	{
		nbHabitants = _nbHabitants;
		this.setCategorie();
	}
	
	private void setCategorie()
	{
		int bornesSuperieur[] = {0, 1000, 10000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?' , 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		int i = 0;
		
		while(i < bornesSuperieur.length && this.nbHabitants > bornesSuperieur[i])
		{
			i++;
		}
		this.categorie = categories[i];
	}
	
	public String decrisToi()
	{
		return "\t"+this.nomVille+" est une ville de "
					+this.nomPays
					+" elle comporte "
					+this.nbHabitants
					+" habitant(s) => elle est donc de categorie "
					+this.categorie;
	}
	
	public String comparerVille(Ville uneVille)
	{
		String str;
		
		if(uneVille.getNbHabitants() > this.nbHabitants)
		{
			str = uneVille.getNomVille() + " est plus peuplée que "+this.nomVille;
		}
		else
		{
			str = this.nomVille + " est plus peuplée que "+uneVille.getNomVille();
		}
		
		return str;
	}

}
