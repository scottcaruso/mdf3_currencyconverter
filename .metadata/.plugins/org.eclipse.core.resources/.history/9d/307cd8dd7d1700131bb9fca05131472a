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
import android.widget.TextView;

public class CurrencyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        
        ArrayList<Double> thisConversion = MasterConverter.createCurrencyArray(1.25);
        
        //Init all of the dollar text views so the currency can be displayed
        final TextView dollars = (TextView) findViewById(R.id.dollar_amt);
        final TextView euros = (TextView) findViewById(R.id.euro_amt);
        final TextView aussies = (TextView) findViewById(R.id.ausdol_amt);
        final TextView canDols = (TextView) findViewById(R.id.can_amt);
        final TextView hkDols = (TextView) findViewById(R.id.hk_amt);
        final TextView nzDols = (TextView) findViewById(R.id.nzl_amt);
        final TextView pounds = (TextView) findViewById(R.id.uk_amt);
        final TextView krona = (TextView) findViewById(R.id.swe_amt);
        final TextView francs = (TextView) findViewById(R.id.swz_amt);
        final TextView won = (TextView) findViewById(R.id.sko_amt);
        final TextView yen = (TextView) findViewById(R.id.jpn_amt);
        
        dollars.setText(thisConversion.get(0).toString());
        euros.setText(thisConversion.get(1).toString());
        aussies.setText(thisConversion.get(2).toString());
        canDols.setText(thisConversion.get(3).toString());
        hkDols.setText(thisConversion.get(4).toString());
        nzDols.setText(thisConversion.get(5).toString());
        pounds.setText(thisConversion.get(6).toString());
        krona.setText(thisConversion.get(7).toString());
        francs.setText(thisConversion.get(8).toString());
        won.setText(thisConversion.get(9).toString());
        yen.setText(thisConversion.get(10).toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.currency, menu);
        return true;
    }
    
}
