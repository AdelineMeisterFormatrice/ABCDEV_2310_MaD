package exo_recette_cuisine_v2;


public class IngredientACuire extends Ingredient {
		
		private boolean aDecouper;
		
		public IngredientACuire(String _nomAliment, int _quantite, String _unite, boolean _aDecouper)
		{
			super(_nomAliment,_quantite,_unite);
			this.aDecouper = _aDecouper;
		}

		@Override
		boolean getAdecouper() {
			// TODO Auto-generated method stub
			return this.aDecouper;
		}

		@Override
		boolean getAcuire() {
			// TODO Auto-generated method stub
			return true;
		}

}



