package exo_recette_cuisine_v2;

public class App {

	public static void main(String[] args) {
		
		Plat plat1 = new Plat("Choucroute");
		plat1.addIngredient(new IngredientACuire("Choucroute",500,"g",false));
		plat1.addIngredient(new IngredientADecouper("Lard",200,"g",true));
		plat1.addIngredient(new IngredientACuire("Saucisse",2,"unite",false));

		System.out.println(plat1);
		plat1.cuireOuDecouper();
		System.out.println(plat1);
	}

}
