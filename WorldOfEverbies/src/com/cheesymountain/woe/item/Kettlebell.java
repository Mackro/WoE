package com.cheesymountain.woe.item;

import com.cheesymountain.woe.R;

/**
 * Class representing a kettle bell item that extends Item class. Calls super
 * from constructor and relevant setters in Item. Overrides getName in Item.
 */

public class Kettlebell extends Item {

	public Kettlebell() {
		super(1, 400);
		setStrengthModifier(2);
	}

	@Override
	public String getName() {
		return "Kettle bell";
	}

	@Override
	public int getImageID() {
		return R.drawable.ic_launcher;
	}
}
