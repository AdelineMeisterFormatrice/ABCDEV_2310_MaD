package exo_etudiant_professeur;

public class Etudiant extends Personne {

	private String section; 
	
	public Etudiant(String _nom, String _prenom, int _anneeNaissance, String _section) {
		super(_nom, _prenom, _anneeNaissance);
		this.section = _section;
	}
	
	public String afficherAge()
	{
		return "J'ai "+this.calculAge(getAnneeCourante())+" ans";
	}
	
	public String goToClasse()
	{
		return "Je vais en classe";
	}
	
	@Override
	public String toString()
	{
		return this.disBonjour()
				+"\nJe m'appelle : "+this.prenom +" "+this.nom
				+"\n"+this.afficherAge()
				+"\nJe suis en "+this.section
				+"\n"+this.goToClasse();
	}

}
