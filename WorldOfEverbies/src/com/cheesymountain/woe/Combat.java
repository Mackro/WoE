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

import com.cheesymountain.woe.combat.FightingStyle;
import com.cheesymountain.woe.enemies.Enemy;

/**
 * 
 * The Combat class handles the logic for combat.
 * Created by MainActivity.
 * The constructor takes in an enemy object and a fightingStyle object.
 * 
 * @author Karl-Agnes
 * @author Emil �hsberg
 * 
 */

public class Combat {

	private Enemy enemy;
	private FightingStyle fightingStyle;
	private Use use = new Use();
	private boolean myTurn;
	private int totalHPloss;
	private String combatString = "\n\n--Combat Starts--\n";
	private int health;

	public Combat(Enemy enemy, FightingStyle fightingstyle) {
		this.enemy = enemy;
		this.fightingStyle = fightingstyle;
	}

	public void doFight() {
		doCombat(enemy, fightingStyle);
	}

	/**
	 * 
	 * combat is done by calling the everbie attack and the enemyAttack methods alternating, 
	 * while in a loop until the everbie or the enemy is dead. 
	 * 
	 * @param enemy
	 *            - The chosen enemy for the combat.
	 * @param fightingStyle
	 *            - The chosen fightingstyle for the combat.
	 */

	private void doCombat(Enemy enemy, FightingStyle fightingStyle) {
		health = Everbie.getEverbie().getHealth();
		myTurn = Math.random()<0.5;

		while (health > 0 && enemy.getHealth() > 0) {
			// Everbie attacking, enemy defending:
			if (myTurn) {
				everbieAttack();
			}
			// Enemy attacking, Everbie Defending:
			else{
				enemyAttack();
			}
			myTurn = !myTurn;
		}
		CombatEnded();
	}
	
	/**
	 * Method used to determine an Everbies or an enemys offensive and defensive capabilities.
	 * 
	 * @param sides - sides is the number of sides the rolled dice has. decided by the strength or the stamina value
	 * @param dices - dices is the number of dices that are rolled. decided by the intelligence value.
	 * @return - returns the sum of all dices rolled.
	 */

	private int rollDice(int sides, int dice) {
		int diceSum = 0;
		for (int i = 0; i < dice; i++) {
			diceSum += (int) ((Math.random() * sides) + 1);
		}
		return diceSum;
	}
	
	/**
	 * Calculates an everbies attack damage and the enemys defense. 
	 * Then subtracts the enemys defense from the attack damage and subtracts that much health from the enemy.
	 * And generates a string describing the battle.
	 */

	private void everbieAttack() {
		int everbieDmg = rollDice(
				(Math.random() > 0.04 ? Everbie.getEverbie().getStrength()
						+ Everbie.getEverbie().getStamina()
						+ fightingStyle.getStrengthModifier()
						+ fightingStyle.getStaminaModifier() : Everbie
						.getEverbie().getStrength()
						+ fightingStyle.getStrengthModifier()),
				1 + (Everbie.getEverbie().getIntelligence() + fightingStyle
						.getIntelligenceModifier()) / 4);
		int enemyDef = rollDice(enemy.getStamina(), enemy.getIntelligence());
		int dmg = everbieDmg - enemyDef;

		if (dmg > 0) {
			enemy.changeHealth(dmg);
			combatString += "\n" + Everbie.getEverbie().getName() + " hit "
					+ enemy.getName() + " for " + dmg + " damage.";
		} else {
			combatString += "\n" + Everbie.getEverbie().getName() + " missed "
					+ enemy.getName();
		}
	}
	
	/**
	 * Calculates an enemys attack damage and the everbies defense. 
	 * Then subtracts the everbies defense from the attack damage and subtracts that much health from the everbie.
	 * And generates a string describing the battle.
	 */

	private void enemyAttack() {
		int enemyDmg = rollDice((Math.random() > 0.04 ? enemy.getStrength()
				+ enemy.getStamina() : enemy.getStrength()),
				enemy.getIntelligence());
		int everbieDef = rollDice(Everbie.getEverbie().getStamina()
				+ fightingStyle.getStaminaModifier(),
				1 + (Everbie.getEverbie().getIntelligence() + fightingStyle
						.getIntelligenceModifier()) / 4);
		int dmg = enemyDmg - everbieDef;
		if (dmg > 0) {
			health -= dmg;
			if (health < 1) {
				Everbie.getEverbie().setHealth(1);
				Everbie.getEverbie().faint();
				combatString += "\n"+"Your Everbie has fainted.";
			} else {
				combatString += "\n" + enemy.getName() + " hit "
						+ Everbie.getEverbie().getName() + " for " + dmg
						+ " damage.";
			}
		} else {
			combatString += "\n" + Everbie.getEverbie().getName() + " blocks "
					+ enemy.getName() + "'s attack";
		}
	}
	
	/**
	 * calculates the reward for defeating the enemy, changing the Everbies health variable (not just the local copy)
	 * Generates a string listing the rewards and health lost from combat. 
	 */

	private void CombatEnded() {
		if (health > 0 && enemy.getHealth() < 1) {
			totalHPloss = Everbie.getEverbie().getHealth() - health;
			Everbie.getEverbie().setHealth(health);
			Everbie.getEverbie().changeMoney(
					enemy.getBaseMoneyReward()
							* Everbie.getEverbie().getLevel());
			combatString += "\n" + Everbie.getEverbie().getName()
					+ " has successfully defeated the " + enemy.getName()
					+ " and took " + totalHPloss + " Damage."
					+ "\nThe enemy leaves behind " + enemy.getBaseMoneyReward()
					* Everbie.getEverbie().getLevel() + " Oi";
			if (enemy.getAdditionalItemReward() != null) {
				combatString += "\n"+"You also find a "
						+ enemy.getAdditionalItemReward().getName();
				combatString += "\n\n--End of Combat--\n";
				Log.getLog().combatLog(combatString);
				Everbie.getEverbie().changeMoney(enemy.getAdditionalItemReward().getCost());
				use.activate(enemy.getAdditionalItemReward());
			}else{
				combatString += "\n\n--End of Combat--";
				Log.getLog().combatLog(combatString);
			}
		}else{
			combatString += "\n\n--End of Combat--";
			Log.getLog().combatLog(combatString);
		}
	}
}
