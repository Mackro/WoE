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
import com.cheesymountain.woe.race.Mogno;
import com.cheesymountain.woe.race.Race;
import com.cheesymountain.woe.training.*;
import com.cheesymountain.woe.work.*;
import com.cheesymountain.woe.util.Occupationable;


/**
 * A representation of an Everbie.
 * Contains all the different variables and skills that makes up an Everbie,
 * and the mood of the current Everbie. This class is designed in accordance with
 * the singleton-pattern since there will only be one Everbie at any given time.
 * @author Cheesy Mountain
 *
 */
public class Everbie {
	
	private Race race;
	public static final String DEFAULT_NAME = "";
	public static final Race DEFAULT_RACE = new Mogno();
	private static Everbie everbie;
	public static final int STARTING_MONEY = 0, STARTING_FULLNESS = 50, STARTING_HAPPINESS = 50;
	private String name;
	private int maxHealthModifier, health, strength, intelligence, stamina,
			charm, cuteness, fullness, happiness, toxicity, money;
	private boolean alive, fainted;
	private int occupiedSeconds = 0, faintedTime = 0;
	public static final int STARVATION = 2, DEPRESSION = 1;
	private Occupationable occupation;
	private long occupationStartTime;

	private Everbie(String name, Race race) {
		alive = true;
		this.race = race;
		this.name = name;
		maxHealthModifier = race.getMaxHealthModifier();
		strength = race.getStrength();
		intelligence = race.getIntelligence();
		stamina = race.getStamina();
		charm = race.getCharm();
		cuteness = race.getCuteness();
		fullness = STARTING_FULLNESS;
		happiness = STARTING_HAPPINESS;
		toxicity = 0;
		money = STARTING_MONEY;
		health = getMaxHealth();
		new Ticker().start();
	}
	
	/**
	 * Creates an Everbie unless one already exists.
	 * @param name - the name of the Everbie that is to be created
	 * @param race - the desired race of the Everbie 
	 */
	public synchronized static void createEverbie (String name, Race race){
		if(!Everbie.exists()){
			everbie = new Everbie(name, race);
		}
	}
	
	/**
	 * Returns the pointer to the Everbie if one exists otherwise
	 * it creates a default one.
	 * @return pointer to the current Everbie
	 */
	public synchronized static Everbie getEverbie(){
		if (!Everbie.exists()){
			everbie = new Everbie(DEFAULT_NAME, DEFAULT_RACE);
		}
		return everbie;
	}
	
	/**
	 * Returns the id of the image of the current Everbie
	 * @return the image's id number
	 */
	public int getImageId(){
		if(getLevel()<5){
			return race.getImageIdMin();
		}
		else if(getLevel()>14){
			return race.getImageIdMax();
		}
		else{
			return race.getImageIdMed();
		}
	}
	
	/**
	 * Returns the int that represents the position of the current race in the static racelist
	 * @return an integer representing the races position in Race.RACELIST
	 */
	public int getRaceId(){
		for (int i=0;i<4;i++){
			if(race.getName().equalsIgnoreCase(Race.RACELIST[i].getName())){
				return i;
			}
		}
		return 0;
	}
	

	/**
	 * Returns the name of the current Everbie
	 * @return the Everbie's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the maximum health points the current Everbie can have
	 * @return the maximum health points
	 */
	public int getMaxHealth() {
		return (int)(maxHealthModifier + (stamina/2 + strength/4)*Math.PI);
	}
	
	/**
	 * Returns the base modifier for the Everbies maximun health
	 * @return the base bodifier for maxHealth
	 */
	public int getMaxHealthMod() {
		return maxHealthModifier;
	}

	/**
	 * Returns the current health points of the current Everbie
	 * @return the current health points
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Returns the current level of strength of the current Everbie
	 * @return the current level of strength
	 */
	public int getStrength() {
		return strength;
	}
	
	/**
	 * Returns the current level of intelligence of the current Everbie
	 * @return the current level of intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * Returns the current level of stamina of the current Everbie
	 * @return the current level of stamina
	 */
	public int getStamina() {
		return stamina;
	}

