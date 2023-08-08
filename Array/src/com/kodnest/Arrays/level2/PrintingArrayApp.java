package com.kodnest.Arrays.level2;

import java.util.Scanner;

public class PrintingArrayApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to store in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		PrintArray pArray=new PrintArray();
		pArray.printArray(arr);
		scan.close();
	}
}
