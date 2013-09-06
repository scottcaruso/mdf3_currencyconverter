package com.scottcaruso.activities;

import java.util.ArrayList;

import com.scottcaruso.converters.ConvertToEuros;
import com.scottcaruso.converters.MasterConverter;
import com.scottcaruso.currencyconverter.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.util.Log;
import android.view.Menu;

public class CurrencyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        
        ArrayList<Double> thisConversion = MasterConverter.createCurrencyArray(1.25);
        Log.i("Dollars","1.25 equals " + thisConversion.get(0).toString()+" Euros");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.currency, menu);
        return true;
    }
    
}
