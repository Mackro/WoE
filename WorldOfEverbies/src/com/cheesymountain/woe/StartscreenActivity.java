package com.cheesymountain.woe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartscreenActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_startscreen);
	}
	
	public void continueGame(View view){
		Intent main = new Intent("com.cheesymountain.woe.MAINACTIVITY");
		startActivity(main);
	}
	
	public void newGame(View view){
		Intent main = new Intent("com.cheesymountain.woe.NEWEVERBIEACTIVITY");
		startActivity(main);
	}
	
	public void exitGame(View view){
		System.exit(0);
	}
	
}
