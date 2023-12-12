package exemple_fonction_2;

public class App {

	public static void main(String[] args) {
		
		int nombre1, nombre2, moyenne;
		
		nombre1 = 5;
		nombre2 = 4;
		
		moyenne = calculMoyenne(nombre1, nombre2);
		
		System.out.println(moyenne);
		
		

	}
	
	public static int calculMoyenne(int nb1, int nb2)
	{
		return (nb1 + nb2)/2;
	}
}
