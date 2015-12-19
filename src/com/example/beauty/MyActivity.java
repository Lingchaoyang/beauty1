package com.example.beauty;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class MyActivity extends Activity {
	public Button mainButton, orderbButton, myButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置全屏模式，隐藏ActionBar
		setContentView(R.layout.login_and_register);
	}
}