package com.kodnest.pattern.level2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print("0 ");
			}
			System.out.print(i + " ");
			for (int k = i; k < rows; k++)
			{
				System.out.print("0 ");
			}
			System.out.println();
		}

	}

}
