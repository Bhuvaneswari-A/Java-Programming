import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your income: ");
		double income = scanner.nextDouble();
		double tax = calculateTax(income);
		System.out.println( tax);
		scanner.close();
	}

	public static double calculateTax(double income)
	{
		double tax=0;
		if(income<250000)
		{
			return tax;
		}
		else if(income>250000 && income<500000)
		{
			tax=(income-250000)*0.05;
		}
		else if(income>500000 && income<1000000)
		{
			return (income - 500000) * 0.2 + 12500;
		}
		else
		{
			return (income - 1000000) * 0.3 + 112500;
		}
		return tax;
	}
}
