import android.util.Log;

import com.cheesymountain.woe.Combat;
import com.cheesymountain.woe.Everbie;
import com.cheesymountain.woe.combat.Offensive;
import com.cheesymountain.woe.enemies.GardenGnome;

public class CombatTest {

	private Everbie everbie;
	private Combat combat;

	public CombatTest() {

		Log.i("Start", "Combat test started");

		everbie = Everbie.getEverbie();
		combat = new Combat(new GardenGnome(), new Offensive());
		testRolldice();
		testEverbieAttack();

	}

	private void testEverbieAttack() {
		Log.i("Start", "EverbieAttack test started");
		combat.everbieAttack();
	}

	private void testRolldice() {
		Log.i("Start", "Rolldice test started");
		int diceRolled = combat.rollDice(6, 1);
		if(diceRolled > 6 || diceRolled < 1){
			Log.e("Error", "Dice roll is to high/low");
		}
		Log.i("Complete", "Test rollDice complete");
	}
}
