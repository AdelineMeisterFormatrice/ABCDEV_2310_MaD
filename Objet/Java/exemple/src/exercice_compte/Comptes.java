package exercice_compte;

public class Comptes {
	
	private double solde;
	
	public Comptes(double _solde)
	{
		this.solde = _solde;
	}
	
	public void deposer(double sommeAjouter)
	{
		this.solde = this.solde + sommeAjouter;
	}
	
	public void retirer(double sommeRetirer)
	{
		this.solde = this.solde - sommeRetirer;
	}
	
	public void afficher()
	{
		System.out.println("le solde est : "+this.solde);
	}

}
