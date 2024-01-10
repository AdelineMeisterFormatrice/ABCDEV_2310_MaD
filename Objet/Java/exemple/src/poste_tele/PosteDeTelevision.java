package poste_tele;

public class PosteDeTelevision {
	
	private String marque;
	private String modele;
	private int dimension;
	private int resolution;
	private boolean estAllumer;
	
	public boolean allumer()
	{
		if(!estAllumer)
		{
			estAllumer = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean eteindre()
	{
		if(estAllumer)
		{
			estAllumer = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// constructeur par defaut
	public PosteDeTelevision()
	{
		marque = "inconnu";
		modele = "inconnu";
		dimension = 0;
		resolution = 0;
		estAllumer = false;
	}
	
	// constructeur avec parametre
	public PosteDeTelevision(String _marque, String _modele, int _dimension, int _resolution, boolean _estAllumer)
	{
		marque = _marque;
		modele = _modele;
		dimension = _dimension;
		resolution = _resolution;
		estAllumer = _estAllumer;
	}

}
