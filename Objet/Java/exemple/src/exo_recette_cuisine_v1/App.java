package exo_recette_cuisine_v1;

public class App {

	public static void main(String[] args) {
		
		Plat kougloff = new Plat("Kougloff d'Adeline");
		kougloff.addIngredient(new Ingredient("Farine",500,"g"));
		kougloff.addIngredient(new Ingredient("Lait",25,"cl"));
		kougloff.addIngredient(new Ingredient("Beurre",125,"g"));
		kougloff.addIngredient(new Ingredient("Levure",20,"g"));
		kougloff.addIngredient(new Ingredient("Oeufs",2,"unité"));
		kougloff.addIngredient(new Ingredient("Sucre",75,"g"));
		kougloff.addIngredient(new Ingredient("Raisin Sec",100,"g"));
		kougloff.addIngredient(new Ingredient("Sel",5,"g"));
		
		System.out.println(kougloff);
	}
}



