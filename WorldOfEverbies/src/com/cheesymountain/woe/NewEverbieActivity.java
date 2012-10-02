package com.cheesymountain.woe;
/*=============================================================
 * Copyright 2012, Markus Otterberg
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

import com.cheesymountain.woe.SimpleGestureFilter.SimpleGestureListener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Controller class when creating a new Everbie that handles swipe events
 * for changing race.
 * @author Markus Otterberg
 *
 */
public class NewEverbieActivity extends Activity implements SimpleGestureListener {

	
	private int selectedImage = 0;
	
	private ImageView pictures;
	private EditText name;
	private TextView description;
	private SimpleGestureFilter detector; 

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		if(Everbie.exists()){
			Intent main = new Intent("com.cheesymountain.woe.MAINACTIVITY");
			startActivity(main);
		}
		setContentView(R.layout.activity_new_everbie);
		
		description = ((TextView)findViewById(R.id.everbieLongText));
		description.setText(RaceDescription.IMAGE_DESCRIPTION[0] + RaceDescription.SWIPE_DESCRIPTION);
		pictures = (ImageView)findViewById(R.id.everbiePicsImageView);
		pictures.setImageResource(RaceDescription.IMAGE_ID[0]);
		name = (EditText)findViewById(R.id.everbieNameText);
		name.setHint("Enter Name Here");

        detector = new SimpleGestureFilter(this,this);
	}
	
	/**
	 * Is called automatically when pressing the create button.
	 * @param view - the view from which create button was pressed
	 */
	public void create(View view){
		String name = this.name.getText().toString();
		if(name == null || name.equals("") || name.startsWith(" ")){
			return;
		}
		Everbie.createEverbie(name, getResources().getResourceEntryName(RaceDescription.IMAGE_ID[selectedImage]));
		Intent main = new Intent("com.cheesymountain.woe.MAINACTIVITY");
		startActivity(main);
	}

	/**
	 * Is called when the user swipes across the screen
	 * @param direction - the direction in which the user swipes
	 */
	public void onSwipe(int direction){
		switch(direction){
			case SimpleGestureFilter.SWIPE_RIGHT:
				if(selectedImage > 0){
					pictures.setImageResource(RaceDescription.IMAGE_ID[--selectedImage]);
				}
				break;
			case SimpleGestureFilter.SWIPE_LEFT:
				if(selectedImage < RaceDescription.IMAGE_ID.length-1){
					pictures.setImageResource(RaceDescription.IMAGE_ID[++selectedImage]);
				}
				break;
		}
		description.setText(RaceDescription.IMAGE_DESCRIPTION[selectedImage] + RaceDescription.SWIPE_DESCRIPTION);
	}
	
	/**
	 * Is called automatically when pressing the exit button
	 * @param view - the view from which exit button was pressed
	 */
	public void exit(View view){
		System.exit(0);
	}

	/**
	 * Inherited from SimpleGestureListener (not used)
	 */
	public void onDoubleTap() {
		/* Do nothing */
	}
	

	/**
	 * Inherited from SimpleGestureListener
	 * @author Amir
	 */
	public boolean dispatchTouchEvent(MotionEvent me){ 
		this.detector.onTouchEvent(me);
		return super.dispatchTouchEvent(me); 
	}
	
}
