package exo_est_divisible;

public class App {
	
	public static boolean estDivisible(int a, int b)
	{
		if(a%b==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		int nb1, nb2;
		boolean divisible;
		nb1 = 6;
		nb2 = 2;
		divisible = estDivisible(nb1,nb2);
		
		System.out.println(divisible);

	}

}
