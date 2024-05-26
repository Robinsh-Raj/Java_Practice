import java.util.Scanner;

public class demo19 {

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
	  	System.out.println("Enter the number which u want to insert");
	  	int num=sc.nextInt();
	  	System.out.println("Enter the position");
	  	int pos=sc.nextInt();
	  	int b[]=insert(a,num,pos);
	  	for(i=0;i<b.length;i++)
	  	{
	  		System.out.print(b[i]+" ");
	  	}
	  	

	}

	private static int[] insert(int[] a, int num, int pos) 
	{
		int i,j;
		
		if(pos<0 || pos>a.length)
		{
			System.out.println("array Out of bond");
			return a;
		}
		int newarray[]=new int[a.length+1];
		
			for(i=0,j=0;i<newarray.length;i++)
		  	{
		  		if(i==pos)
		  		{
		  			newarray[i]=num;
		  		}
		  		else
		  		{
		  			newarray[i]=a[j++];
		  		}
		  	}
		
		return newarray;
//		for(i=0;i<newarray.length;i++)
//	  	{
//	  		System.out.print(newarray[i]+" ");
//	  	}
		
	}

}
