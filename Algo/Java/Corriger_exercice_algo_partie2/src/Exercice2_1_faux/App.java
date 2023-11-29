package Exercice2_1_faux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir votre age ");
		age = sc.nextInt();
		
		if(age <= 18)
		{
			System.out.println("Vous êtes mineur");
		}
		else if(age < 0)
		{
			System.out.println("Vous n'êtes pas encore né");
		}
		else
		{
			System.out.println("Vous êtes majeur");
		}
		
		sc.close();

	}

}
