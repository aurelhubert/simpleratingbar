package com.aurelhubert.simpleratingbar.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.aurelhubert.simpleratingbar.SimpleRatingBar;

public class MainActivity extends AppCompatActivity {

	private final String TAG = "SimpleRatingBarDemo";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		init();
	}

	/**
	 * Init
	 */
	private void init() {

		SimpleRatingBar simpleRatingBar = (SimpleRatingBar) findViewById(R.id.simple_rating_bar);
		simpleRatingBar.setListener(new SimpleRatingBar.SimpleRatingBarListener() {
			@Override
			public void onValueChanged(int value) {
				Log.d(TAG, "onValueChanged: " + value);
			}
		});

	}

}
