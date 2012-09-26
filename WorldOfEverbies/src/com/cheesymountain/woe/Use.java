package com.cheesymountain.woe;

public class Use {
	
	public void activate(Object o){
		if(o instanceof Food ){
			Log.getLog().foodGiven((Food)o);
			Everbie.getEverbie().changeFullness(((Food)o).getFullnessModifier());
			Everbie.getEverbie().changeHappiness(((Food)o).getHappinessModifier());
			Everbie.getEverbie().changeToxicity(((Food)o).getToxicityModifier());
		}

		
	}
}
