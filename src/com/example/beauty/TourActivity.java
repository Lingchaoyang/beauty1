package com.example.beauty;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class TourActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//����ȫ��ģʽ������ActionBar
		setContentView(R.layout.mainpagemiddlepictureverticalscrolling);
	}
}
