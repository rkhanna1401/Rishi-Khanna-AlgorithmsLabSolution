package com.greatlearning.labdassignment2.currencydenomination.currencydenomination;

import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
		int currencyDenominationSize = sc.nextInt();
		int[] denominationValues = new int[currencyDenominationSize];
		System.out.println("Enter the currency denominations value ");
		for(int i=0; i<currencyDenominationSize; i++) {
			denominationValues[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay ");
		int amountToPay = sc.nextInt();
		CurrencyDenomination currencyDenomination = new CurrencyDenomination();
		currencyDenomination.paymentApproach(denominationValues,amountToPay);
		sc.close();
	}

}
