package com.example.beauty;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class login_or_regiterActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置全屏模式，隐藏ActionBar
		setContentView(R.layout.login_or_register);
	}

}
