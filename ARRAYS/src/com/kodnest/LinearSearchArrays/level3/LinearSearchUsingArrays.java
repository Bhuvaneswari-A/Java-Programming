package com.kodnest.LinearSearchArrays.level3;

import java.util.Scanner;

public class LinearSearchUsingArrays {

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
		scan.close();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key Found at index " +i);
				return;
			}
		}
		System.out.println("Key Not Found");
	}

}
