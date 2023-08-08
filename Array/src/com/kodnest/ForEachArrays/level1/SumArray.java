package com.kodnest.ForEachArrays.level1;
import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array-1 Length");
		int arr1[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" elements to store in an array ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter Array-2 Length");
		int arr2[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" elements to store in an array ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i] = scan.nextInt();
		}
		System.out.println("Array-1 elements are...");
		for(int x : arr1)
		{
			System.out.print(x + " ");
		}
		System.out.println("Array-2 elements are...");
		for(int x : arr2)
		{
			System.out.print(x + " ");
		}
		SumArrayApp sumarray = new SumArrayApp();
		int res[] = sumarray.findSum(arr1,arr2);
		System.out.println("array-3--> ");
		for(int x : res)
		{
			System.out.println(x +" ");
		}
		scan.close();

	}

}
