package exercice_date;

public class App {

	public static void main(String[] args) {
		
		Date date1 = new Date(13,2,2024);
		Date date2 = new Date(10,1,2024);
		Date date3 = new Date(13,5,2024);
		Date date4 = new Date(14,1,2025);
		
		String str = Date.afficherDate(date1);
		
		System.out.println(str);
		
		date1.comparerDate(date2);
		date2.comparerDate(date1);
		
		System.out.println(date1.afficherComparaison(date2));
		System.out.println(date4.afficherComparaison(date3));


	}

}
