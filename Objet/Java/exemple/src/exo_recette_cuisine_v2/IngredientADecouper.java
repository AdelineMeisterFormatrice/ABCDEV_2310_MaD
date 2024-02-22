package exo_recette_cuisine_v2;

public class IngredientADecouper extends Ingredient {
	
private boolean aCuire;
	
	public IngredientADecouper(String _nomAliment, int _quantite, String _unite, boolean _aCuire) {
		super(_nomAliment, _quantite, _unite);
		this.aCuire = _aCuire;
	}

	@Override
	boolean getAdecouper() {
		
		return true;
	}

	@Override
	boolean getAcuire() {
		
		return this.aCuire;
	}

}
