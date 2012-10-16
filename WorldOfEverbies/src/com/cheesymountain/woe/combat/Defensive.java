package com.cheesymountain.woe.combat;

public class Defensive extends FightingStyle {

	private static final double STRENGTHMODIFIER = 1.1;
	private static final double STAMINAMODIFIER = 1.1;
	private static final double INTELLIGENCEMODIFIER = 1.1;
	
	public Defensive(){
		super(STRENGTHMODIFIER, STAMINAMODIFIER, INTELLIGENCEMODIFIER);
	}
	
}

