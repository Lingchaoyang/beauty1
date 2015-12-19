package com.example.beauty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Mainpagebottomactiv extends Activity{

	public Button mainButton,orderbButton,myButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainpagebottom);
		mainButton =(Button)findViewById(R.id.zhuyebutton);
		orderbButton =(Button)findViewById(R.id.dingdanbutton);
		myButton =(Button)findViewById(R.id.wodebutton);
		mainButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Mainpagebottomactiv.this,Mainpage.class));
			}
		});
		orderbButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Mainpagebottomactiv.this,Orderactivity.class));
			}
		});
		myButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Mainpagebottomactiv.this,Login_Register_activity.class));
			}
		});
		
	}

}
