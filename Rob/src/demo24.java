import java.util.*;

public class demo24 {

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
//	  	int c=goodpairs(a);
//	  	System.out.println(c);
	  	int d= findduplicate(a);
	  	System.out.println("Duplicate is "+d);
//	  	boolean d1=isDublicate(a);
//	  	System.out.println(d1);

	}

//	private static int goodpairs(int[] a) 
//	{
//		int count []=new int[20];
//		for(int nums:a)
//		{
//			count[nums]++;
//		}
//		int totalCount=0;
//		for(int i:count)
//		{
//			totalCount+=(((i)*i-1)/2);
//		}
//		return totalCount;
//	}

//	private static boolean isDublicate(int[] a) 
//	{
//		Set<Integer> Item = new HashSet<>();
//		for(int nums:a)
//		{
//			if(Item.contains(nums))
//			{
//				return true;
//			}
//			Item.add(nums);
//		}
//		return false;
	

	private static int findduplicate(int[] a)
	{
		int slow=0;
		int fast=0;
		do
		{
			slow=a[slow];
			fast=a[a[fast]];
		}
		while(slow!=fast);
		
		slow=0;
		while(slow!=fast)
		{
			slow=a[slow];
			fast=a[fast];
		}
		return slow;
	}
	}

