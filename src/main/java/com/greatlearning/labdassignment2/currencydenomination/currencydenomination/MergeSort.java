package com.greatlearning.labdassignment2.currencydenomination.currencydenomination;

public class MergeSort {

	 public static int[] sort(int []a){
	        int []tempArray = new int[a.length];
	        return mergeSort(a,tempArray,0,a.length-1);
	    }
	 
	    public static int[] mergeSort(int []a,int []tempArray,int lowerIndex,int upperIndex){
	        if(lowerIndex == upperIndex){

	        }else{
	            int mid = (lowerIndex+upperIndex)/2;
	            mergeSort(a,tempArray, lowerIndex, mid);
	            mergeSort(a,tempArray, mid+1, upperIndex);
	            merge(a,tempArray,lowerIndex,mid+1,upperIndex);
	        }
			return tempArray;
	    }
	 
	    public static int[] merge(int []a,int []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){
	        int tempIndex=0;
	        int lowerIndex = lowerIndexCursor;
	        int midIndex = higerIndex-1;
	        int totalItems = upperIndex-lowerIndex+1;
	        while(lowerIndex <= midIndex && higerIndex <= upperIndex){
	            if(a[lowerIndex] > a[higerIndex]){
	                tempArray[tempIndex++] = a[lowerIndex++];
	            }else{
	                tempArray[tempIndex++] = a[higerIndex++];
	            }
	        }
	 
	        while(lowerIndex <= midIndex){
	            tempArray[tempIndex++] = a[lowerIndex++];
	        }
	 
	        while(higerIndex <= upperIndex){
	            tempArray[tempIndex++] = a[higerIndex++];
	        }
	 
	        for(int i=0;i<totalItems;i++){
	            a[lowerIndexCursor+i] = tempArray[i];
	        }
			return tempArray;
	    }

}
