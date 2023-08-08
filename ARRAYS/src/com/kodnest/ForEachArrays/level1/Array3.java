package com.kodnest.ForEachArrays.level1;

public class Array3 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			System.out.println("Hello");
			for(int j=1;j<=5;j++)
			{
				System.out.println("Kodnest");
				if(j==2)
				{
					break; //the control comeout of the inner for loop//
				}
			}
		}

	}

}
