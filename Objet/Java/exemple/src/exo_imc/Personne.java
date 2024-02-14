package exo_imc;

public class Personne {
	
	private double taille;
	private double poids;
	private int age;
	
	public Personne(double _taille, double _poids, int _age)
	{
		this.taille = _taille;
		this.poids = _poids;
		this.age = _age;
	}
	
	public double imc()
	{
		return Math.round(this.poids/Math.pow(this.taille, 2)*100.00)/100.00;
	}
	
	public String interpretation()
	{
		String resultat = "";
		double imcCalculer = imc();
		
		if(imcCalculer < 16)
		{
			resultat = "Maigreur extreme";
		}
		else if(imcCalculer >= 16 && imcCalculer <= 18.4)
		{
			resultat = "insuffisance pondéral";
		}
		else if(imcCalculer >= 18.5 && imcCalculer <= 24.9)
		{
			resultat = "Corpulence normale";
		}
		else if(imcCalculer >= 25 && imcCalculer <= 29.9)
		{
			resultat = "Surpoids";
		}
		else if (imcCalculer >= 30 && imcCalculer <= 34.9)
		{
			resultat = "Obesité";
		}
		else if (imcCalculer >= 35 && imcCalculer <= 40)
		{
			resultat = "Obesité severe";
		}
		else
		{
			resultat = "Obésité morbide";
		}
		
		return resultat;
	}

}