	/**
	 * Returns the current level of charm of the current Everbie
	 * @return the current level of charm
	 */
	public int getCharm() {
		return charm;
	}

	/**
	 * Returns the current Fullness level of the current Everbie
	 * @return the current Fullness level
	 */
	public int getFullness() {
		return fullness;
	}

	/**
	 * Returns the current Happiness level of the current Everbie
	 * @return the current Happiness level
	 */
	public int getHappiness() {
		return happiness;
	}

	/**
	 * Returns the current Toxicity level of the current Everbie
	 * @return the current Toxicity level
	 */
	public int getToxicity() {
		return toxicity;
	}

	/**
	 * Returns the current level of cuteness of the current Everbie
	 * @return the current level of cuteness
	 */
	public int getCuteness() {
		return cuteness;
	}

	/**
	 * Returns the current amount of money the current Everbie possesses
	 * @return the current amount of money
	 */
	public int getMoney() {
		return money;
	}
	
	/**
	 * Calculates and returns the current level of the current Everbie
	 * @return the current level
	 */
	public int getLevel(){
		return (strength + intelligence + stamina + Math.abs(charm/2) + Math.abs(cuteness/2))/5;
	}

	/**
	 * Returns the amount of time the Everbie is occupied
	 * @return seconds - the amount of seconds occupied
	 */
	public int getOccupiedSeconds(){
		return occupiedSeconds;
	}

	/**
	 * Returns the amount of time the Everbie should is occupied
	 * @return minutes - the amount of minutes occupied
	 */
	public int getOccupiedMinutes(){
		return (int) (getOccupiedSeconds()/60);
	}

	/**
	 * Returns the amount of time the Everbie should is occupied
	 * @return hours - the amount of hours occupied
	 */
	public int getOccupiedHours(){
		return getOccupiedMinutes()/60;
	}

	/**
	 * Returns the amount of time the Everbie should is occupied
	 * @return Occupationable - the work or training the Everbie is occupied with
	 */
	public Occupationable getOccupation(){
		return occupation;
	}
	
	/**
	 * This method returns the startTime of the Everbie's current occupation
	 * @return a long representing the startTime of the current occupation
	 */
	public long getOccupationStartTime(){
		return occupationStartTime;
	}

	/**
	 * a method that return the approximate time until a fainted Everbie awakens
	 * @return the time until awakening rounded up to closest 10 minute limit
	 */
	public int getFaintedTime(){
		return faintedTime*10;
	}
	
	/**
	 * Changes the maximum amount of health points the current Everbie can have 
	 * @param i - the value to de-/increase by
	 */
	public void changeMaxHealth(int i) {
		maxHealthModifier += i;
		if (getMaxHealth() < 1 ){
			health = 0;
			alive = false;
		}
		if (getMaxHealth() < health) {
			health = getMaxHealth();
		}
	}

	/**
	 * Changes the amount of health points the current Everbie currently has,
	 * the Everbie dies if the total value goes to 0 or less
	 * @param i - the value to de-/increase by
	 */
	public void changeHealth(int i) {
		if (health + i < getMaxHealth()) {
			health += i;
		} else if (health + i > getMaxHealth()) {
			health = getMaxHealth();
		} else if (health + i < 1) {
			health = 0;
			alive = false;
		}
	}

	/**
	 * Changes the level of strength the Everbie currently has,
	 * the Everbie dies if the total value goes to 0 or less
	 * @param i - the value to de-/increase by
	 */
	public void changeStrength(int i) {
		if (strength + i < 1){
			strength = 0;
			alive = false;
		}
		strength += i;
	}

	/**
	 * Changes the level of intelligence the Everbie currently has,
	 * the Everbie dies if the total value goes to 0 or less
	 * @param i - the value to de-/increase by
	 */
	public void changeIntelligence(int i) {
		if (intelligence + i < 1){
			intelligence = 0;
			alive = false;
		}
		intelligence += i;
	}

	/**
	 * Changes the level of stamina the Everbie currently has,
	 * the Everbie dies if the total value goes to 0 or less
	 * @param i - the value to de-/increase by
	 */
	public void changeStamina(int i) {
		if (stamina + i < 1) {
			stamina = 0;
			alive = false;
		}
		stamina += i;
	}

