package exo_voiture;

public class Voiture {
	
	private String marque;
	private double prix;
	
	public Voiture()
	{
		this.marque = "inconnu";
		this.prix = 0.0;
	}
	
	public Voiture(String _marque, double _prix)
	{
		this.marque = _marque;
		this.prix = _prix;
	}
	
	public String getMarque()
	{
		return this.marque;
	}
	
	public double getPrix()
	{
		return this.prix;
	}
	
	public void setMarque(String _marque)
	{
		this.marque = _marque;
	}
	
	public void setPrix(double _prix)
	{
		this.prix = _prix;
	}
	
	public void afficher()
	{
		System.out.println("Marque : "+this.getMarque()+"\n"
							+"Prix : "+this.getPrix());
	}
}
