package exo_rectangle;

public class Rectangle {
	
	private double largeur;
	private double longueur;
	
	public Rectangle(double _largeur, double _longueur)
	{
		this.largeur = _largeur;
		this.longueur = _longueur;
	}
	
	public double calculPerimetre()
	{
		return (this.largeur + this.longueur) * 2;
	}
	
	public double calculSurface()
	{
		double surface;
		surface = this.largeur * this.longueur;
		return surface;
	}
	
	public void afficher()
	{
		System.out.println("le perimetre du rectangle est : "+this.calculPerimetre()
							+"\nLa surface du rectangle est : "+this.calculSurface());
	}
}
