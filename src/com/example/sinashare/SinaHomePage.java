package com.example.sinashare;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SinaHomePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sina_home_page);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sina_home_page, menu);
		return true;
	}

}
