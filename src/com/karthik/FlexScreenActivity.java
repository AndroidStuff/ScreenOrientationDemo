package com.karthik;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
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
		if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
			showToast("Screen Orientation changed to Portrait mode");
		} else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
			showToast("Screen Orientation changed to Landscape mode");
		}
	}

	private void showToast(String messageText) {
		Toast toast = Toast.makeText(getApplicationContext(), messageText, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

}
