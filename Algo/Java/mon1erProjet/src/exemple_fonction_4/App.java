package exemple_fonction_4;

public class App {
	
	public static int addition(int nombre1, int nombre2)
	{
		int resultat;
		
		resultat = nombre1 + nombre2;
		
		return resultat;
	}
	
	public static void afficherResultat(int nombre1, int nombre2, int resultat)
	{
		System.out.println("Le resultat de l'addition de "+nombre1+" et "+nombre2+" est : "+resultat);
	}

	public static void main(String[] args) {
		
		int a = 2;
		int b = 5;
		int calcul;
		int c = 7;
		int d = 10;
		
		calcul = addition(a,b);
		
		afficherResultat(a,b,calcul);
		
		calcul = addition(c,d);
		
		afficherResultat(c,d,calcul);
		
		afficherResultat(d,c,calcul);
		
		

	}

}
