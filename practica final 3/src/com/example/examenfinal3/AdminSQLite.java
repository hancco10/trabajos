package com.example.examenfinal3;

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
	public void onCreate(SQLiteDatabase dbmaquina) {
		// TODO Auto-generated method stub
		dbmaquina.execSQL("CREATE table nom(nombre text primary key,apellidos text)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase dbmaquina, int vsantigua, int vsnueva) {
		// TODO Auto-generated method stub
		dbmaquina.execSQL("select from nom");
		dbmaquina.execSQL("update set");
		dbmaquina.execSQL("drop table if exists nom");
		dbmaquina.execSQL("CREATE table nom(nombre text primary key,apellidos text)");
	}

}
