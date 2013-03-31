package com.example.sinashare;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SinaSharePage extends Activity implements OnClickListener{
	private TextView button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sina_share_page);
		
		button1 = (TextView)findViewById(R.id.button1);
		
		initView();
	}
	
	public void initView(){
		button1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId() == button1.getId()){
			
		}		
	}
	
}
