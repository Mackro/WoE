package com.cheesymountain.woe;
/*=============================================================
 * Copyright 2012, Cheesy Mountain Production
 * 
 * This file is part of World of Everbies.
 * 
 * World of Everbies is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * World of Everbies is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with World of Everbies.  If not, see <http://www.gnu.org/licenses/>.
================================================================*/


import com.cheesymountain.woe.food.Food;
import com.cheesymountain.woe.interact.Interaction;
import com.cheesymountain.woe.item.Item;
import com.cheesymountain.woe.training.Training;
import com.cheesymountain.woe.util.Occupationable;
import com.cheesymountain.woe.work.Work;

/**
 * @author Karl-Agnes
 *
 * A class for activating/using different items or activities.
 */
public class Use {
	
	public static final int NOT_ENOUGH_OI = 2;
	public static final int SUCCESS = 20;
	public static final int EVERBIE_IS_BUSY = 200, EVERBIE_IS_FAINTED = 201, EVERBIE_IS_DEAD = 202;
	public static final int EVERBIE_TOO_WEAK = 2000, EVERBIE_TOO_LAZY = 2001, EVERBIE_TOO_DUMB = 2002;
	private Occupation currentOccupation = new Occupation();
	
	/**
	 * Activates the desired event which could be a food,
	 * an item or an activity.
	 * 
	 * @param food - the food that should be consumed
	 * @return if this method was success fully completed or not
	 */
	public int activate(Food food){
		if(!Everbie.getEverbie().isAlive()){
			Log.getLog().isDead();
			return EVERBIE_IS_DEAD;
		}else if(Everbie.getEverbie().isFainted()){
			Log.getLog().isFainted();
			return EVERBIE_IS_FAINTED;
		}else if(Everbie.getEverbie().isOccupied()){
			Log.getLog().isBusy();
			return EVERBIE_IS_BUSY;
		}
		if(Everbie.getEverbie().changeMoney(-food.getCost())){
			Log.getLog().foodGiven(food);
			Everbie.getEverbie().changeFullness(food.getFullnessModifier());
			Everbie.getEverbie().changeHappiness(food.getHappinessModifier());
			Everbie.getEverbie().changeToxicity(food.getToxicityModifier());
			return SUCCESS;
		}else{
			return NOT_ENOUGH_OI;
		}
	}

	/**
	 * Activates the desired event which could be a food,
	 * an item or an activity.
	 * 
	 * @param work - the work that should be started
	 * @return if this method was success fully completed or not
	 */
	public int activate(Work work){
		if(!Everbie.getEverbie().isAlive()){
			Log.getLog().isDead();
			return EVERBIE_IS_DEAD;
		}else if(Everbie.getEverbie().isFainted()){
			Log.getLog().isFainted();
			return EVERBIE_IS_FAINTED;
		}else if(Everbie.getEverbie().isOccupied()){
			Log.getLog().isBusy();
			return EVERBIE_IS_BUSY;
		}else if(work.getStrengthReq()>Everbie.getEverbie().getStrength()){
			Log.getLog().tooWeak(work.getStrengthReq());
			return EVERBIE_TOO_WEAK;
		}else if(work.getStaminaReq()>Everbie.getEverbie().getStamina()){
			Log.getLog().tooLazy(work.getStaminaReq());
			return EVERBIE_TOO_LAZY;
		}else if(work.getIntelligenceReq()>Everbie.getEverbie().getIntelligence()){
			Log.getLog().tooDumb(work.getIntelligenceReq());
			return EVERBIE_TOO_DUMB;
		}
		Log.getLog().started(work);
		Everbie.getEverbie().setOccupation(work, System.currentTimeMillis());
		Everbie.getEverbie().setOccupiedMinutes(work.getTime());
		currentOccupation.start();
		return SUCCESS;
	}

	/**
	 * Activates the desired event which could be a food,
	 * an item or an activity.
	 * 
	 * @param interact - the interaction that should be made
	 * @return if this method was success fully completed or not
	 */
	public int activate(Interaction interact){
		if(!Everbie.getEverbie().isAlive()){
			Log.getLog().isDead();
			return EVERBIE_IS_DEAD;
		}else if(Everbie.getEverbie().isFainted()){
			Log.getLog().isFainted();
			return EVERBIE_IS_FAINTED;
		}else if(Everbie.getEverbie().isOccupied()){
			Log.getLog().isBusy();
			return EVERBIE_IS_BUSY;
		}
		Log.getLog().interactionMade(interact);
		Everbie.getEverbie().changeCharm(interact.getCharmModifier());
		Everbie.getEverbie().changeCuteness(interact.getCutenessModifier());
		Everbie.getEverbie().changeHappiness(interact.getHappinessModifier());
		return SUCCESS;
	}

