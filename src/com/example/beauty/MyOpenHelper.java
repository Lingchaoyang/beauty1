package com.example.beauty;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View.OnCreateContextMenuListener;

public class MyOpenHelper extends SQLiteOpenHelper{

	public MyOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, null, version);
		// TODO Auto-generated constructor stub
	}
	public void OnCreate(SQLiteDatabase db){
		db.execSQL("create table if not exists "+"yonghuxinxi"+" ("+"name vrchar,"+"mima varchar"+")");
	}
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
