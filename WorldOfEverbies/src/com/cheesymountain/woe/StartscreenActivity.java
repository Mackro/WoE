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
