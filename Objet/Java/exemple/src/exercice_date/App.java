package exercice_date;

public class App {

	public static void main(String[] args) {
		
		Date date1 = new Date(13,2,2024);
		Date date2 = new Date(10,1,2024);
		
		String str = Date.afficherDate(date1);
		
		System.out.println(str);
		
		date1.comparerDate(date2);
		date2.comparerDate(date1);

	}

}
