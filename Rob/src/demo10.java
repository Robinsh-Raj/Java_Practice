import java.util.Scanner;

public class demo10 
{
	private static void subarray(int[] a, int k) 
	{
		int i,j;
		for(j=-1;j<a.length-k-1;j++)
		{
		for(i=j+1;i<j+k;i++)
	  	{
	  		System.out.print(a[i]+" ");
	  	}
		System.out.println("");
		}
	}

	public static void main(String[] args)
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
	  	System.out.println("Enter the length of sub-array");
	  	int k=sc.nextInt();
	  	subarray(a,k);
	}

	

}
