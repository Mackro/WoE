package com.cheesymountain.woe;

import com.cheesymountain.woe.combat.FightingStyle;
import com.cheesymountain.woe.enemies.Enemy;

/**
 * 
 * 
 * @author Karl-Agnes
 * @author Emil Åhsberg
 * 
 */

public class Combat {

	private Enemy enemy;
	private FightingStyle fightingStyle;
	private Use use = new Use();
	private int totalHPloss;
	private String combatString = "\n--Combat Starts--\n";

	public Combat(Enemy enemy, FightingStyle fightingstyle) {
		this.enemy = enemy;
		this.fightingStyle = fightingstyle;
	}
	
	public String doFight(){
		doCombat(enemy, fightingStyle);
		return combatString;
	}

	/**
	 * 
	 * combat is done by multiplying a variable such as strength with a random
	 * number [0 , 1) the sum of 3 calculations of this type is then compared to
	 * determine the winner.
	 * 
	 * @param enemy
	 *            - The chosen enemy for the combat.
	 * @param fightingStyle
	 *            - The chosen fightingstyle for the combat.
	 */

	private void doCombat(Enemy enemy, FightingStyle fightingStyle) {
		int health = Everbie.getEverbie().getHealth();
		int turn = (int) (Math.random() + 0.5);
		int everbieDmg = 0, everbieDef = 0, enemyDmg = 0, enemyDef = 0, dmg = 0;

		while (health > 0 && enemy.getHealth() > 0) {
			// Everbie attacking, enemy defending:
			if (turn == 0) {

				everbieDmg = rollDice(Everbie.getEverbie().getStrength() + fightingStyle.getStrengthModifier(),
						1+(Everbie.getEverbie().getIntelligence() + fightingStyle.getIntelligenceModifier())/4);
				enemyDef = rollDice(enemy.getStamina(), enemy.getIntelligence());
				dmg = everbieDmg - enemyDef;

				if (dmg > 0) {
					enemy.changeHealth(dmg);
					combatString += "\n"+Everbie.getEverbie().getName()+" hit "+enemy.getName()+
							" for "+dmg+" damage.";
				}else{
					combatString += "\n"+Everbie.getEverbie().getName()+" missed "+enemy.getName();
				}
				turn = 1;
			}

			// Enemy attacking, Everbie Defending:
			else if (turn == 1) {
				enemyDmg = rollDice(enemy.getStrength(),
						enemy.getIntelligence());
				everbieDef = rollDice(Everbie.getEverbie().getStamina() + fightingStyle.getStaminaModifier(),
						1+(Everbie.getEverbie().getIntelligence() + fightingStyle.getIntelligenceModifier())/4);
				dmg = enemyDmg - everbieDef;
				if (dmg > 0) {
					health -= dmg;
					if (health < 1) {
						Everbie.getEverbie().setHealth(1);
						Everbie.getEverbie().setFainted(true);
						combatString += "\nYour Everbie has fainted.";
					}else{
						combatString += "\n"+enemy.getName()+" hit "+Everbie.getEverbie().getName()+
								" for "+dmg+" damage.";
					}
				}else{
					combatString += "\n"+Everbie.getEverbie().getName()+" blocks "+enemy.getName()
							+"'s attack";
				}
				turn = 0;
			}
		}
		if (health > 0 && enemy.getHealth() < 1){
			totalHPloss = Everbie.getEverbie().getHealth()-health;
			Everbie.getEverbie().setHealth(health);
			Everbie.getEverbie().changeMoney(
					enemy.getBaseMoneyReward()
					* Everbie.getEverbie().getLevel());
			combatString += "\n"+Everbie.getEverbie().getName()+" has successfully defeated the "+
					enemy.getName()+" and took "+totalHPloss+" Damage." +
					"\nThe enemy leaves behind "+enemy.getBaseMoneyReward()*
					Everbie.getEverbie().getLevel()+" Oi";
			if(enemy.getAdditionalItemReward()!=null){
				use.activate(enemy.getAdditionalItemReward());
				combatString += "\nYou also find a "+enemy.getAdditionalItemReward().getName();
			}
		}
		combatString += "\n\n--End of Combat--\n";
	}

	private int rollDice(int sides, int dices) {
		int diceSum = 0;
		for (int i = 0; i < dices; i++) {
			diceSum += (int) ((Math.random() * sides) + 1);
		}
		return diceSum;
	}
}
