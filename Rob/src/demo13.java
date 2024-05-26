import java.util.Scanner;

public class demo13 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	  	System.out.println("How many rows ");
	  	int r=sc.nextInt();
	  	System.out.println("How many column ");
	  	int c=sc.nextInt();
	  	int a[][] = new int[r][c],i,j;
	  	System.out.println("Enter the Number ");
	  	for(i=0;i<a.length;i++)
	  	{
	  		for(j=0;j<a[i].length;j++)
	  		{
	  			a[i][j]=sc.nextInt();
	  		}
	  	}
	  	for(i=0;i<a.length;i++)
	  	{
	  		for(j=0;j<a[i].length;j++)
	  		{
	  			System.out.print(a[i][j]+" ");
	  		}
	  		System.out.println();
	  	}
	  	int sum1=0,sum2=0;
	  	for(i=0;i<a.length;i++)
	  	{
	  		for(j=0;j<a[i].length;j++)
	  		{
	  			if(i==j)
	  				sum1+=a[i][j];
	  		}
	  		
	  		
	  	}
	  	System.out.println("Sum of major diagonal is "+sum1);
	  	
	  	

	}

}
