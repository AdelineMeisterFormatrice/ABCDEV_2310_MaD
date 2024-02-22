package exemple_ville_capitale;

public class App {

	public static void main(String[] args) {
		
		Ville[] tableau = new Ville[6];
		
		String tab[] = {"Marseille","Lyon","Mulhouse","Paris","Washington","Berlin"};
		String tab1[] = {"France","Etats Unis d'Amerique","Allemagne"};
		int tab2[] = {870321,522228,138038,2945906,705749,3748748};
		String tab3[] = {"La tour Eiffel","Le Lincoln Memorial","Le palais du Reichtag"};
		
		for(int i = 0; i < 6; i++)
		{
			if(i < 3)
			{
				Ville ville = new Ville(tab[i],tab1[0],tab2[i]);
				tableau[i] = ville;
			}
			else
			{
				Capitale capitale = new Capitale(tab[i],tab1[i-3],tab2[i],tab3[i-3]);
				tableau[i] = capitale;
			}
		}
		
		for(Ville ville : tableau)
		{
			System.out.println(ville.decrisToi()+"\n");
		}

	}

}