	/**
	 * Changes the level of charm the Everbie currently has
	 * @param i - the value to de-/increase by
	 */
	public void changeCharm(int i) {
		charm += i;
	}

	/**
	 * Changes the current percental ratio of fullness level of the Everbie,
	 * the Everbie starts taking damage if the value goes to 0 or less
	 * @param i - the value to de-/increase by
	 */
	public void changeFullness(int i) {
		if(fullness + i < 1){
			fullness = 0;
			changeHealth(-5);
		}
		else if (fullness + i < 100){
			fullness += i;
		}
		else if(fullness + i > 100){
			fullness = 100;
		}
	}

	/**
	 * Changes the current percental ratio of happiness level of the Everbie
	 * @param i - the value to de-/increase by
	 */
	public void changeHappiness(int i) {
		if(happiness + i < 1){
			happiness = 0;
			Everbie.getEverbie().changeHealth(-1);
		}
		else if (happiness + i < 100){
			happiness += i;
		}
		else if(happiness + i > 100){
			happiness = 100;
		}
	}

	/**
	 * Changes the current percental ratio of toxicity level of the Everbie
	 * @param i - the value to de-/increase by
	 */
	public void changeToxicity(int i) {
		 if (toxicity + i < 1) {
			toxicity = 0;
		}else if (toxicity + i < 100) {
			toxicity += i;
		} else if (toxicity + i > 99) {
			toxicity = 100;
			alive = false;
		}
	}

	/**
	 * Changes the level of cuteness the Everbie currently has
	 * @param i - the value to de-/increase by
	 */
	public void changeCuteness(int i) {
		cuteness += i;
	}

	/**
	 * Changes the amount of money the Everbie currently possesses
	 * @param i - the value to de-/increase by
	 * @return <code>true</code> if money was added or subtracted correctly, <code>false</code> otherwise
	 */
	public boolean changeMoney(int i) {
		if(money + i >= 0){
			money += i;
			return true;
		}
		return false;
	}
	
	/**
	 * Sets the name of the Everbie
	 * @param name - the new name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Sets the amount of time the Everbie should be occupied
	 * @param seconds - the amount of seconds to be occupied
	 */
	public void setOccupiedSeconds(int seconds){
		if(seconds < 0){
			occupiedSeconds = 0;
		}else{
			this.occupiedSeconds = seconds;
		}
	}

	/**
	 * Sets the amount of time the Everbie should be occupied
	 * @param minutes - the amount of minutes to be occupied
	 */
	public void setOccupiedMinutes(int minutes){
		if(minutes > 0 && minutes*60 > 0){
			setOccupiedSeconds(minutes*60);
		}
	}

	/**
	 * Sets the amount of time the Everbie should be occupied
	 * @param hours - the amount of hours to be occupied
	 */
	public void setOccupiedHours(int hours){
		if(hours > 0 && hours*60 > 0){
			setOccupiedMinutes(hours*60);
		}
	}

	/**
	 * Sets the work or training the Everbie should be occupied with
	 * @param occupation an instance of the occupationable that the Everbie should be occupied with
	 * @param occupationStartTime a long representing the startTime of the occupation 
	 */
	public void setOccupation(Occupationable occupation, long occupationStartTime){
		this.occupation = occupation;
		this.occupationStartTime = occupationStartTime;
	}
	
	/**
	 * a Method used for making the threads and save/load work properly
	 */
	public void removeOccupation(){
		occupation = null;
		occupationStartTime = 0;
	}
	
	/**
	 * Sets the Everbies heath
	 * @param health - the amount of health the everbie should have after method being called
	 */
	
	public void setHealth(int health){
		this.health = health;
	}
	
	/**
	 * A method to kill the Everbie.
	 */
	public void kill(){
		alive = false;
	}

	/**
	 * A method to set the Everbie to be fainted.
	 * @param fainted
	 */
	public void faint() {
		this.fainted = true;
		faintedTime = getLevel();
	}


	/**
	 * Puts the Everbie to rest to have it restore his/her health
	 * and reduce his/her toxicity level
	 */
	public void sleep() {
		health = maxHealthModifier;
		toxicity = 0;
	}
	
