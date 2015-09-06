package com.karthik;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class FlexScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flex_screen);
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		Log.i("FixedScreenActivity", "onConfigurationChanged()");
		if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
			Toast.makeText(getApplicationContext(), "Portrait mode", Toast.LENGTH_SHORT).show();
		} else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
			Toast.makeText(getApplicationContext(), "Landscape mode", Toast.LENGTH_SHORT).show();
		}
	}

}
