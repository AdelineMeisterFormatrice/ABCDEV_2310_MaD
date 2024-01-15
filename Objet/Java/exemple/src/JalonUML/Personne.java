package JalonUML;

public class Personne {
	
	private final String nom;
	private final String prenom;
	private int anneeDeNaissance;
	private boolean estMajeur;
	
	public Personne(String _nom,String _prenom,int _anneeDeNaissance)
	{
		this.nom = _nom;
		this.prenom = _prenom;
		this.anneeDeNaissance = _anneeDeNaissance;
		this.estMajeur = this.definirMajorite(this.definirAge(2024));
	}
	
	public int definirAge(int anneeCourante)
	{
		int age = anneeCourante - this.anneeDeNaissance;
		return age;
	}
	
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
	
	public String affichage()
	{
		String str;
		str = "Cette personne se nomme : "+this.nom+" "+this.prenom+" née en "+this.anneeDeNaissance+" elle a "+this.definirAge(2024)+" ans";
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
