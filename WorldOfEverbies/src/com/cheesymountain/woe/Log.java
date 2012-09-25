package com.cheesymountain.woe;

import java.util.LinkedList;

public class Log {


	LinkedList<String> log;
	Everbie everbie;

	public Log() {
		log = new LinkedList<String>();
		everbie = Everbie.getEverbie();
	}
	
	public String getLog(){
		String logString = "";
		for(int i = 0; i < log.size(); i++ ){
			logString += log.getFirst();
		}
		return logString;
		
	}

	public void foodGiven(Food food) {
		generateString(food);
	}

	/**
	 * 
	 * temporarily removed due to it using unimplemented classes
	 * 
	 * public void workDone(Work work){ generateString(work); }
	 * 
	 * public void trainingDone(Train train){ genereateString(train); }
	 */

	public void generateString(Food food) {

		if (log.size() > 19) {
			log.removeFirst();
		}

		if (food.getHappinessModifier() > 0) {
			log.addLast(everbie.getName() + " ate some " + food.getName()
					+ " and smiles at you");
		} else if (food.getHappinessModifier() < 0) {
			log.addLast(everbie.getName() + " ate some " + food.getName()
					+ ", and tries to stab you with a spoon");
		}
		log.addLast(everbie.getName() + " ate some " + food.getName());
	}

	/**
	 * 
	 * temporarily removed due to it using unimplemented classes
	 * 
	 * public String generateString(Work work){ return ""; }
	 * 
	 * public String genereateString(Train train){ return ""; }
	 */

}
