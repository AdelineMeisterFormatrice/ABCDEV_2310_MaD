package exo_maison;

public class Porte {
	
	private String couleur;
	
	public Porte(String _couleur)
	{
		this.couleur = _couleur;
	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
	
	public void setCouleur(String _couleur)
	{
		this.couleur = _couleur;
	}
	
	@Override
	public String toString()
	{
		return "Sa porte est de couleur :"+this.couleur; 
	}

}
