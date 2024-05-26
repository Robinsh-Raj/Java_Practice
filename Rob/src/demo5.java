import java.util.Scanner;

public class demo5 
{
	private static void rotateLeft(int[] arr, int k) 
	{
//		k %= arr.length;

	    // Reverse all numbers
	    reverse(arr, 0, arr.length - 1);

	    // Reverse first arr.length-k numbers
	    reverse(arr, 0, arr.length - k - 1);

	    // Reverse last k numbers
	    reverse(arr, arr.length - k, arr.length - 1);
		
	}
	private static void reverse(int[] nums, int start, int end) 
	{
		while (start < end) {
		      int temp = nums[start];
		      nums[start] = nums[end];
		      nums[end] = temp;
		      start++;
		      end--;
		    }
		
	}
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
	  	System.out.println("How many times u want to divide ");
	  	int k=sc.nextInt();
	  	rotateLeft(a,k);
	  	System.out.println("-----------------------------------");
	  	for(i=0;i<a.length;i++)
	  	{
	  		System.out.println(a[i]);
	  	}
	}

}
