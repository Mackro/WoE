package com.cheesymountain.woe;




import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Everbie everbie;
	private Use use;
	//private ActionMode.Callback actionMode;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        updateLog();
        //menu_feed
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    		case R.id.menu_feed:
    			startActionMode(null);
    			return true;
    	}
		return false;
    }
    
    public boolean onCreateActionMode(ActionMode mode, Menu menu){
    	MenuInflater menuInflater = mode.getMenuInflater();
    	menuInflater.inflate(R.menu.feed_menu, menu);
    	return true;
    }
    
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem item){
    	use = new Use();
    	switch(item.getItemId()){
    	case R.id.feedPet:
    		use.activate(new BreadAndWater());
    		return true;
    	}
    	return false;
    }
    
    public void change(View view){
    	//Will be removed when we make the real way to create an everbie
    	Everbie.createEverbie("Kalle");
    	//end of removal
    	everbie = Everbie.getEverbie();
    	this.setContentView(R.layout.activity_stats);
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
    
    public void back(View view){
    	this.setContentView(R.layout.activity_main);
    }
    
    public void updateLog(){
    	((EditText)findViewById(R.id.log)).setText(Log.getLogList());
    }

}
