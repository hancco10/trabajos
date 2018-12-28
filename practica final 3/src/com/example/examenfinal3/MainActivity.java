package com.example.examenfinal3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText val1;
	private EditText val2;
	private TextView resp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1=(EditText)findViewById(R.id.editText1);
        val2=(EditText)findViewById(R.id.editText2);
        resp=(TextView)findViewById(R.id.textViewm1);
    }
    public void unir(View view){
    	String temporal1=val1.getText().toString();
        String temporal2=val2.getText().toString();
        resp.setText(temporal1+" "+temporal2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
