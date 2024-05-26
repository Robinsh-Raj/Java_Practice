import java.util.Scanner;

public class Main 
{
	private static void TwoSum(int[] a) 
	{
		// TODO Auto-generated method stub
		int i,j,target=7,k=0;
		int b[]=new int[10];
		for(i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				System.out.println(a[i]);
			}
			else
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]==target-a[j])
					{
						b[k++]=a[i];
						
					}
				}
				System.out.println(b);
			}
			
		}
		
	}
	public static void main(String args[]) 
	{
		int n,i,j,target=9,cnt=0;
		System.out.println("How many numbers u want to enter ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		TwoSum(a);
		 


		
	}

	
	

}
