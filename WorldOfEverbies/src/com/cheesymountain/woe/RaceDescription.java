package com.cheesymountain.woe;

/**
 * A static class containing information about the different races in WoE
 * @author Markus Otterberg
 *
 */
public class RaceDescription {

	/**
	 * The id of the different Everbie images
	 */
	public static int[] IMAGE_ID = {
		R.drawable.wbe,
		R.drawable.ic_launcher,
		R.drawable.ic_action_search,
	};
	//Will be removed if there is time to implement a more intuitive way to show that
	//the user can swipe across the screen
	public static String SWIPE_DESCRIPTION = "\n\n<swipe left/right to switch race>";
	/**
	 * The descriptions to the different Everbie images
	 */
	public static String[] IMAGE_DESCRIPTION = {
		"Mogno:\nThe Mogno race are known for their sharp claws and short temper.",
		"Rokash:\nThe Rokash race are known for beeing much cuter than the other races but also more hostile.",
		"Skrom:\nThe Skrom race are known for their sharp intelect and oversized belly.",
	};
	
}