	/**
	 * Activates the desired event which could be a food,
	 * an item or an activity.
	 * 
	 * @param item - the item that should be consumed
	 * @return if this method was success fully completed or not
	 */
	public int activate(Item item){
		if(!Everbie.getEverbie().isAlive()){
			Log.getLog().isDead();
			return EVERBIE_IS_DEAD;
		}else if(Everbie.getEverbie().isFainted()){
			Log.getLog().isFainted();
			return EVERBIE_IS_FAINTED;
		}else if(Everbie.getEverbie().isOccupied()){
			Log.getLog().isBusy();
			return EVERBIE_IS_BUSY;
		}
		if(Everbie.getEverbie().changeMoney(-item.getCost())){
			Log.getLog().itemUsed(item);
			Everbie.getEverbie().changeStrength(item.getStrengthModifier());
			Everbie.getEverbie().changeIntelligence(item.getIntelligenceModifier());
			Everbie.getEverbie().changeCharm(item.getCharmModifier());
			Everbie.getEverbie().changeCuteness(item.getCutenessModifier());
			Everbie.getEverbie().changeHappiness(item.getHappinessModifier());
			Everbie.getEverbie().changeHealth(item.getHealthModifier());
			Everbie.getEverbie().changeStamina(item.getStaminaModifier());
			Everbie.getEverbie().changeToxicity(item.getToxicityModifier());
			return SUCCESS;
		}else{
			return NOT_ENOUGH_OI;
		}
	}

	/**
	 * Activates the desired event which could be a food,
	 * an item or an activity.
	 * 
	 * @param training - the training that should be started
	 * @return if this method was success fully completed or not
	 */
	public int activate(Training train){
		if(!Everbie.getEverbie().isAlive()){
			Log.getLog().isDead();
			return EVERBIE_IS_DEAD;
		}else if(Everbie.getEverbie().isFainted()){
			Log.getLog().isFainted();
			return EVERBIE_IS_FAINTED;
		}else if(Everbie.getEverbie().isOccupied()){
			Log.getLog().isBusy();
			return EVERBIE_IS_BUSY;
		}
		Log.getLog().started(train);
		Everbie.getEverbie().setOccupation(train, System.currentTimeMillis());
		Everbie.getEverbie().setOccupiedMinutes(train.getTime());
		currentOccupation.start();
		return SUCCESS;
	}
	
	/**
	 * Called when the Everbie is done with the corresponding occupation.
	 * @param occupation - the work or training done
	 */
	public static void done(Occupationable occupation){
		if(occupation instanceof Work){
			done((Work)occupation);
		}else if(occupation instanceof Training){
			done((Training)occupation);
		}
	}

	/**
	 * Called when the Everbie is done with work.
	 * @param occupation - the work done
	 */
	public static void done(Work work){
		Everbie.getEverbie().changeMoney(work.getSalary());
		Everbie.getEverbie().changeHealth(work.getHealthModifier());
	}
	

	/**
	 * Called when the Everbie is done with the training.
	 * @param occupation - the training done
	 */
	public static void done(Training train){
		Everbie.getEverbie().changeStrength(train.getStrengthModifier());
		Everbie.getEverbie().changeStamina(train.getStaminaModifier());
		Everbie.getEverbie().changeIntelligence(train.getIntelligenceModifier());
	}
	
	public void stopOccupation(){
		currentOccupation = null;
	}

	/**
	 * Thread responsible for everything that takes up real life time. such as work or training.
	 * @author Cheesy Mountain
	 *
	 */

	public class Occupation extends Thread {

		public long startingTime;

		@Override
		public void start(){
			startingTime = Everbie.getEverbie().getOccupationStartTime();
			Everbie.getEverbie().setOccupiedSeconds((int)((Everbie.getEverbie().getOccupation().getTime()*60) 
					- ((System.currentTimeMillis() - startingTime)/1000)));
			super.start();
		}

		@Override
		public void run(){
			while(Everbie.getEverbie().isAlive() && Everbie.getEverbie().getOccupiedSeconds() > 0){
				try{
					Thread.sleep(1000);
				}catch(InterruptedException ie){}
				Everbie.getEverbie().setOccupiedSeconds((int)((Everbie.getEverbie().getOccupation().getTime()*60) 
						- ((System.currentTimeMillis() - startingTime)/1000)));
			}
			Use.done(Everbie.getEverbie().getOccupation());
		}
	}
}