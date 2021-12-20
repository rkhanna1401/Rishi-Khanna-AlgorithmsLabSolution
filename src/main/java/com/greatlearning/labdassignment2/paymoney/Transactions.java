package com.greatlearning.labdassignment2.paymoney;

public class Transactions {

	public void verifyTransactionTarget(int[] transactionValue,int targetValue) {
		int transactionSize = transactionValue.length;
		int calculatedValue = 0;
		int iterationCount = 0;
		int count = 0;
		while(targetValue > calculatedValue && iterationCount<transactionSize) {
				calculatedValue = calculatedValue + transactionValue[count];
				iterationCount++;
				count++;
			}
			if(calculatedValue >= targetValue) {
				System.out.println("Target achieved after "+count+" transactions");
			}
			else {
				System.out.println("Target not achieved ");
			}
		}
}
