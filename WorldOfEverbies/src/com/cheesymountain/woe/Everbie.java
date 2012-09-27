package com.cheesymountain.woe;


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
	
	
	public synchronized static void CreateEverbie (String name, int[] values, boolean alive, String imageName){
		if(everbie == null){
			everbie = new Everbie(name, imageName);
			
			
		}
	}
	
	public synchronized static Everbie getEverbie(){
		if (everbie == null){
			everbie = new Everbie(DEFAULT_NAME, DEFAULT_IMAGE_NAME);
		}
		return everbie;
	}
	
	public String getImageName(){
		return imageName;
	}

	public String getName() {
		return name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getHealth() {
		return health;
	}

	public int getStrength() {
		return strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getStamina() {
		return stamina;
	}

	public int getCharm() {
		return charm;
	}

	public int getFullness() {
		return fullness;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getToxicity() {
		return toxicity;
	}

	public int getCuteness() {
		return cuteness;
	}

	public int getMoney() {
		return money;
	}
	
	public int getLevel(){
		return (strength + intelligence + stamina + Math.abs(charm) + Math.abs(cuteness))/5;
	}

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

	public void changeStrength(int i) {
		if (strength + i < 1){
			strength = 0;
			alive = false;
		}
		strength += i;
	}

	public void changeIntelligence(int i) {
		if (intelligence + i < 1){
			intelligence = 0;
			alive = false;
		}
		intelligence += i;
	}

	public void changeStamina(int i) {
		if (stamina + i < 1) {
			stamina = 0;
		}
		stamina += i;
	}

	public void changeCharm(int i) {
		charm += i;
	}

	public void changeFullness(int i) {
		if (fullness + i < 100){
			fullness += i;
		}
		else if(fullness + i > 100){
			fullness = 100;
		}
		else if(fullness + i < 1){
			fullness = 0;
		}
	}

	public void changeHappiness(int i) {
		if (happiness + i < 100){
			happiness += i;
		}
		else if(happiness + i > 100){
			happiness = 100;
		}
		else if(happiness + i < 1){
			happiness = 0;
		}
	}

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

	public void changeCuteness(int i) {
		cuteness += i;
	}

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
	
	public void setName(String name){
		this.name = name;
	}

	public void sleep() {
		health = maxHealth;
		toxicity = 0;
	}
	
	public void RestoreEverbie(String name, int[] values, boolean alive, String imageName){
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

	public void eat(Food food) {
		money -= food.getCost();
		fullness += food.getFullnessModifier();
		happiness += food.getHappinessModifier();
	}
	
	public boolean  isAlive(){
		return alive;
	}
	
	public static boolean exists(){
		return everbie != null;
	}
	
	public synchronized void reset(){
		everbie = null;
	}
	
}
