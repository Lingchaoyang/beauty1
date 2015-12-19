package com.example.beauty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login_Register_Activity extends Activity{
	public Button mainButton,orderbButton,myButton,loginbButton,registButton,sloginButton,sregistButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置全屏模式，隐藏ActionBar
		setContentView(R.layout.login_and_register);
		loginbButton =(Button)findViewById(R.id.yhdl);
		registButton =(Button)findViewById(R.id.yhzc);
		sloginButton =(Button)findViewById(R.id.sysdl);
		myButton =(Button)findViewById(R.id.syszc);
         mainButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Login_Register_Activity.this,MainActivity.class));
			}
		});
         orderbButton.setOnClickListener(new OnClickListener() {
 			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 				startActivity(new Intent(Login_Register_Activity.this,OrderActivity.class));
 			}
 		});
         loginbButton.setOnClickListener(new OnClickListener() {
  			
  			@Override
  			public void onClick(View arg0) {
  				// TODO Auto-generated method stub
  				startActivity(new Intent(Login_Register_Activity.this,login_or_regiterActivity.class));
  			}
  		});
         registButton.setOnClickListener(new OnClickListener() {
  			
  			@Override
  			public void onClick(View arg0) {
  				// TODO Auto-generated method stub
  				startActivity(new Intent(Login_Register_Activity.this,login_or_regiterActivity.class));
  			}
  		});
         registButton.setOnClickListener(new OnClickListener() {
   			
   			@Override
   			public void onClick(View arg0) {
   				// TODO Auto-generated method stub
   				startActivity(new Intent(Login_Register_Activity.this,login_or_regiterActivity.class));
   			}
   		});
         sloginButton.setOnClickListener(new OnClickListener() {
   			
   			@Override
   			public void onClick(View arg0) {
   				// TODO Auto-generated method stub
   				startActivity(new Intent(Login_Register_Activity.this,login_or_regiterActivity.class));
   			}
   		});
        
		
	}

	

}
