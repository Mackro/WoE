package com.cheesymountain.woe.tillf�lligtcombat;

public class Tactical extends FightingStyle {

	private static final double STRENGTHMODIFIER = 1;
	private static final double STAMINAMODIFIER = 1.1;
	private static final double INTELLIGENCEMODIFIER = 1.2;
	
	public Tactical(){
		super(STRENGTHMODIFIER, STAMINAMODIFIER, INTELLIGENCEMODIFIER);
	}
	
}
