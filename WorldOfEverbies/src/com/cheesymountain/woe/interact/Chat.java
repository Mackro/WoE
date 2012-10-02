package com.cheesymountain.woe.interact;

public class Chat extends Interaction {

	public Chat(){
		super(-2);
		super.setCharmMod(1);
	}

	@Override
	public String getName() {
		return "Chat";
	}
}
