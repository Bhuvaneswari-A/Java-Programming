package com.kodnest.LinearSearchArrays.level3;

public class LinearSearch {

	int lnSearch(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				return i;
			}
		}
		return -1;
	}

}
