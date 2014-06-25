package com.lucaciavatta.soundmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuonoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sound);

		SoundManager.InitSound(this);

	     
	     
	   Button firstbutton = (Button) findViewById(R.id.button1);
		 Button secondbutton = (Button) findViewById(R.id.button2);
		 Button thirdbutton = (Button) findViewById(R.id.button3);
		 
		 
			
		 
		 
			
			firstbutton.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					
							 SoundManager.playSound(0);
							 
							
						
					
				}
			
			});
			
			secondbutton.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					
							SoundManager.playSound(1);
							
						}
				
					
				});
				
				
			
			thirdbutton.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					
						
							 SoundManager.playSound(2);
							
						}
					
					
				
				
			});
				
				
	     
	     
		
}
}
