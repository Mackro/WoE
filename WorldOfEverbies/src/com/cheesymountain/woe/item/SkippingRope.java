package com.cheesymountain.woe.item;

import com.cheesymountain.woe.R;

/**
 * Class representing a Ribbon item that extends Item class. Calls super from
 * constructor and relevant setters in Item. Overrides getName in Item.
 */

public class SkippingRope extends Item {

	public SkippingRope() {
		super(1, 250);
		setStaminaModifier(2);
	}

	@Override
	public String getName() {
		return "Skipping rope";
	}

	@Override
	public int getImageID() {
		return R.drawable.ic_launcher;
	}

}
