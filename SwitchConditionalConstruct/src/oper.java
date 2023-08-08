import java.util.Scanner;
public class oper {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any arithmetic character");
		char opt = scan.next().charAt(0);
		switch(opt)
		{
		case '+' :
			System.out.println("Addition");
			break;
		case '-' :
			System.out.println("subtraction");
			break;
		case '*' :
			System.out.println("Multiplication");
			break;
		case '/' :
			System.out.println("Division");
			break;
		case '%' :
			System.out.println("Remainder");
			break;
		default :
			System.out.println("idiot see the msg carefully");
		}
		scan.close();
	}

}
