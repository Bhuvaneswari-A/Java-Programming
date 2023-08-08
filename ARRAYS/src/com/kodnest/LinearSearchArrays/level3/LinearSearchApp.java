 package com.kodnest.LinearSearchArrays.level3;

import java.util.Scanner;

public class LinearSearchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in an array ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the key to search in an array");
		int key = scan.nextInt();
		
		LinearSearch lsearch = new LinearSearch();
		int res = lsearch.lnSearch(arr, key);
		if(res>=0)
		{
			System.out.println("Key Found at index "+res);
		}
		else
		{
			System.out.println("Key Not Found");
		}
		scan.close();

	}

}
