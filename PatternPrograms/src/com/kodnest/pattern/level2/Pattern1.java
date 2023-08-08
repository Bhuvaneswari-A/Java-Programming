package com.kodnest.pattern.level2;

public class Pattern1 {

	public static void main(String[] args) {
		int alphabet = 65;
		int rows = 5;
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print((char) (alphabet) + " ");
				alphabet++;
			}
			System.out.println();
		}
	}
}
