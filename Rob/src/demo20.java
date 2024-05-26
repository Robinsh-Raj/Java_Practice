import java.util.Arrays;
import java.util.Scanner;

public class demo20 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n,m;
	  	System.out.println("How many numbers u want to enter in array ");
	  	m=sc.nextInt();
	  	int a[] = new int[m],i;
	  	System.out.println("Enter the Number ");
	  	for(i=0;i<a.length;i++)
	  	{
	  		a[i]=sc.nextInt();
	  	}
	  	System.out.println("Enter the position of array which u want to delete");
	  	int pos=sc.nextInt();
	  	int c[]=deletion(a,pos);
	  	System.out.println(Arrays.toString(c));

	}

	private static int[] deletion(int[] a, int pos) 
	{
		int i,j;
		if(pos<0 || pos>a.length)
		{
			System.out.println("Array out of bond");
			return a;
		}
		int newarray[]=new int[a.length-1];
		for(i=0,j=0;i<a.length;i++)
		{
			if(i!=pos)
			{
				newarray[j++]=a[i];
			}
		}
		return newarray;
	}

}
