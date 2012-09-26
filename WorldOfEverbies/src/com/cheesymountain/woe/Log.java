package com.cheesymountain.woe;

import java.util.LinkedList;

public class Log {

	private static Log log;
	LinkedList<String> logList;
	Everbie everbie;

	private Log() {
		logList = new LinkedList<String>();
		everbie = Everbie.getEverbie();
	}
	
	public synchronized static Log getLog(){
		if(log == null){
			log = new Log();
		}
		return log;
	}
	
	public String getLogList(){
		String logString = "";
		for(int i = 0; i <logList.size(); i++ ){
			logString += logList.getFirst();
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

		if (logList.size() > 19) {
			logList.removeFirst();
		}

		if (food.getHappinessModifier() > 0) {
			logList.addLast(everbie.getName() + " ate some " + food.getName()
					+ " and smiles at you");
		} else if (food.getHappinessModifier() < 0) {
			logList.addLast(everbie.getName() + " ate some " + food.getName()
					+ ", and tries to stab you with a spoon");
		}
		logList.addLast(everbie.getName() + " ate some " + food.getName());
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
