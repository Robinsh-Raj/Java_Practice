import java.util.*;
public class demo22 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
	  	System.out.println("How many numbers u want to enter in array ");
	  	m=sc.nextInt();
	  	int a[] = new int[m],i;
	  	System.out.println("Enter the Number ");
	  	for(i=0;i<a.length;i++)
	  	{
	  		a[i]=sc.nextInt();
	  	}
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		System.out.print(a[i]+" ");
//	  	}
//	  	Arrays.sort(a);
//	  	System.out.println();
//	  	System.out.println("After sorting");
//	  	for(i=0;i<a.length;i++)
//	  	{
//	  		System.out.print(a[i]+" ");
//	  	}
//	  	System.out.println();
//	  	System.out.println("Second largest is "+a[a.length-2]);
	  	
	  	
	  	
	  	
	  	
//	  	int sing=a[0];
//	  	for(i=1;i<a.length;i++)
//	  	{
//	  		sing = sing ^ a[i];
//	  	}
//	  	System.out.println(sing);
//	}
	  	int max_far=a[0];
	  	int cur_max=a[0];
	  	for(i=1;i<a.length;i++)
	  	{
	  		cur_max=Math.max(a[i],a[i]+cur_max);
	  		
	  		max_far=Math.max(cur_max,max_far);
	  	}
	  	System.out.println(max_far);

}
}
