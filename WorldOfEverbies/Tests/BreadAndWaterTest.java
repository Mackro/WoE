import junit.framework.TestCase;

public class BreadAndWaterTest extends TestCase {

	IFood food;
	//fullnessModifier = 0 (temp value while class not created)
	//cost = 56 (temp value while class not created)
	public void testGetCost() {

		food = new BreadAndWater();

		assertTrue(food.getCost() != null && food.getCost == 56);

	}
	
	public void testGetFullnessModifier(){
		food = new BreadAndWater();
		assertTrue(food.fullnessModifier != null && food.fullnessModifier ==  0);
	}
}
