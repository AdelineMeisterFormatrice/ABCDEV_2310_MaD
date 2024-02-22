package javaquarium;

public class Tour {
	
	private static Aquarium unAquarium;
	private static int compteTour = 0;
	
	public static void initialisation()
	{
		unAquarium = new Aquarium();
		System.out.println(unAquarium.afficherEtatAquarium());
	}
	
	public static void unTour()
	{
		
		while(Poisson.getNbPoissons() > 0)
		{
			
			unAquarium.manger();
			unAquarium.cycleDeVieAlgue();
			unAquarium.cycleDeViePoisson();
			System.out.println("Tour n°" +compteTour+"\n\t"+ unAquarium.afficherEtatAquarium());
			unAquarium.ecritureFichier();
			compteTour++;
		}			
	}

	public static int getNbTour()
	{
		return compteTour;
	}
}
