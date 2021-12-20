package com.greatlearning.labdassignment2.currencydenomination.currencydenomination;

public class CurrencyDenomination {

	public void paymentApproach(int[] denominationValues, int amountToPay) {
		boolean success = false;
		int denominationSize = denominationValues.length;
		int[] denominationCount = new int[denominationSize];
		int[] notes = MergeSort.sort(denominationValues);
		for(int i=0; i<denominationSize; i++) {
			if(amountToPay>=notes[i]) {
				denominationCount[i] = amountToPay/notes[i];
				amountToPay =  amountToPay - denominationCount[i]*notes[i];
				success = true;
			}
		}
		if(success) {
			printCurrencyDetails(notes, denominationCount);
		}
		else {
			System.out.println("Amount cannot be paid through specified denominations");
		}
		
	}

	public void printCurrencyDetails(int[] denominationValues, int denominationCount[]) {
		for(int i=0; i< denominationValues.length;i++) {
			if(denominationCount[i]!=0)
				System.out.println(denominationValues[i] + " : " + denominationCount[i]);
		}
		
	}

	public void mergeSort() {

	}

}
