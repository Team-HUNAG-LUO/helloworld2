package com.example.maybe;

import android.os.Bundle;
import android.app.Activity;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	MediaPlayer mediaplayer;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		mediaplayer=MediaPlayer.create(this, R.raw.wbgm01);
		
		
		setContentView(R.layout.activity_main);
		
		
		mediaplayer.start();
		
		
		Button btn = (Button)findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v){
				ImageView iv = (ImageView)findViewById(R.id.imageView3);
				Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.may);
				iv.startAnimation(animation);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
