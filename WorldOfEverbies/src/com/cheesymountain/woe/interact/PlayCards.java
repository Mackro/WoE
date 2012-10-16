package com.cheesymountain.woe.interact;

public class PlayCards extends Interaction {
	
	public PlayCards(){
		super(2);
		super.setCharmMod(-1);
	}

	@Override
	public String getName() {
		return "play cards";
	}
	
}
