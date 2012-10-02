package com.cheesymountain.woe;

import com.cheesymountain.woe.work.Work;

public class Use {
	
	public void activate(Object o){
		if(o instanceof Food){
			Food food = (Food)o;
			Log.getLog().foodGiven(food);
			Everbie.getEverbie().changeFullness(food.getFullnessModifier());
			Everbie.getEverbie().changeHappiness(food.getHappinessModifier());
			Everbie.getEverbie().changeToxicity(food.getToxicityModifier());
		}

		if(o instanceof Work){
			Work work = (Work)o;
			//Log.getLog().workStarted(work);
			Everbie.getEverbie().changeMoney(work.getSalary());
			Everbie.getEverbie().changeHappiness(work.getHappinessModifier());
			Everbie.getEverbie().changeHealth(work.getHealthModifier());
		}
	
		if(o instanceof Interaction){
			Interaction interact = (Interaction)o;
			//Log.getLog().interactionMade(work);
			Everbie.getEverbie().changeCharm(interact.getCharmModifier());
			Everbie.getEverbie().changeCuteness(interact.getCutenessModifier());
			Everbie.getEverbie().changeHappiness(interact.getHappinessModifier());
		}
	}
}
