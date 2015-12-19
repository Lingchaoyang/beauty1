package com.example.beauty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OrderActivity extends Activity {
	public Button mainButton, orderbButton, myButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置全屏模式，隐藏ActionBar
		setContentView(R.layout.myorder);
//		myButton = (Button) findViewById(R.id.wodebutton);
//		mainButton = (Button) findViewById(R.id.zhuyebutton);
//		myButton.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				startActivity(new Intent(OrderActivity.this,
//						Login_Register_activity.class));
//			}
//		});
//
//		mainButton.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				startActivity(new Intent(OrderActivity.this, MainpageActivity.class));
//			}
//		});

	}

}
