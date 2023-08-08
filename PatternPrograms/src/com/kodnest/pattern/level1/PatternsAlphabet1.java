package com.kodnest.pattern.level1;

public class PatternsAlphabet1 {

	public static void main(String[] args) {
		char ch = 'A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}

	}

}
