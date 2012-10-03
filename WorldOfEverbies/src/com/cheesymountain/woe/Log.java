package com.cheesymountain.woe;

import java.util.LinkedList;

import com.cheesymountain.woe.food.Food;
import com.cheesymountain.woe.interact.Interaction;
import com.cheesymountain.woe.item.Item;
import com.cheesymountain.woe.training.Training;
import com.cheesymountain.woe.work.Work;

/**
 * Contains and creates a logged string with information about what
 * the Everbie is up to.
 * @author Cheesy Mountain
 *
 */
public class Log {

	private static Log log;
	LinkedList<String> logList;
	Everbie everbie;

	private Log() {
		logList = new LinkedList<String>();
		everbie = Everbie.getEverbie();
	}
	
	
	/**
	 * Returns a pointer that references to the Log if one exists otherwise creates a new one
	 * @return a pointer to the log
	 */
	public synchronized static Log getLog(){
		if(log == null){
			log = new Log();
		}
		return log;
	}
	
	/**
	 * Returns a plain String containing the text that will be displayed
	 * @return a long text
	 */
	public String getLogList(){
		String logString = "";
		Object[] o = logList.toArray();
		for(int i = 1; i <= logList.size(); i++ ){
			if(o[logList.size()-1] instanceof String){
				logString += (String)o[logList.size() - i];
			}
		}
		return logString;
		
	}

	/**
	 * Is called when food is given to the Everbie to configure the 
	 * String correctly
	 * @param food - the food given
	 */
	public void foodGiven(Food food) {
		generateString(food);
	}
	
	/**
	 * Is called when work is given to the Everbie to configure the 
	 * String correctly
	 * @param work - the work to do
	 */
	public void workDone(Work work){
		generateString(work);
	}
	
	/**
	 * Is called when training is completed by the Everbie to configure the 
	 * String correctly
	 * @param train
	 */
	public void trainingDone(Training train){
		generateString(train);
	}
	
	/**
	 * Is called when the user interacts with the Everbie to configure the 
	 * String correctly
	 * @param interact - the interaction choosen
	 */
	public void interactionMade(Interaction interact){
		generateString(interact);
	}
	
	/**
	 * Is called when item is given to the Everbie to configure the 
	 * String correctly
	 * @param item - the item given
	 */
	public void itemUsed(Item item){
		generateString(item);
	}
	
	/**
	 * Is called when training is started to the Everbie to configure the 
	 * log correctly
	 * @param train - the type of training started
	 */
	public void trainingStarted(Training train){
		if (logList.size() > 19) {
			logList.removeFirst();
		}
		logList.addLast(everbie.getName() +" began to workout by starting with " + train.getName() + "\n");
	}
	
	/**
	 * Is called when work is started by the Everbie to configure the 
	 * log correctly
	 * @param work - the kind of work started
	 */
	public void workStarted(Work work){
		if (logList.size() > 19) {
			logList.removeFirst();
		}
		logList.addLast(everbie.getName() +" started to work as " + work.getName() + "\n");
	}
	
	/**
	 * Adds a modified string to the log with the corresponding action
	 * @param train - the training done
	 */
	private void generateString(Training train) {

		if (logList.size() > 19) {
			logList.removeFirst();
		}
		
		logList.addLast(everbie.getName() + " worked out by doing some " + train.getName() + " and now " + everbie.getName()
				+ " gained" + (train.getStrengthModifier()>0?" increased":train.getStrengthModifier()<0?" decreased":" no")
				+ " strength and gained" + (train.getStaminaModifier()>0?" increased":train.getStaminaModifier()<0?" decreased":" no")
				+ " stamina  and gained" + (train.getIntelligenceModifier()>0?" increased":train.getIntelligenceModifier()<0?" decreased":" no")
				+ " intelligence and grew hungrier");
	}

	/**
	 * Adds a modified string to the log with the corresponding action
	 * @param interact - the interaction choosen
	 */
	private void generateString(Interaction interact) {

		if (logList.size() > 19) {
			logList.removeFirst();
		}

		logList.addLast("You and " + everbie.getName() + " " + interact.getName() + " and now " + everbie.getName()
				+ (interact.getCutenessModifier()>0?" became cuter":interact.getCutenessModifier()<0?" became uglier":" confused")
				+ (interact.getCharmModifier()>0?" and whinks at you":interact.getCharmModifier()<0?" and gestures angrily at you"
				:" and hugs you") + ", " + everbie.getName() + " is now"
				+ (interact.getHappinessModifier()>0?" happier than":interact.getHappinessModifier()<0?" angrier than":" the same as") + " before");
	}

	/**
	 * Adds a modified string to the log with the corresponding action
	 * @param work - the work done
	 */
	private void generateString(Work work) {

		if (logList.size() > 19) {
			logList.removeFirst();
		}
		logList.addLast(everbie.getName() + " worked as " + work.getName() + " for " + work.getTime() 
				+ " hours and has now become " + 
				(work.getHappinessModifier()>0?" happier": (work.getHappinessModifier()<0?" angrier":" tired"))
				+ " and earned " + work.getSalary());
	}

	/**
	 * Adds a modified string to the log with the corresponding action
	 * @param food - the food given
	 */
	private void generateString(Food food) {

		if (logList.size() > 19) {
			logList.removeFirst();
		}
		logList.addLast(everbie.getName()+ " ate som " + food.getName() + " and is now"
				+ (food.getHappinessModifier()>0?" happier": (food.getHappinessModifier()<0?" angrier":" the same"))
				+ (food.getToxicityModifier()>0?" but became sicker":(food.getToxicityModifier()<0?" and became healthier":"")) 
				+ " than before and not as hungry \n");
	}
	
	/**
	 * Adds a modified string to the log with the corresponding action
	 * @param item - the item given
	 */
	private void generateString(Item item) {

		if (logList.size() > 19) {
			logList.removeFirst();
		}
		logList.addLast(everbie.getName() + " used a " + item.getName() +  
		(item.getStrengthModifier()>0?" and became stronger":(item.getStrengthModifier()<0?" and became weaker":"")) + 
		(item.getStaminaModifier()>0?" and became tougher":(item.getStaminaModifier()<0?" and became less fit":"")) + 
		(item.getIntelligenceModifier()>0?" and became smarter":(item.getIntelligenceModifier()<0?" and became dumber":"")) +
		(item.getCharmModifier()>0?" and became more charming":(item.getStrengthModifier()<0?" and became less charming":"")) +
		(item.getCutenessModifier()>0?" and became cuter":(item.getCutenessModifier()<0?" and became uglier":"")) +
		(item.getHealthModifier()>0?" and regained health":(item.getHealthModifier()<0?" and lost health":"")) +
		(item.getToxicityModifier()>0?" and got sicker":(item.getStrengthModifier()<0?" and became healthier":"")) + "\n");
	}
}
