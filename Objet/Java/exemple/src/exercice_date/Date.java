package exercice_date;

public class Date {
	
	private int jour, mois, annee;
	private boolean estValide;
	private static String[] moisEnLettre = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
	
	public Date(int _jour, int _mois, int _annee)
	{
		this.jour = _jour;
		this.mois = _mois;
		this.annee = _annee;
		this.estValide = validerDate();
	}
	
	public boolean validerDate()
	{
		boolean cas1, cas2, cas3, cas4, estBisextille;
		estBisextille = (this.annee%4 == 0 && this.annee%100 != 0 || this.annee%400 == 0);
		cas1 = (this.mois == 1 || this.mois == 3 || this.mois == 5 || this.mois == 7 || this.mois == 8 || this.mois == 10 || this.mois == 12) && (this.jour >= 1 && this.jour <= 31);
		cas2 = (this.mois == 4 || this.mois == 6 || this.mois == 9 || this.mois == 11) && (this.jour >= 1 && this.jour <= 30);
		cas3 = this.mois == 2 && estBisextille && this.jour >= 1 && this.jour <= 29;
		cas4 = this.mois == 2 && this.jour >= 1 && this.jour <= 28;
		
		if(cas1 || cas2 || cas3 || cas4)
		{
			this.estValide = true;
			return true;
		}
		else
		{
			this.estValide = false;
			return false;
		}
	}
	
	public static String afficherDate(Date uneDate)
	{
		String moisEnL = "";
		if(uneDate.estValide)
		{
			moisEnL = uneDate.jour +" ";
			for(int i = 0; i < moisEnLettre.length; i++)
			{
				if(uneDate.mois == i+1)
				{
					moisEnL = moisEnL + moisEnLettre[i];
				}
			}
			moisEnL = moisEnL + " " + uneDate.annee;
		}
		else
		{
			moisEnL = "Date non valide";
		}
		return moisEnL;
	}
	
	public boolean comparerDate(Date uneDate)
	{
		if(uneDate.annee > this.annee)
		{
			return true;
		}
		else if(this.annee <= uneDate.annee && this.mois <= uneDate.mois && uneDate.jour > this.jour 
				|| this.annee <= uneDate.annee && uneDate.mois > this.mois)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}
