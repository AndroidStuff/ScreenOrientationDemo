package com.karthik;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnotherFlexScreenActivity extends Activity {

	private static final String SCORE = "SCORE";
	private int score;
	private TextView textViewScore;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if(savedInstanceState != null) {
			score = savedInstanceState.getInt(SCORE);
		}
		
		setContentView(R.layout.activity_another_flex_screen);
		textViewScore = (TextView) findViewById(R.id.scoreTextView);
		textViewScore.setText(score + "");
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(SCORE,score);
	}
	
	public void incrementScore(View v) {
		score++;
		textViewScore.setText(score + "");
	}
	
	public void decrementScore(View v) {
		score--;
		textViewScore.setText(score + "");
	}
}
