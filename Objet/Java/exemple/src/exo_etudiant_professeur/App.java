package exo_etudiant_professeur;

public class App {

	public static void main(String[] args) {
		
		Etudiant unEtudiant = new Etudiant("Leponge","Bob",1995,"ABCDEV");
		Professeur unProfesseur = new Professeur("Uzzi","Jacque",1978,"Mathematique");
		
		System.out.println(unEtudiant);
		System.out.println(unProfesseur);

	}

}
