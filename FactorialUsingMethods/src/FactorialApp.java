import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		int result = Main.factorial(num);
		System.out.println("Fatorial: "+result);
		scan.close();

	}

}
