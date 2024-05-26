import java.util.Scanner;

public class demo17 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		int n;
//	  	System.out.println("How many numbers u want to enter ");
//	  	n=sc.nextInt();
//	  	int a[] = new int[n],i;
//	  	int b[] = new int[n],temp;
//	  	System.out.println("Enter the Number for First array");
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		a[i]=sc.nextInt();
//	  	}
//	  	System.out.println("Enter the Number in Second Array ");
//	  	for(i=0;i<b.length;i++)
//	  	{
//	  		b[i]=sc.nextInt();
//	  	}
//	  	for(i=0;i<b.length;i++)
//	  	{
//	  		temp=a[i];
//	  		a[i]=b[i];
//	  		b[i]=temp;
//	  	}
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		System.out.print(a[i]);
//	  	}
//	  	for(i=0;i<b.length;i++)
//	  	{
//	  		System.out.print(b[i]);
//	  	}
	  	
	  	
//	  	System.out.println("Data of array a");
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		System.out.println(a[i]+" ");
//	  	}
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		b[i]=a[i];
//	  	}
//	  	System.out.println("Data of array b");
//	  	for(i=0;i<b.length;i++)
//	  	{
//	  		System.out.print(b[i]+" ");
//	  	}
	  	//---------------------------------------------------------
//		int n,m;
//	  	System.out.println("How many numbers u want to enter in array a ");
//	  	m=sc.nextInt();
//	  	int a[] = new int[m],i;
//	  	System.out.println("Enter the Number in array a");
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		a[i]=sc.nextInt();
//	  	}
//	  	System.out.println("How many numbers u want to enter in array b ");
//	  	n=sc.nextInt();
//	  	int b[] = new int[n];
//	  	System.out.println("Enter the Number in array b");
//	  	for(i=0;i<b.length;i++)
//	  	{
//	  		b[i]=sc.nextInt();
//	  	}
//	  	int c[]=new int[m+n];
//	  	for(i=0;i<m;i++)
//	  	{
//	  		c[i]=a[i];
//	  	}
//	  	for(i=0;i<n;i++)
//	  	{
//	  		c[m+i]=b[i];
//	  	}
//	  	for(i=0;i<m+n;i++)
//	  	{
//	  		System.out.print(c[i]+" ");
//	  	}
		//--------------------------------------------------------------
//		int n,m;
//	  	System.out.println("How many numbers u want to enter in array ");
//	  	m=sc.nextInt();
//	  	int a[] = new int[m],i;
//	  	System.out.println("Enter the Number ");
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		a[i]=sc.nextInt();
//	  	}
//	  	int b[] = new int[m];
//	  	int c[] = new int[m];
//	  	int p=0,ne=0;
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		if(a[i]>0)
//	  		{
//	  			b[p++]=a[i];
//	  		}
//	  		else
//	  		{
//	  			c[ne++]=a[i];
//	  			
//	  		}
//	  		
//	  	}
//	  	for(i=0;i<p;i++)
//	  	{
//	  		System.out.print(b[i]+" ");
//	  	}
//	  	System.out.println();
//	  	for(i=0;i<ne;i++)
//	  	{
//	  		System.out.print(c[i]+" ");
//	  	}
		//---------------------------------------------------
		int n,m;
	  	System.out.println("How many numbers u want to enter in array ");
	  	m=sc.nextInt();
	  	int a[] = new int[m],i;
	  	System.out.println("Enter the Number ");
	  	for(i=0;i<a.length;i++)
	  	{
	  		a[i]=sc.nextInt();
	  	}
	  	for(i=a.length-1;i>=0;i--)
	  	{
	  		System.out.print(a[i]+" ");
	  	}
	  	System.out.println();
	  	int j,temp;
	  	for(i=0,j=a.length-1;i<j;i++,j--)
	  	{
	  		temp=a[i];
	  		a[i]=a[j];
	  		a[j]=temp;
	  	}
	  	for(i=0;i<a.length;i++)
	  	{
	  		System.out.print(a[i]+" ");
	  	}
	  	
	  	
	  	

	}

}
