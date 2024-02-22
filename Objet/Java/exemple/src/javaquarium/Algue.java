package javaquarium;

public class Algue {
	
	private boolean estVivante;
	private static int compteAlgue = 0;
	private int pointDeVie;
	
	public Algue()
	{
		this.estVivante = true;
		this.pointDeVie = 10;
		compteAlgue++;
	}
	
	public boolean getVivante()
	{
		return this.estVivante;
	}
	
	public int getPointDeVie()
	{
		return this.pointDeVie;
	}
	
	public void setPointDeViePerdu(int _pointDeViePerdu)
	{
		this.pointDeVie -= _pointDeViePerdu;
	}
	
	public void setPointDeVieGagner(int _pointDeVieGagner)
	{
		this.pointDeVie += _pointDeVieGagner;
	}
	
	public void setVivante(boolean _estVivante)
	{
		this.estVivante = _estVivante;
	}
	
	public static  int getNbAlgue()
	{
		return compteAlgue;
	}
	
	public static void setNbAlgue(int nbAlgue)
	{
		compteAlgue -= nbAlgue;
	}
}
