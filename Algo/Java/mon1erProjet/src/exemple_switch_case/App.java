package exemple_switch_case;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombre;
		
		System.out.println("Saisir un nombre entre 1 et 5 ");
		nombre = sc.nextInt();
		
		switch(nombre)
		{
			case  1:
			{
				System.out.println("Vous avez saisie : "+nombre);
				break;
			}
			case  2:
			{
				System.out.println("Vous avez saisie : "+nombre);
				break;
			}
			case  3:
			{
				System.out.println("Vous avez saisie : "+nombre);
				break;
			}
			case  4:
			{
				System.out.println("Vous avez saisie : "+nombre);
				break;
			}
			case  5:
			{
				System.out.println("Vous avez saisie : "+nombre);
				break;
			}
			default :
			{
				System.out.println("Erreur system votre pc va explosé");
			}
		}
		
		sc.close();

	}

}
