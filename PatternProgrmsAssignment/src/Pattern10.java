
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=9;  
		for (int i = 1; i <= rows; i++)   
		{   
		for (int j = rows; j >= i; j--)  
		{  
		System.out.print(j+" ");  
		}  
		System.out.println();  
		}  

	}

}
