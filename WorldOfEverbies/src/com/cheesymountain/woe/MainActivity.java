package com.cheesymountain.woe;
/*=============================================================
 * Copyright 2012, Cheesy Mountain Production
 * 
 * This file is part of World of Everbies.
 * 
 * World of Everbies is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * World of Everbies is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with World of Everbies.  If not, see <http://www.gnu.org/licenses/>.
================================================================*/
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.cheesymountain.woe.food.BreadAndWater;
import com.cheesymountain.woe.food.Melon;
import com.cheesymountain.woe.food.RibEyeSteak;
import com.cheesymountain.woe.interact.Chat;
import com.cheesymountain.woe.interact.Comb;
import com.cheesymountain.woe.interact.Snuggle;
import com.cheesymountain.woe.item.Book;
import com.cheesymountain.woe.item.HealthPotion;
import com.cheesymountain.woe.item.Kettlebell;
import com.cheesymountain.woe.item.Ribbon;
import com.cheesymountain.woe.item.SkippingRope;
import com.cheesymountain.woe.training.Chess;
import com.cheesymountain.woe.training.Running;
import com.cheesymountain.woe.training.WorkingOut;
import com.cheesymountain.woe.work.Consulting;
import com.cheesymountain.woe.work.DogWalking;
import com.cheesymountain.woe.work.MotelCleaning;
import com.cheesymountain.woe.work.Plumbing;
import com.cheesymountain.woe.work.SellLemonade;

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
        ((ImageButton)findViewById(R.id.mainImage)).setImageResource(everbie.getImageId());
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
    public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
			case R.id.BreadAndWater:
				use.activate(new BreadAndWater());
	    		break;
			case R.id.Melon:
				use.activate(new Melon());
	    		break;
			case R.id.ribEyeStake:
				use.activate(new RibEyeSteak());
	    		break;
			case R.id.chat:
				use.activate(new Chat());
	    		break;
			case R.id.comb:
				use.activate(new Comb());
	    		break;
			case R.id.snuggle:
				use.activate(new Snuggle());
	    		break;
			case R.id.book:
				use.activate(new Book());
	    		break;
			case R.id.healthPotion:
				use.activate(new HealthPotion());
	    		break;
			case R.id.kettleBell:
				use.activate(new Kettlebell());
	    		break;
			case R.id.ribbon:
				use.activate(new Ribbon());
	    		break;
			case R.id.skippingRope:
				use.activate(new SkippingRope());
	    		break;
			case R.id.chess:
				use.activate(new Chess());
	    		break;
			case R.id.running:
				use.activate(new Running());
	    		break;
			case R.id.workingOut:
				use.activate(new WorkingOut());
	    		break;
	    	case R.id.consulting:
	    		use.activate(new Consulting());
	    		break;
			case R.id.dogWalking:
	    		use.activate(new DogWalking());
	    		break;
			case R.id.motelCleaning:
				use.activate(new MotelCleaning());
	    		break;
			case R.id.plumbing:
				use.activate(new Plumbing());
	    		break;
	    	case R.id.sellLemonade:
	    		use.activate(new SellLemonade());
	    		break;
	    	default:
	    		return false;
		}
		this.setContentView(R.layout.activity_main);
		updateLog();
		return true;
    }
    
    @Override
    public void onOptionsMenuClosed(Menu menu) {
    	super.onOptionsMenuClosed(menu);
    /*	View view = this.getCurrentFocus();
    	this.setContentView(view);*/
    }
    
    //TODO Write More javadoc here
    /**
     * 
     * @param view
     */
    public void change(View view){
    	everbie = Everbie.getEverbie();
    	this.setContentView(R.layout.activity_stats);
    	
    	 ((ImageButton)findViewById(R.id.mainImage)).setImageResource(everbie.getImageId());
    	
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
    
    /**
     * A method called whenever the "back" button is pressed/tapped on the phone.
     * 
     * @param view the view that is currently active when the button is pressed.
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
    	((TextView)findViewById(R.id.log)).setText(Log.getLog().getLogList());
    }    
}
