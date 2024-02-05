package exercice_geometry;

public class Cercle {
	
	private Point centre;
	//private Double rayon;
	private double rayon; 
	private final double pi = Math.PI;
	
	public Cercle(Point _centre, double _rayon)
	{
		this.centre = _centre;
		this.rayon = _rayon;
	}
	
	public double perimetre()
	{
		return Math.round(2*pi*this.rayon*100.00)/100.00;
	}
	
	public double surface()
	{
		return Math.round( pi * Math.pow(rayon, 2)*100.00)/100.00;
	}
	
	/*public void testAppartenance(Point unPoint)
	{
		Double distance = Math.sqrt(Math.pow(unPoint.getAbcsisse() - this.centre.getAbcsisse(), 2) + Math.pow(unPoint.getOrdonnee() - this.centre.getOrdonnee(), 2));
		if(distance.doubleValue() == this.rayon.doubleValue())
		{
			System.out.println("Le point qui a pour abcsisse "+unPoint.getAbcsisse()+" et pour ordonnee "+unPoint.getOrdonnee()+" appartient au cercle");
		}
		else
		{
			System.out.println("Le point qui a pour abcsisse "+unPoint.getAbcsisse()+" et pour ordonnee "+unPoint.getOrdonnee()+" n'appartient pas au cercle");
		}
	}*/
	
	public void testAppartenance(Point unPoint)
	{
		
		double distance = Math.sqrt(Math.pow(unPoint.getAbcsisse() - this.centre.getAbcsisse(), 2) + Math.pow(unPoint.getOrdonnee() - this.centre.getOrdonnee(), 2));
		System.out.println(distance);
		if(distance == this.rayon)
		{
			System.out.println("Le point qui a pour abcsisse "+unPoint.getAbcsisse()+" et pour ordonnee "+unPoint.getOrdonnee()+" appartient au cercle");
		}
		else
		{
			System.out.println("Le point qui a pour abcsisse "+unPoint.getAbcsisse()+" et pour ordonnee "+unPoint.getOrdonnee()+" n'appartient pas au cercle");
		}
	}
	
	@Override
	public String toString()
	{
		return "Le cercle a un perimetre de : "+this.perimetre()+ " et une surface de "+this.surface();
	}
}
