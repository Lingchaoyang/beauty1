package com.example.beauty;



import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
import android.widget.TextView;

public class MainpagemiddlecircleActivity extends TabActivity {
	private TabHost tabHost;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        tabHost=this.getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent=new Intent().setClass(this, MainpageActivity.class);
        spec=tabHost.newTabSpec("主页").setIndicator("主页").setContent(intent);
        tabHost.addTab(spec);
        
        intent=new Intent().setClass(this,OrderActivity.class);
        spec=tabHost.newTabSpec("订单").setIndicator("订单").setContent(intent);
        tabHost.addTab(spec);
        
        intent=new Intent().setClass(this, MyActivity.class);
        spec=tabHost.newTabSpec("我的").setIndicator("我的").setContent(intent);
        tabHost.addTab(spec);
        
        RadioGroup radioGroup=(RadioGroup) this.findViewById(R.id.main_tab_group);
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.zhuyeButton://主页
					tabHost.setCurrentTabByTag("主页");
					break;
				case R.id.dandingButton://订单
					tabHost.setCurrentTabByTag("订单");
					break;
				case R.id.wodeButton://我的
					tabHost.setCurrentTabByTag("我的");
					break;
				default:
					break;
				}
			}
		});
    }
    
   
}