package com.kodnest.LinearSearchArrays.level3;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in an array ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("sum of all the elemets is "+sum);
        scan.close();
	}

}
