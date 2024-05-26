import java.util.Scanner;

public class demo7 
{
	private static int LCM(int a, int b, int c)
	{
		return lcm(lcm(a,b),c);
		
	}
	private static int lcm(int a, int b) {
		return (a*(b/hcf(a,b)));
	}
	private static int hcf(int a, int b) 
	{
		if(b==0)
		{
			return a;
		}
		return hcf(b,b%a);
	}
	public static void main(String args[])
	{
		System.out.println("Enter numbers u want to find LCM ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n=LCM(a,b,c);
		System.out.println("LCM is "+n);
		
	}
}
