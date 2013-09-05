package com.scottcaruso.activities;

import com.scottcaruso.converters.ConvertToEuros;
import com.scottcaruso.currencyconverter.R;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class CurrencyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        
        ConvertToEuros euros = new ConvertToEuros();
        double convert = euros.dollarsToEuros(1.50);
        Log.i("Dollars to Euros","1.50 equals "+convert+" Euros");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.currency, menu);
        return true;
    }
    
}