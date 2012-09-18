package com.cheesymountain.woe;
import com.cheesymountain.woe.Food;

import junit.framework.TestCase;

public class BreadAndWaterTest extends TestCase {

	Food food = new BreadAndWater();

	@Test
	public void testGetCost() {
		assertTrue(food.getCost() != null && food.getCost == 0);
	}
	
	@Test
	public void testGetFullnessModifier(){
		assertTrue(food.fullnessModifier != null && food.fullnessModifier ==  20);
	}
	
	@Test
	public void testGetHappinessModifier(){
		assertTrue(food.getHappinessModifier() != null && food.getHappinessModifier() == -10);
	}
	
	@Test
	public void testGetToxicityModifier(){
		assertTrue(food.getToxicityModifier() != null && food.getToxicityModifier() == 0);
	}
	
	@Test
	public void testGetName(){
		assertTrue(food.getName() != null && food.getName().equalsIgnoreCase("bread and water"));
	}
		
	
}
