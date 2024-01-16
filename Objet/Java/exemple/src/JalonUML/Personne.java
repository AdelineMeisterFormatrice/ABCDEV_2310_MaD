package JalonUML;

import java.time.YearMonth;

public class Personne {
	
	// declaration des attributs
	private final String nom;
	private final String prenom;
	private int anneeDeNaissance;
	private boolean estMajeur;
	// variable anneeCourante pour obtenir l'annee en cours
	private int anneeCourante = YearMonth.now().getYear();
	
	// constructeur avec paramètre
	public Personne(String _nom,String _prenom,int _anneeDeNaissance)
	{
		this.nom = _nom;
		this.prenom = _prenom;
		this.anneeDeNaissance = _anneeDeNaissance;
		// on definit la majorite d'un objet personne grace à l'appel de la methode definirMaforite
		this.estMajeur = this.definirMajorite(this.definirAge(anneeCourante));
	}
	
	// methode pour calculer l'age d'une personne grace à son annee de naissance et l'anne en cours
	public int definirAge(int anneeCourante)
	{
		int age = anneeCourante - this.anneeDeNaissance;
		return age;
	}
	
	// methode pour definir si la personne est majeur en fonction de son age
	public boolean definirMajorite(int _age)
	{
		if(_age >= 18)
		{
			this.estMajeur = true;
		}
		else
		{
			this.estMajeur = false;
		}
		return estMajeur;
	}
	
	// methode pour afficher les informations d'une personne
	public String affichage()
	{
		String str;
		str = "Cette personne se nomme : "+this.nom+" "+this.prenom+" née en "+this.anneeDeNaissance+" elle a "+this.definirAge(anneeCourante)+" ans";
		if(estMajeur)
		{
			str = str + " elle est majeur";
		}
		else
		{
			str = str + " elle est mineur";
		}
		return str;
	}

}
