import java.util.Scanner;

public class demo9 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many row");
		int r=sc.nextInt();
		System.out.println("How many column");
		int c=sc.nextInt();
		int arr[][] = new int[r][c],i,j,max;
		System.out.println("Enter numbers");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("--------------------");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for(i=0;i<arr.length;i++)
		{
			max=arr[i][0];
//			System.out.println();
			for(j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
			System.out.print(max+" ");
		}
		
		
	}

}
