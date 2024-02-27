package exo_maison;

public class Personne {
	
	private String nom;
	private Maison uneMaison;
	
	public Personne()
	{
		this.nom = "Adeline";
		this.uneMaison = new Maison(150);
	}
	
	public Personne(String _nom, Maison _uneMaison)
	{
		this.nom = _nom;
		this.uneMaison = _uneMaison;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public Maison getMaison()
	{
		return this.uneMaison;
	}
	
	public void setNom(String _nom)
	{
		this.nom = _nom;
	}
	
	public void setMaison(Maison _uneMaison)
	{
		this.uneMaison = _uneMaison;
	}
	
	@Override
	public String toString()
	{
		return "je m'appelle "+this.nom
				+"\n"+this.uneMaison.toString()
				+"\n"+this.uneMaison.unePorte.toString();
	}

}
