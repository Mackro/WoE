package com.cheesymountain.woe;


/**
 * A representation of an Everbie.
 * Contains all the different variables and skills that makes up an Everbie,
 * and the mood of the current Everbie. This class is designed in accordance with
 * the singleton-pattern since there will only be one Everbie at any given time.
 * @author Cheesy Mountain
 *
 */
public class Everbie {
	
	private String imageName = "wbe"; 
	public static final String DEFAULT_NAME = "Eibreve";
	public static final String DEFAULT_IMAGE_NAME = "wbe";
	private static Everbie everbie;
	public static final int STARTING_MONEY = 100;
	private String name;
	private int maxHealth, health, strength, intelligence, stamina,
			charm, fullness, happiness, toxicity, cuteness, money;
	private boolean alive;

	private Everbie(String name, String imageName) {
		alive = true;
		this.name = name;
		maxHealth = 1;
		health = 1;
		strength = 1;
		intelligence = 1;
		stamina = 1;
		charm = 1;
		fullness = 50;
		happiness = 50;
		toxicity = 0;
		cuteness = 1;
		money = STARTING_MONEY;
		this.imageName = imageName;
	}
	
	/**
	 * Creates an Everbie unless one already exists.
	 * @param name - the name of the Everbie to be created
	 * @param imageName - the image of the Everbie to be created
	 */
	public synchronized static void createEverbie (String name, String imageName){
		if(!Everbie.exists()){
			everbie = new Everbie(name, imageName);
			
			
		}
	}
	
	/**
	 * Returns the pointer to the Everbie if one exists otherwise
	 * it creates a default one.
	 * @return pointer to the current Everbie
	 */
	public synchronized static Everbie getEverbie(){
		if (!Everbie.exists()){
			everbie = new Everbie(DEFAULT_NAME, DEFAULT_IMAGE_NAME);
		}
		return everbie;
	}
	
	/**
	 * Returns the name of the image of the current Everbie
	 * @return the image's name
	 */
	public String getImageName(){
		return imageName;
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
		return maxHealth;
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
		return (strength + intelligence + stamina + Math.abs(charm) + Math.abs(cuteness))/5;
	}

	/**
	 * Changes the maximum amount of health points the current Everbie can have 
	 * @param i - the value to de-/increase by
	 */
	public void changeMaxhealth(int i) {
		if (maxHealth + i < 1 ){
			maxHealth = 0;
			health = 0;
			alive = false;
		}
		if (maxHealth + i < health) {
			health = maxHealth + i;
		}
		maxHealth += i;
	}

	/**
	 * Changes the amount of health points the current Everbie currently has,
	 * the Everbie dies if the total value goes to 0 or less
	 * @param i - the value to de-/increase by
	 */
	public void changeHealth(int i) {
		if (health + i < maxHealth) {
			health += i;
		} else if (health + i > maxHealth) {
			health = maxHealth;
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
		if (toxicity + i < 100) {
			toxicity += i;
		} else if (toxicity + i > 99) {
			toxicity = 100;
			alive = false;
		} else if (toxicity + i < 1) {
			toxicity = 0;
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
	 */
	public void changeMoney(int i) {
		if(i > 0){
			money += i;
		}
		if (i < 0){
			if(money + i > 0){
				money += i;
			}
		}
	}
	
	/**
	 * Sets the name of the Everbie
	 * @param name - the new name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Puts the Everbie to rest to have it restore his/her health
	 * and reduce his/her toxicity level
	 */
	public void sleep() {
		health = maxHealth;
		toxicity = 0;
	}
	
	/**
	 * Restores the Everbie after the game has been closed and restarted
	 * @param name - the name of the Everbie
	 * @param values - an array with all stats
	 * @param alive - a boolean to determine if the Everbie is alive
	 * @param imageName - the image's name
	 */
	public void restoreEverbie(String name, int[] values, boolean alive, String imageName){
		setName(name);
		maxHealth = values[0];
		health = values[1];
		strength = values[2];
		intelligence = values[3];
		stamina = values[4];
		charm = values[5];
		fullness = values[6];
		happiness = values[7];
		toxicity = values[8];
		cuteness = values[9];
		money = values[10];
		this.alive = alive;
		this.imageName = imageName;
	}
	
	/**
	 * Returns an boolean to determine if the Everbie is alive or not
	 * @return <code>true</code> if the Everbie is alive, <code>false</code> otherwise
	 */
	public boolean  isAlive(){
		return alive;
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
	
}
