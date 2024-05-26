import java.util.Scanner;

public class demo3 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers u want to enter ");
		int n=sc.nextInt();
		int a[] = new int[n],i;
		System.out.println("Enter the Number ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int current_max=a[0];
		int so_far_max=a[0];
		for(i=0;i<a.length;i++)
		{
			current_max=Math.max(a[i],a[i]+current_max);
			so_far_max=Math.max(current_max, so_far_max);
			
		}
		System.out.println(so_far_max);
	}
}
