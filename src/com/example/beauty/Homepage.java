package com.example.beauty;


import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import android.app.Activity;
import android.content.Intent;

public class Homepage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置全屏模式，隐藏ActionBar
		setContentView(R.layout.homepage);
		//延迟3秒
		new Handler().postDelayed(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Homepage.this,MainActivity.class);
				startActivity(intent);
				Homepage.this.finish();
			}
			
		}, 3000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
