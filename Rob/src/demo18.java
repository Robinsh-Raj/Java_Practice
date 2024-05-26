import java.util.Scanner;

public class demo18 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int r=sc.nextInt();
		System.out.println("Enter columns");
		int c=sc.nextInt();
		int a[][]=new int[r][c],i,j;
		System.out.println("Enter the data of m1");
		for(i=0;i<r;i++)
	  	{
			for(j=0;j<c;j++)
		  	{
		  		a[i][j]=sc.nextInt();
		  	}
	  	}
		System.out.println("These are the data of m1");
		for(i=0;i<r;i++)
	  	{
			for(j=0;j<c;j++)
		  	{
		  		System.out.print(a[i][j]+" ");
		  	}
			System.out.println();
	  	}
		int m2[][]= new int[r][c];
		System.out.println("Enter the data m2");
		for(i=0;i<r;i++)
	  	{
			for(j=0;j<c;j++)
		  	{
		  		m2[i][j]=sc.nextInt();
		  	}
	  	}
		System.out.println("These are the data of m2");
		for(i=0;i<r;i++)
	  	{
			for(j=0;j<c;j++)
		  	{
		  		System.out.print(m2[i][j]+" ");
		  	}
			System.out.println();
	  	}
		int d[][]=new int[r][c];
		System.out.println("Addition of matrix");
		for(i=0;i<r;i++)
	  	{
			for(j=0;j<c;j++)
		  	{
		  		d[i][j]=a[i][j]+m2[i][j];
		  	}
			
	  	}
		for(i=0;i<r;i++)
	  	{
			for(j=0;j<c;j++)
		  	{
		  		System.out.print(d[i][j]+" ");
		  	}
			System.out.println();
	  	}
		System.out.println("Transpose of matrix");
		for(i=0;i<c;i++)
	  	{
			for(j=0;j<r;j++)
		  	{
		  		System.out.print(a[j][i]+" ");
		  	}
			System.out.println();
	  	}
		
		
		

	}

}
