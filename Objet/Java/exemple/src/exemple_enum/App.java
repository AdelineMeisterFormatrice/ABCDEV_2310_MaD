package exemple_enum;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		/*Mois un = new Mois("Janvier", 31);
		Mois deux = new Mois("fevrier", 28);
		Mois quinexsistepas = new Mois("Lunaire",365);*/
		
		//Month un = new Month("Lunaire", 365);
		
		//Month.JANVIER.setNom("Lunaire");
		
		Month.FEVRIER.setNbJour(2024);
		System.out.println(Arrays.toString(Month.getMoisHiver()));
		Month.FEVRIER.setNbJour(2023);
		System.out.println(Arrays.toString(Month.getMoisHiver()));
		
	}

}
