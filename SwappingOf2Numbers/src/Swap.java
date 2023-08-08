import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two +ve numbers to swap");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Before Swapping: " +x+ " " +y);
		int help = x;
		x = y;
		y = help;
		System.out.println("After Swapping: " +x+ " " +y);
		scan.close();
	}
}
