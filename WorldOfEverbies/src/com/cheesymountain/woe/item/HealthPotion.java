package com.cheesymountain.woe.item;

import com.cheesymountain.woe.R;

/**
 * Class representing a Health potion item that extends Item class. Calls super
 * from constructor and relevant setters in Item. Overrides getName in Item.
 */

public class HealthPotion extends Item {

	public HealthPotion() {
		super(1, 150);
		setHealthModifer(20);
		setToxicityModifier(10);
	}

	@Override
	public String getName() {
		return "Health potion";
	}

	@Override
	public int getImageID() {
		return R.drawable.ic_launcher;
	}
}
