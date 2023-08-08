package com.kodnest.ForEachArrays.level1;

public class Array2 {

	public static void main(String[] args) {
		int count1=0;
		int count2=0;
		for(int i=1;i<=5;i++)
		{
		    count1++;
			System.out.println("Hello");
			for(int j=1;j<=3;j++)
			{
				count2++;
				System.out.println("Kodnest");
			}
		}
		System.out.println(count1++ +" "+ count2++);

	}

}
