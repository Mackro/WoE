package com.cheesymountain.woe.item;

import com.cheesymountain.woe.R;

/**
 * Class representing a Ribbon item that extends Item class. Calls super from
 * constructor and relevant setters in Item. Overrides getName in Item.
 */

public class Ribbon extends Item {

	public Ribbon() {
		super(1, 250);
		setCharmModifier(1);
		setCutenessModifier(1);
	}

	@Override
	public String getName() {
		return "Ribbon";
	}

	@Override
	public int getImageID() {
		return R.drawable.ic_launcher;
	}

}
