package com.example.examenfinal2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLite extends SQLiteOpenHelper{

	public AdminSQLite(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase dbregistro) {
		// TODO Auto-generated method stub
		dbregistro.execSQL("CREATE table datos(nombre text primary key,apellidos text,edad int)");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase dbregistro, int versionantigua, int versionnueva) {
		// TODO Auto-generated method stub
		dbregistro.execSQL("select from datos");
		dbregistro.execSQL("update set");
		dbregistro.execSQL("drop table if exists datos");
		dbregistro.execSQL("CREATE table datos(nombre text primary key,apellidos text,edad int)");
	}
	
}
