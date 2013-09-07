package com.scottcaruso.converters;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MasterConverter {
		
	public static ArrayList<String> createCurrencyArray (double dollars)
	{	
		ArrayList<String> currencyArray = new ArrayList<String>();
		DecimalFormat df = new DecimalFormat("#.00"); 
		currencyArray.add(df.format(dollars));
		double aussies = ConvertToAustralianDollar.dollarsToAussies(dollars);
		double canDols = ConvertToCanadianDollar.dollarsToCanadianDollars(dollars);
		double euros = ConvertToEuros.dollarsToEuros(dollars);
		double hkDols = ConvertToHongKongDollar.dollarsToHongKongs(dollars);
		double nzDols = ConvertToNewZealandDollar.dollarsToNewZealandDollars(dollars);
		double pounds = ConvertToPounds.dollarsToPounds(dollars);
		double krona = ConvertToSwedishKrona.dollarsToKronas(dollars);
		double francs = ConvertToSwissFranc.dollarsToSwissFrancs(dollars);
		double won = ConvertToWon.dollarsToWon(dollars);
		double yen = ConvertToYen.dollarsToYen(dollars);
		currencyArray.add(df.format(euros));
		currencyArray.add(df.format(aussies));
		currencyArray.add(df.format(canDols));
		currencyArray.add(df.format(hkDols));
		currencyArray.add(df.format(nzDols));
		currencyArray.add(df.format(pounds));
		currencyArray.add(df.format(krona));
		currencyArray.add(df.format(francs));
		currencyArray.add(df.format(won));
		currencyArray.add(df.format(yen));
		
		return currencyArray;
	}

}
