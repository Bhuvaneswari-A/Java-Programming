
public class ArmstrongNum {
	public int power(int n,int count)
	{
		int res=(int) Math.pow(n, count);
		return res;
	}
	public int sumOfDigitsRaisedToPower(int n,int count)
	{
		ArmstrongNum armstrong=new ArmstrongNum();
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int res=armstrong.power(rem, count);
			sum=sum+res;
			n=n/10;
		}
		return sum;
	}
}
