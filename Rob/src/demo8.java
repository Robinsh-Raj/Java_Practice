import java.util.Scanner;

public class demo8 
{
	private static void Arithematic(int t,int d, int n) 
	{
		int firstTerm=t;
		for(int i=0;i<n;i++)
		{
			t=t+d;
			System.out.println(t);
		}
		
	}
	private static void Fibonacci(int num)
	{
		int a=0,b=1,i;
		if(num>0)
			System.out.print(a+" "+b);
		for(i=2;i<num;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter first term ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		System.out.println("Differnece is ");
		int d = sc.nextInt();
		System.out.println("Enter many numbers ");
		int n = sc.nextInt();
		Arithematic(t,d,n);
		System.out.println("How many Fibonacci series ");
		int num = sc.nextInt();
		Fibonacci(num);
	}
	

}
