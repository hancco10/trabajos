package com.example.examenfinal2;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText valorUno;
	private EditText valorDos;
	private EditText valorTres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valorUno=(EditText)findViewById(R.id.editTextm1);
        valorDos=(EditText)findViewById(R.id.editTextm2);
        valorTres=(EditText)findViewById(R.id.editTextm3);
    }
    public void guardar(View view){
    	AdminSQLite adminsql=new AdminSQLite(this, "adminsit", null, 1);
    	SQLiteDatabase dbregistro=adminsql.getWritableDatabase();
    	String temporal1=valorUno.getText().toString();
        String temporal2=valorDos.getText().toString();
        String temporal3=valorTres.getText().toString();
        ContentValues formulario=new ContentValues();
        formulario.put("nombre",temporal1);
        formulario.put("apellidos",temporal2);
        formulario.put("edad",temporal3);
        
        try {
    		dbregistro.insert("datos", null, formulario);
    		Toast.makeText(this, "Registro Guardado", Toast.LENGTH_SHORT).show();
    		valorUno.setText(" ");
    		valorDos.setText(" ");
    		valorTres.setText(" ");
    	} catch (Exception e){
    		Toast.makeText(this, "Error"+e.getMessage(), Toast.LENGTH_SHORT).show();

    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
