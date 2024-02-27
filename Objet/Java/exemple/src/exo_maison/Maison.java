package exo_maison;

public class Maison {
	
	protected int surface;
	protected Porte unePorte;
	
	public Maison(int _surface)
	{
		this.surface = _surface;
		this.unePorte = new Porte("Bleu");
	}
	
	public int getSurface()
	{
		return this.surface;
	}
	
	public Porte getPorte()
	{
		return this.unePorte;
	}
	
	public void setSurface(int _surface)
	{
		this.surface = _surface;
	}
	
	public void setPorte(Porte _unePorte)
	{
		this.unePorte = _unePorte;
	}
	
	
	@Override
	public String toString()
	{
		return "j'habite une maison d'une surface de "+this.surface+" m2";
	}

}
