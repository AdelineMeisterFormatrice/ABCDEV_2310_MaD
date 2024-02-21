package exemple_ville_capitale;

public class Capitale extends Ville {
	
	private String monument;
	
	public Capitale()
	{
		super();
		this.monument = "aucun";
	}
	
	public Capitale(String _nom, String _pays,int _nbHabitant, String _monument)
	{
		super(_nom,_pays,_nbHabitant);
		this.monument = _monument;
	}
	
	public String getMonument()
	{
		return this.monument;
	}
	
	public void setMonument(String _monument)
	{
		this.monument = _monument;
	}
	
	public String decrisToi()
	{
		return super.decrisToi() + " \n\t ==> "+this.monument+" en est un monument";
	}

}
