
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet = 65;
		int rows = 5;
		for (int i = rows; i >= 1; i--)
		{
			for (int j = i; j >= 1; j--)
			{
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= rows; i++) 
                { 
                        for (int j = i; j >= 1; j--)
			{
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
	}

}
