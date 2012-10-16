package com.cheesymountain.woe.combat;

public class Offensive extends FightingStyle {

	private static final double STRENGTHMODIFIER = 1.3;
	private static final double STAMINAMODIFIER = 1;
	private static final double INTELLIGENCEMODIFIER = 1;
	
	public Offensive(){
		super(STRENGTHMODIFIER, STAMINAMODIFIER, INTELLIGENCEMODIFIER);
	}
	
}
