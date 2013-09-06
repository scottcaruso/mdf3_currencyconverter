package com.scottcaruso.converters;

import java.util.ArrayList;

public class MasterConverter {
		
	public static ArrayList<Double> createCurrencyArray (double dollars)
	{	
		ArrayList<Double> currencyArray = new ArrayList<Double>();
		currencyArray.add(dollars);
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
		currencyArray.add(aussies);
		currencyArray.add(canDols);
		currencyArray.add(euros);
		currencyArray.add(hkDols);
		currencyArray.add(nzDols);
		currencyArray.add(pounds);
		currencyArray.add(krona);
		currencyArray.add(francs);
		currencyArray.add(won);
		currencyArray.add(yen);
		
		return currencyArray;
	}

}
