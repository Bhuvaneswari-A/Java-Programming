package com.kodnest.Arrays.level4;

public class ArraySum {
	int findSum(int arr[])
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
}
