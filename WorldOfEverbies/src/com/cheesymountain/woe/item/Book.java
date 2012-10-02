package com.cheesymountain.woe.item;

import com.cheesymountain.woe.R;

/**
 * Class representing a Book item that extends Item class. Calls super from
 * constructor and relevant setters in Item. Overrides getName in Item.
 */

public class Book extends Item {

	public Book() {
		super(1, 250);
		setIntelligenceModifier(2);
		setCharmModifier(1);
	}

	@Override
	public String getName() {
		return "Book";
	}

	@Override
	public int getImageID() {
		return R.drawable.ic_launcher;
	}

}
