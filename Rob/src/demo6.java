import java.util.Scanner;
public class demo6 
{
	private static void pythagorus(int limit)
	{
		int a,b;
		for(a=1;a<=limit;a++)
		{
			for(b=a;b<+limit;b++)
			{
				int square = a*a+b*b;
				int c = (int) Math.sqrt(square);
				if(c*c==square)
					System.out.println("( "+a+", "+b+", "+c+" )");
			}
		}
		
	}
	public static void main(String args[])
	{
		System.out.println("Enter limit. ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		pythagorus(limit);
	}

}
