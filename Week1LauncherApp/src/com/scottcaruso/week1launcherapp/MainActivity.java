package com.scottcaruso.week1launcherapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText currencyAmount = (EditText) findViewById(R.id.entry);
		final Button convertCurrency = (Button) findViewById(R.id.convert);
		
		convertCurrency.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
			String currency = currencyAmount.getText().toString();
				try 
				{
					double currencyDouble = Double.parseDouble(currency);
					Log.i("Double","Value is " + currencyDouble);
				} catch (NumberFormatException e) 
				{
					Toast toast = Toast.makeText(MainActivity.this, "Please enter a valid numeric value.", Toast.LENGTH_SHORT);
					toast.show();
				}
			}
		});	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
