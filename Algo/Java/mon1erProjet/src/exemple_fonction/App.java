package exemple_fonction;

import java.util.Scanner;

public class App {
	/*
	ENTIER FONCTION valeur_absolue (VAL ENTIER nombre)
SI (nombre < 0) ALORS
	RETOURNE (nombre * (-1)) 
SINON 
	RETOURNE nombre 
FINSI
FIN FONCTION

i <-- valeur_absolue(i)
limite <-- valeur_absolue(-120)

	 */
	
	public static int valeur_absolue(int nombre)
	{
		if(nombre < 0)
		{
			return (nombre * (-1));
		}
		else
		{
			return nombre;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		int limite;
		int nb;
		
		System.out.println("Saisir un nombre");
		nb = sc.nextInt();
		
		i = valeur_absolue(nb);
		limite = valeur_absolue(-120);
		
		System.out.println("la valeur absolue de nb est : "+nb+" la valeur absolue de limite est : "+limite);
		
		sc.close();
		
		

	}

}
