package com.cheesymountain.woe;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class NewEverbieActivity extends Activity {

private int[] imageId = {
		R.drawable.wbe,
};
private int selectedImage = 0;

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		if(Everbie.exists()){
			Intent main = new Intent("com.cheesymountain.woe.MAINACTIVITY");
			startActivity(main);
		}
		setContentView(R.layout.activity_new_everbie);
		((EditText)findViewById(R.id.everbieLongText)).setText("Mogno:\nThe Mogno race are known for their sharp calws and short temper.");
		((ImageView)findViewById(R.id.everbiePicsImageView)).setImageResource(imageId[0]);
	}
	
	public void create(View view){
		String name = ((EditText)findViewById(R.id.everbieNameText)).getText().toString();
		Everbie.createEverbie(name, getResources().getResourceEntryName(imageId[selectedImage]));
		Intent main = new Intent("com.cheesymountain.woe.MAINACTIVITY");
		startActivity(main);
	}
	
	public void exit(View view){
		System.exit(0);
	}
	
}
