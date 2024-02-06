package exo_employe;

public class App {

	public static void main(String[] args) {
		
		Employe agent = new Employe("007","Bond","James",1970,1995,7500);
		agent.augmentationDuSalaire();
		agent.afficherEmploye();
		Date dateNaissance = new Date( 8, 11, 1978);
		Date dateEmbauche = new Date (1, 12, 2022);
		Employe adeline = new Employe("008","Meistertzheim","Adeline",dateNaissance,dateEmbauche,3500);
		adeline.augmentationDuSalaire();
		adeline.afficherEmployeV2();
		}
	}


