import java.util.Scanner;

public class demo11 {

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
	  	System.out.println("Enter the number which u want to search ");
	  	int target=sc.nextInt();
	  	search(a,target);

	}

	private static void search(int[] a, int target) 
	{
		boolean flag;
		int i;
		for(i=0,flag=false;i<a.length;i++)
		{
			if(a[i]==target)
			{
				flag=true;
				System.out.println("Number is found");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Number is not found");
		}
		
	}

}
