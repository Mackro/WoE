package com.cheesymountain.woe.Races;

/**
 * A representation of an Race.
 * Contains all the different variables and skills that makes up an race,
 *  * @author Emil Åhsberg
 *
 */

public abstract class Race {

	private String name;
	private String description;
	private int imageId;
	private int maxHealthModifier, health, strength, intelligence, stamina,
			charm, cuteness;
	public static Race[] RACELIST  = {
		new Mogno(), new Rokash(), new Skrom(), new Tragani()
	};

	public Race(String name, String description, int imageID, int maxHealthModifier, int health,
			int strength, int intelligence, int stamina, int charm,
			int cuteness) {
		this.name = name;
		this.description  = description;
		this.imageId = imageID;
		this.maxHealthModifier = maxHealthModifier;
		this.health = health;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stamina = stamina;
		this.charm = charm;
		this.cuteness = cuteness;
		}

	public int getImageId() {
		return imageId;
	}

	/**
	 * Returns the name of the current Race
	 * 
	 * @return the Races name
	 */
	public String getName() {
		return name;
	}
	
	public String getDescription(){
		return description;
		
	}

	/**
	 * Returns the maximum health points the current Race can have
	 * 
	 * @return the maximum health points
	 */
	public int getMaxHealth() {
		return (int) (maxHealthModifier + (stamina / 2 + strength / 4)
				* Math.PI);
	}

	/**
	 * Returns the current health points of the current Race
	 * 
	 * @return the current health points
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Returns the current level of strength of the current Race
	 * 
	 * @return the current level of strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Returns the current level of intelligence of the current Race
	 * 
	 * @return the current level of intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * Returns the current level of stamina of the current Race
	 * 
	 * @return the current level of stamina
	 */
	public int getStamina() {
		return stamina;
	}

	/**
	 * Returns the current level of charm of the current Race
	 * 
	 * @return the current level of charm
	 */
	public int getCharm() {
		return charm;
	}

	/**
	 * Returns the current level of cuteness of the current Race
	 * 
	 * @return the current level of cuteness
	 */
	public int getCuteness() {
		return cuteness;
	}

}
