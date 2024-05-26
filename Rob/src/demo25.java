import java.util.Scanner;

public class demo25 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
	  	System.out.println("How many numbers u want to enter in array 1");
	  	m=sc.nextInt();
	  	int a[] = new int[m],i;
	  	System.out.println("Enter the Number ");
	  	for(i=0;i<a.length;i++)
	  	{
	  		a[i]=sc.nextInt();
	  	}
	  	System.out.println("How many numbers u want to enter in array 2");
	  	n=sc.nextInt();
	  	int b[] = new int[n];
	  	System.out.println("Enter the Number ");
	  	for(i=0;i<b.length;i++)
	  	{
	  		b[i]=sc.nextInt();
	  	}
	  	int max=maxrepeated(a,b);
	  	System.out.println(max);

	}

	private static int maxrepeated(int[] a, int[] b) 
	{
		

		    int[][] dp = new int[a.length + 1][b.length + 1];

		    int max = 0;

		    // Iterate over each position in the matrix
		    for (int i = 1; i <= a.length; i++)
		      for (int j = 1; j <= b.length; j++)

		        // If numbers are equal
		        if (a[i - 1] == b[j - 1]) {
		          // Get the number from diagonally opposite
		          // and add 1
		          dp[i][j] = dp[i - 1][j - 1] + 1;

		          max = Math.max(dp[i][j], max);
		        }

		    return max;
		  }
		

}
