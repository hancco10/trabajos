package com.example.examenfinal1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText valor1;
	private EditText valor2;
	private EditText valor3;
	private TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=(EditText)findViewById(R.id.editText1);
        valor2=(EditText)findViewById(R.id.editText2);
        valor3=(EditText)findViewById(R.id.editText3);
        respuesta=(TextView)findViewById(R.id.textView);
    }
    public void calcular(View view){ 
    	int intvalor1 = Integer.valueOf(valor1.getText().toString());
    	int intvalor2 = Integer.valueOf(valor2.getText().toString());
    	int intvalor3 = Integer.valueOf(valor3.getText().toString());
    	int intresultado = intvalor1 * intvalor2 * intvalor3;
    	respuesta.setText(""+intresultado);
    }
    public void cancelar(View view){
    	valor1.setText(" ");
    	valor2.setText(" ");
    	valor3.setText(" ");
    	respuesta.setText(" ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