	/**
	 * Restores the Everbie after the game has restarted.
	 * @param name the name of the everbie
	 * @param values an array containing eleven integers
	 * @param alive a boolean to say whether the everbie is alive or not
	 * @param fainted a boolean to say whether the everbie is fainted or not
	 * @param race the everbie's race
	 * @param occupation a String 
	 */
	public void restoreEverbie(String name, int[] values, boolean alive, boolean fainted, Race race,
			String occupation, long occupationStartTime, long everbieStopTime){
		android.util.Log.d("restoreEverbie()", occupation+" "+occupationStartTime);
		setName(name);
		maxHealthModifier = values[0];
		health = values[1];
		strength = values[2];
		intelligence = values[3];
		stamina = values[4];
		charm = values[5];
		cuteness = values[6];
		fullness = values[7];
		happiness = values[8];
		toxicity = values[9];
		money = values[10];
		this.occupationStartTime = occupationStartTime;
		this.alive = alive;
		this.fainted = fainted;
		this.race = race;
		this.occupation = null;
		for(int i=0;i<5;i++){
			if(occupation.equalsIgnoreCase(Training.TRAININGS[i])){
				switch(i){
				case 0:
					this.occupation = new Chess();
					break;
				case 1:
					this.occupation = new Running();
					break;
				case 2:
					this.occupation = new Squash();
					break;
				case 3:
					this.occupation = new Swimming();
					break;
				case 4:
					this.occupation = new WorkingOut();
					break;
				}
			}else if(occupation.equalsIgnoreCase(Work.WORKS[i])){
				switch(i){
				case 0:
					this.occupation = new Consulting();
					break;
				case 1:
					this.occupation = new DogWalking();
					break;
				case 2:
					this.occupation = new MotelCleaning();
					break;
				case 3:
					this.occupation = new Plumbing();
					break;
				case 4:
					this.occupation = new SellLemonade((int)(charm + cuteness + (intelligence/2)
							*Math.random() + 42));
					break;
				}
			}
		}
		
		changeFullness(((int)(-(android.os.SystemClock.elapsedRealtime()-everbieStopTime)/600000))*STARVATION);
		changeHappiness((int) (-(android.os.SystemClock.elapsedRealtime()-everbieStopTime)/600000));
	}
	
	/**
	 * Returns an boolean to determine if the Everbie is alive or not.
	 * @return <code>true</code> if the Everbie is alive, <code>false</code> otherwise
	 */
	public boolean isAlive(){
		return alive;
	}
	
	/**
	 * Returns a boolean representing if the Everbie is fainted or not.
	 * @return <code>true</code> if the Everbie is awaken, <code>false</code> otherwise
	 */
	public boolean isFainted(){
		return fainted;
	}

	/**
	 * Returns an boolean to determine if the Everbie is occupied or not.
	 * @return <code>true</code> if the Everbie is occupied, <code>false</code> otherwise
	 */
	public boolean isOccupied(){
		return occupation!=null;
	}
	
	/**
	 * This method is only used during testing
	 */
	public void resetOccupied(){
		occupiedSeconds = 0;
	}
	
	/**
	 * Returns an boolean to determine if the Everbie is initiated or not
	 * @return <code>true</code> if the Everbie is initiated, <code>false</code> otherwise
	 */
	public static boolean exists(){
		return everbie != null;
	}
	
	/**
	 * Resets (kills) the current Everbie, to be able to start a new one
	 */
	public synchronized void reset(){
		everbie = null;
	}
	
	/**
	 * A Thread-class that ticks down the happiness and fullness constantly. Also ticks down faintedTime
	 * @author Karl-Agnes
	 */
	private class Ticker extends Thread{
		@Override
		public void run(){
			while(Everbie.getEverbie().isAlive()){
				try{
					Thread.sleep(600000);
				}catch(InterruptedException ie){}
				Everbie.getEverbie().changeHappiness(-Everbie.DEPRESSION);
				Everbie.getEverbie().changeFullness(-Everbie.STARVATION);
				if(fainted){
					faintedTime--;
					if(faintedTime < 1){
						everbie.fainted = false;
					}
				}
			}
		}
	}
}