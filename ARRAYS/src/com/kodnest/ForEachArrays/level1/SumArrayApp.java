package com.kodnest.ForEachArrays.level1;

public class SumArrayApp{

	int[] findSum(int arr1[],int arr2[])
	{
		int res[] = new int[arr1.length+arr2.length];
		int i = 0;
		
		while(i<=arr1.length-1)
		{
			res[i]=arr1[i]+arr2[i];
			i++;
			
		}
		return res;
	}
}

