package com.cheesymountain.woe.Combat;

import com.cheesymountain.woe.Everbie;
import com.cheesymountain.woe.Enemies.Enemy;

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

	public Combat(Enemy enemy, FightingStyle fightingstyle) { // fightingStyle
																// not yet
																// implemented
		this.enemy = enemy;
		this.fightingStyle = fightingstyle;
		doCombat(enemy, fightingStyle);
	}
	
	
	/**
	 * 
	 * combat is done by multiplying a variable such as  strength with a random number [0 , 1)
	 * the sum of 3 calculations of this type is then compared to determine the winner.
	 * 
	 * @param enemy - The chosen enemy for the combat.
	 * @param fightingStyle - The chosen fightingstyle for the combat.
	 */

	private void doCombat(Enemy enemy, FightingStyle fightingStyle) {
		while (Everbie.getEverbie().getHealth() > 1) {

			int everbieDmgCompNbr = (int) (Everbie.getEverbie().getStrength()
					* Math.random() + Everbie.getEverbie().getStamina()
					* Math.random() + Everbie.getEverbie().getIntelligence()
					* Math.random());
			int enemyDmgCompNbr = (int) (enemy.getStrength() * Math.random()
					+ enemy.getStamina() * Math.random() + enemy
					.getIntelligence() * Math.random());

			if (everbieDmgCompNbr > enemyDmgCompNbr) {
				enemy.changeHealth(everbieDmgCompNbr - enemyDmgCompNbr);
			} else if (everbieDmgCompNbr < enemyDmgCompNbr) {
				Everbie.getEverbie().changeHealth(
						enemyDmgCompNbr - everbieDmgCompNbr);
				if (Everbie.getEverbie().getHealth() < 1) {
					Everbie.getEverbie().setHealth(1);
				}
			}
		}
	}
}
