package exercice_geometry;

public class Point {
	
	// declaration des attributs
	
	private double abscisse;
	private double ordonnee;
	
	public Point(double _abcsisse, double _ordonnee)
	{
		this.abscisse = _abcsisse;
		this.ordonnee = _ordonnee;
	}
	
	public double getAbcsisse()
	{
		return this.abscisse;
	}
	
	public double getOrdonnee()
	{
		return this.ordonnee;
	}
}
