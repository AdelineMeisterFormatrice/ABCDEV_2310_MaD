package exo_employe;

import java.util.Calendar;

public class Employe {
	
	private String matricule, nom, prenom;
	private int anneeNaissance, anneeEmbauche;
	private Date dateNaissance;
	private Date dateEmbauche;
	private double salaire;
	private Calendar cal =  Calendar.getInstance();
	private int anneeCourante = cal.get(Calendar.YEAR);
	private int moisCourant = cal.get(Calendar.MONTH);
	private int jourCourant = cal.get(Calendar.DAY_OF_MONTH);
	
	public Employe(String _matricule, String _nom, String _prenom, int _anneNaissance, int _anneeEmbauche, double _salaire)
	{
		this.matricule = _matricule;
		this.nom = _nom;
		this.prenom = _prenom;
		this.anneeNaissance = _anneNaissance;
		this.anneeEmbauche = _anneeEmbauche;
		this.salaire = _salaire;
	}
	
	public Employe(String _matricule, String _nom, String _prenom,Date _dateNaissance, Date _dateEmbauche,double _salaire)
	{
		this.matricule = _matricule;
		this.nom = _nom;
		this.prenom = _prenom;
		this.dateNaissance = _dateNaissance;
		this.dateEmbauche = _dateEmbauche;
		this.salaire = _salaire;
	}
	
	public int age()
	{
		return anneeCourante - this.anneeNaissance;
	}
	
	public int ageSelonDate()
	{
		if(moisCourant+1 >= this.dateNaissance.getMois())
		{
			if(jourCourant >= this.dateNaissance.getJour())
			{
				return anneeCourante - this.dateNaissance.getAnnee();
			}
			else
			{
				return (anneeCourante-1) - this.dateNaissance.getAnnee();
			}
		}
		else
		{
			return (anneeCourante-1) - this.dateNaissance.getAnnee();
		}
	}
	
	public int anciennete()
	{
		return anneeCourante - this.anneeEmbauche;
	}
	
	public double ancienneteSelonDate()
	{
		if(moisCourant >= this.dateEmbauche.getMois() && jourCourant >= this.dateEmbauche.getJour())
		{
			return anneeCourante - this.dateEmbauche.getAnnee();
		}
		else
		{
			return (anneeCourante-1) - this.dateEmbauche.getAnnee();
		}
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
	
	public void afficherEmployeV2()
	{
		System.out.println("Matricule : "+this.matricule
							+"\nNom : "+this.nom
							+"\nPrenom : "+this.prenom
							+"\nAge : "+this.ageSelonDate()
							+"\nAnciennete : "+this.ancienneteSelonDate()
							+"\nSalaire : "+this.salaire);
	}
	
	
	

}
