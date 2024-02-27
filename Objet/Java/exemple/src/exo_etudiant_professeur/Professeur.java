package exo_etudiant_professeur;

public class Professeur extends Personne {
	
	private String sujet;
	
	public Professeur(String _nom, String _prenom, int _anneeNaissance, String _sujet) {
		super(_nom, _prenom, _anneeNaissance);
		this.sujet = _sujet;
	}
	
	public String cours()
	{
		return "Le cours commence";
	}
	
	public String afficherAge()
	{
		return "J'ai "+ this.calculAge(getAnneeCourante())+" ans";
	}
	
	@Override
	public String toString()
	{
		return this.disBonjour()
				+"\nJe m'appelle : "+this.prenom+" "+this.nom
				+"\n"+this.afficherAge()
				+"\nje suis professeur de "+this.sujet
				+"\n"+this.cours();
	}

	

}
