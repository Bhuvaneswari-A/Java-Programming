package com.kodnest.ForEachArrays.level1;

import java.util.Scanner;

public class ForeachArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter " +arr.length+" elemets to store it in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Array elements are...");
		for(int x : arr)
		{
			System.out.print(x + 5 + " ");
		}
		scan.close();
	}

}
