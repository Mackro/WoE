package com.cheesymountain.woe;

import com.cheesymountain.woe.food.*;
import com.cheesymountain.woe.interact.*;
import com.cheesymountain.woe.item.*;
import com.cheesymountain.woe.training.*;
import com.cheesymountain.woe.work.*;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

@SuppressLint("NewApi")
/**
 * Main Activity that keeps most of the controlling
 * functionality such as saving and loading game and
 * handles events from OptionsMenu. Moreover it controls
 * the exitGame functionality and what buttons can activate it.
 * 
 * @author CheesyMountain
 * 
 */
public class MainActivity extends Activity {

	private Everbie everbie;
	private Use use;

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
        setContentView(R.layout.activity_main);
        //((ImageButton)findViewById(R.id.mainImage)).setImageResource(getResources().getIdentifier(everbie.getImageName(), "drawable", getPackageName()));
        updateLog();
        use = new Use();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    
    @Override
    public void onBackPressed(){
    	
    }
    
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
    	super.onSaveInstanceState(savedInstanceState);
    	savedInstanceState.putString("Name", everbie.getName());
    	savedInstanceState.putInt("maxHealth", everbie.getMaxHealth());
    	savedInstanceState.putInt("health", everbie.getHealth());
    	savedInstanceState.putInt("Strength", everbie.getStrength());
    	savedInstanceState.putInt("Intelligence", everbie.getIntelligence());
    	savedInstanceState.putInt("stamina", everbie.getStamina());
    	savedInstanceState.putInt("charm", everbie.getCharm());
    	savedInstanceState.putInt("fullness", everbie.getFullness());
    	savedInstanceState.putInt("happiness", everbie.getHappiness());
    	savedInstanceState.putInt("toxicity", everbie.getToxicity());
    	savedInstanceState.putInt("cuteness", everbie.getCuteness());
    	savedInstanceState.putInt("money", everbie.getMoney());
    	savedInstanceState.putBoolean("Alive", everbie.isAlive());
    	savedInstanceState.putString("imagePath", everbie.getImageName());
    }
    
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
    	super.onRestoreInstanceState(savedInstanceState);
    	int[] values = {savedInstanceState.getInt("maxHealth"),
    	savedInstanceState.getInt("health"),
    	savedInstanceState.getInt("Strength"),
    	savedInstanceState.getInt("intelligence"),
    	savedInstanceState.getInt("stamina"),
    	savedInstanceState.getInt("charm"),
    	savedInstanceState.getInt("fullness"),
    	savedInstanceState.getInt("happiness"),
    	savedInstanceState.getInt("toxicity"),
    	savedInstanceState.getInt("cuteness"),
    	savedInstanceState.getInt("money")};
    	everbie.restoreEverbie(savedInstanceState.getString("Name"), values,
    			savedInstanceState.getBoolean("alive"), savedInstanceState.getString("imagePath"));	
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
			case R.id.BreadAndWater:
				use.activate(new BreadAndWater());
				return true;
			case R.id.Melon:
				use.activate(new Melon());
				return true;
			case R.id.ribEyeStake:
				use.activate(new RibEyeSteak());
				return true;
			case R.id.chat:
				use.activate(new Chat());
				return true;
			case R.id.comb:
				use.activate(new Comb());
				return true;
			case R.id.snuggle:
				use.activate(new Snuggle());
				return true;
			case R.id.book:
				use.activate(new Book());
				return true;
			case R.id.healthPotion:
				use.activate(new HealthPotion());
				return true;
			case R.id.kettleBell:
				use.activate(new Kettlebell());
				return true;
			case R.id.ribbon:
				use.activate(new Ribbon());
				return true;
			case R.id.skippingRope:
				use.activate(new SkippingRope());
				return true;
			case R.id.chess:
				use.activate(new Chess());
				return true;
			case R.id.running:
				use.activate(new Running());
				return true;
			case R.id.workingOut:
				use.activate(new WorkingOut());
				return true;
	    	case R.id.consulting:
	    		use.activate(new Consulting());
	    		return true;
			case R.id.dogWalking:
	    		use.activate(new DogWalking());
	    		return true;
			case R.id.motelCleaning:
				use.activate(new MotelCleaning());
				return true;
			case R.id.plumbing:
				use.activate(new Plumbing());
				return true;
	    	case R.id.sellLemonade:
	    		use.activate(new SellLemonade());
	    		return true;
		}
		return false;
    }
    
    @Override
    public void onOptionsMenuClosed(Menu menu) {
    	super.onOptionsMenuClosed(menu);
    	updateLog();
    }
    
    //TODO Write More javadoc here
    /**
     * 
     * @param view
     */
    public void change(View view){
    	everbie = Everbie.getEverbie();
    	this.setContentView(R.layout.activity_stats);
    	
    	//((ImageButton)findViewById(R.id.statsImage)).setImageResource(getResources().getIdentifier(everbie.getImageName(), "drawable", getPackageName()));
    	
    	((TextView)findViewById(R.id.nameText)).setText(everbie.getName() + "");
    	((TextView)findViewById(R.id.charmText)).setText(everbie.getCharm() + "");
    	((TextView)findViewById(R.id.cuteText)).setText(everbie.getCuteness() + "");
    	((TextView)findViewById(R.id.levelText)).setText(everbie.getLevel() + "");
    	((TextView)findViewById(R.id.strengthText)).setText(everbie.getStrength() + "");
    	((TextView)findViewById(R.id.staminaText)).setText(everbie.getStamina() + "");
    	((TextView)findViewById(R.id.intelligenceText)).setText(everbie.getIntelligence() + "");
    	
    	((ProgressBar)findViewById(R.id.fullnessBar)).setProgress(everbie.getFullness());
    	((ProgressBar)findViewById(R.id.happinessBar)).setProgress(everbie.getHappiness());
    	((ProgressBar)findViewById(R.id.toxicityBar)).setProgress(everbie.getToxicity());
    	((ProgressBar)findViewById(R.id.healthBar)).setMax(everbie.getMaxHealth());
    	((ProgressBar)findViewById(R.id.healthBar)).setProgress(everbie.getHealth());
    	
   
    	
    }
    
    //TODO write Javadoc here
    /**
     * 
     * @param view
     */
    public void back(View view){
    	this.setContentView(R.layout.activity_main);
    	updateLog();
    }
    
    /**
     * Rewrites the TextArea with the current version
     * of the Log.
     */
    public void updateLog(){
    	((EditText)findViewById(R.id.log)).setText(Log.getLog().getLogList());
    }    
}
