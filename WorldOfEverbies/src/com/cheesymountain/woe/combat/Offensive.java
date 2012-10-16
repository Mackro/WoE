package com.cheesymountain.woe.combat;

public class Offensive extends FightingStyle {

	private static final int STRENGTHMODIFIER = 2;
	private static final int STAMINAMODIFIER = 0;
	private static final int INTELLIGENCEMODIFIER = 0;
	
	public Offensive(){
		super(STRENGTHMODIFIER, STAMINAMODIFIER, INTELLIGENCEMODIFIER);
	}
	
}
