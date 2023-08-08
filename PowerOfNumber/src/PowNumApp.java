import java.util.Scanner;

public class PowNumApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base: ");
		int base = scan.nextInt();
		System.out.println("Enter exponent: ");
		int exponent = scan.nextInt();
		int power = Main.FindPower(base,exponent);
		System.out.println("power of number is : "+power);
		scan.close();
	}
}
