package exo_etudiant_professeur;

import java.util.Calendar;

public class Personne {
	
	protected String nom;
	protected String prenom;
	protected int anneeNaissance;
	private Calendar cal =  Calendar.getInstance();
	private int anneeCourante = cal.get(Calendar.YEAR);
	
	public Personne(String _nom, String _prenom, int _anneeNaissance)
	{
		this.nom = _nom;
		this.prenom = _prenom;
		this.anneeNaissance = _anneeNaissance;
	}
	
	public String disBonjour()
	{
		return "Bonjour !!!";
	}
	
	public int calculAge(int _anneeCourante)
	{
		return _anneeCourante - this.anneeNaissance;
	}
	
	public int getAnneeCourante()
	{
		return this.anneeCourante;
	}

}
