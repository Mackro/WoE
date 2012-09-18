import junit.framework.TestCase;
import com.cheesymountain.woe.Everbie;
import org.junit.Assert;

public class EverbieTest extends TestCase {

	String name = "Emil";
	Everbie everbie;
	
	@Before
	public void before(){
		everbie = new Everbie(name);
	}
	
	public void testConstructorandGetName(){
		assertTrue(name.equalsIgnoreCase((everbie.GetName()));
		assertTrue(everbie.isAlive()==true);
	}
	//GnC = Getters and Changers
	public void testGnCForHealth(){
		int maxHealth = everbie.getMaxHealth();
		assertTrue(everbie.getHealth()==1);
		everbie.changeHealth(48);
		assertTrue(everbie.getHealth()==49);
		everbie.changeHealth(maxHealth);
		assertTrue(everbie.getHealth()==maxHealth);
		everbie.changeHealth(-78);
		assertTrue(everbie.getHealth()==(maxHealth-78));
		everbie.changeHealth(-maxHealth);
		assertTrue(everbie.getHealth()==0);
		assertTrue(everbie.isAlive()==false);
	}
	public void testGnCForFullness(){
		assertTrue(everbie.getFullness()==50);
		everbie.changeFullness(34);
		assertTrue(everbie.getFullness()==84);
		everbie.changeFullness(-40);
		assertTrue(everbie.getFullness()==44);
		everbie.changeFullness(100);
		assertTrue(everbie.getFullness()==100);
		everbie.changeFullness(-150);
		assertTrue(everbie.getFullness()==0);
	}
	public void testGnCForHappiness(){
		assertTrue(everbie.getHappiness()==50);
		everbie.changeHappiness(34);
		assertTrue(everbie.getHappiness()==84);
		everbie.changeHappiness(-40);
		assertTrue(everbie.getHappiness()==44);
		everbie.changeHappiness(100);
		assertTrue(everbie.getHappiness()==100);
		everbie.changeHappiness(-150);
		assertTrue(everbie.getHappiness()==0);
	}
	public void testGnCForToxicity(){
		assertTrue(everbie.getHappiness()==0);
		everbie.changeHappiness(67);
		assertTrue(everbie.getHappiness()==67);
		everbie.changeHappiness(-40);
		assertTrue(everbie.getHappiness()==27);
		everbie.changeHappiness(-100);
		assertTrue(everbie.getHappiness()==0);
		everbie.changeHappiness(150);
		assertTrue(everbie.getHappiness()==100);
		assertTrue(everbie.isAlive()==false);
	}
	public void testGnCForStrength(){
		assertTrue(everbie.getStrength()==1);
		everbie.changeStrength(4);
		assertTrue(everbie.getStrength()==5);
		everbie.changeStrength(-2);
		assertTrue(everbie.getStrength()==3);
		everbie.changeStrength(-5);
		assertTrue(everbie.getStrength()==0);
		assertTrue(everbie.isAlive()==false);
	}
	public void testGnCForStamina(){
		assertTrue(everbie.getStamina()==1);
		everbie.changeStamina(4);
		assertTrue(everbie.getStamina()==5);
		everbie.changeStamina(-2);
		assertTrue(everbie.getStamina()==3);
		everbie.changeStamina(-5);
		assertTrue(everbie.getStamina()==0);
		assertTrue(everbie.isAlive()==false);
	}
	public void testGnCForIntelligence(){
		assertTrue(everbie.getIntelligence()==1);
		everbie.changeIntelligence(4);
		assertTrue(everbie.getIntelligence()==5);
		everbie.changeIntelligence(-2);
		assertTrue(everbie.getIntelligence()==3);
		everbie.changeIntelligence(-5);
		assertTrue(everbie.getIntelligence()==0);
		assertTrue(everbie.isAlive()==false);
	}
	public void testGnCForCharm(){
		
	}
}
