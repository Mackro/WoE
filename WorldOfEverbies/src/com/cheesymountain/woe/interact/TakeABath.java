package com.cheesymountain.woe.interact;

public class TakeABath extends Interaction {

	public TakeABath(){
		super(2);
		super.setCutenessMod(-1);
	}

	@Override
	public String getName() {
		return "Take a bath";
	}
}
