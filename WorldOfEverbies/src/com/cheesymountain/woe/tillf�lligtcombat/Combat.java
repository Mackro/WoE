package com.cheesymountain.woe.tillfälligtcombat;

import com.cheesymountain.woe.Everbie;
import com.cheesymountain.woe.Use;
import com.cheesymountain.woe.tillfälligtenemies.Enemy;

/**
 * 
 * 
 * 
 * @author Emil Åhsberg
 * 
 */

public class Combat {

	private Enemy enemy;
	private FightingStyle fightingStyle;
	private Use use = new Use();

	public Combat(Enemy enemy, FightingStyle fightingstyle) { // fightingStyle
																// not yet
																// implemented
		this.enemy = enemy;
		this.fightingStyle = fightingstyle;
		doCombat(enemy, fightingStyle);
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
		int turn = (int)(Math.random() + 0.5);
		int everbieDmg = 0, everbieDef = 0, enemyDmg = 0, enemyDef = 0, dmg = 0;

		while (health > 0 && enemy.getHealth() > 0) {
			// Everbie attacking enemy defending
			if (turn == 0) {

				everbieDmg = rollDice(Everbie.getEverbie().getStrength(),
						Everbie.getEverbie().getIntelligence());
				enemyDef = rollDice(enemy.getStamina(), enemy.getIntelligence());
				dmg = everbieDmg - enemyDef;
				
				if (dmg > 0) {
					enemy.changeHealth(dmg);
				}
				turn = 1;
			}

			// Enemy attacking Everbie Defending
			else if (turn == 1) {

				enemyDmg = rollDice(enemy.getStrength(),
						enemy.getIntelligence());
				everbieDef = rollDice(Everbie.getEverbie().getStamina(),
						Everbie.getEverbie().getIntelligence());
				dmg = enemyDmg - everbieDef;
				
				if (dmg > 0) {
					health -= dmg;
					if(health < 1){
						Everbie.getEverbie().setHealth(1);
					}
					}
				}
				turn = 0;
			}
		if(health > 0 && enemy.getHealth() < 0 && enemy.getAdditionalItemReward() != null){
			use.activate(enemy.getAdditionalItemReward());
			Everbie.getEverbie().changeMoney(enemy.getBaseMoneyReward() * Everbie.getEverbie().getLevel());
		}
	}
	
	private int rollDice(int sides, int dices) {
		int diceSum = 0;
		for (int i = 0; i < dices; i++) {
			diceSum += (int) ((Math.random() * sides) + 0.5);
		}
		return diceSum;
	}
}
