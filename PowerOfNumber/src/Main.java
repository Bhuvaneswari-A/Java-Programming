
public class Main {
	public static int FindPower(int x,int y)
	{
		int pow=1;
		for(int i=1;i<=y;i++)
		{
			pow=pow*x;
		}
		return pow;
	}

}
