package com.karthik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FixedScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixed_screen);
	}

	public void goToFlexScreen(View v) {
		startActivity( new Intent(this, FlexScreenActivity.class) );
	}

	public void goToAnotherFlexScreen(View v) {
		startActivity( new Intent(this, AnotherFlexScreenActivity.class) );
	}

}
