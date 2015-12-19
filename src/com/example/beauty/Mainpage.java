package com.example.beauty;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Mainpage extends Activity {
	public Button mainButton, orderbButton, myButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置全屏模式，隐藏ActionBar
		setContentView(R.layout.mainpage);
		myButton = (Button) findViewById(R.id.wodebutton);
		orderbButton = (Button) findViewById(R.id.dingdanbutton);
		myButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Mainpage.this,
						Login_Register_activity.class));
			}
		});
		orderbButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Mainpage.this,
						Orderactivity.class));
			}
		});
	}
}
