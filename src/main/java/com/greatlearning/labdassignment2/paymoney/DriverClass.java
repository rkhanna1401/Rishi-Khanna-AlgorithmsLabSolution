package com.greatlearning.labdassignment2.paymoney;

import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array ");
		int transactionArraySize = sc.nextInt();
		int[] transactionValues = new int[transactionArraySize];
		System.out.println("Enter the values of array ");
		for(int i=0; i<transactionArraySize; i++) {
			transactionValues[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int totalTargetToAchive = sc.nextInt();
		Transactions tr = new Transactions();
		for(int i=0; i<totalTargetToAchive; i++) {
		System.out.println("Enter the value of target ");
		int targetValue = sc.nextInt();
		tr.verifyTransactionTarget(transactionValues, targetValue);
		}
		sc.close();
	}
}
