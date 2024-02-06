package exo_employe;

import java.util.Calendar;

public class Employe {
	
	private String matricule, nom, prenom;
	private int anneeNaissance, anneeEmbauche;
	private double salaire;
	private Calendar cal =  Calendar.getInstance();
	private int anneeCourante = cal.get(Calendar.YEAR);
	
	public Employe(String _matricule, String _nom, String _prenom, int _anneNaissance, int _anneeEmbauche, double _salaire)
	{
		this.matricule = _matricule;
		this.nom = _nom;
		this.prenom = _prenom;
		this.anneeNaissance = _anneNaissance;
		this.anneeEmbauche = _anneeEmbauche;
		this.salaire = _salaire;
	}
	
	public int age()
	{
		return anneeCourante - this.anneeNaissance;
	}
	
	public int anciennete()
	{
		return anneeCourante - this.anneeEmbauche;
	}
	
	public void augmentationDuSalaire()
	{
		if(this.anciennete() < 5)
		{
			this.salaire = this.salaire + this.salaire * 2 / 100;
		}
		else if(this.anciennete() < 10)
		{
			this.salaire = this.salaire + this.salaire * 5 / 100;
		}
		else
		{
			this.salaire = this.salaire + this.salaire * 10 / 100;
		}
	}
	
	public void afficherEmploye()
	{
		System.out.println("Matricule : "+this.matricule
							+"\nNom : "+this.nom
							+"\nPrenom : "+this.prenom
							+"\nAge : "+this.age()
							+"\nAnciennete : "+this.anciennete()
							+"\nSalaire : "+this.salaire);
	}
	
	
	

}
