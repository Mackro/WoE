import junit.framework.TestCase;

public class FoodTest extends TestCase {

	Food food;
	private int fullnessModifier = 0;

	public void testGetCost() {

		food = new Food();

		food.setCost(56);
		assertTrue(food.getCost() == 56);
		assertTrue(!(food.getCost() < 56));
		assertTrue(!(food.getCost() > 56));

	}
	
	public void testGetFullnessModifier(){
		food = new Food();
		assertTrue(food.fullnessModifier == fullnessModifier);
	}
}
