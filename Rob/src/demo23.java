import java.util.*;

public class demo23 {

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
	  	System.out.println("Enter the target sum");
	  	int t=sc.nextInt();
	  	int c[]=twosum(a,t);
	  	System.out.println(Arrays.toString(c));

	}

	private static int[] twosum(int[] a, int t)
	{
		Map <Integer,Integer> map= new HashMap<>();
		int i;
		for(i=0;i<a.length;i++)
	  	{
	  		int compliment=t-a[i];
	  		if(map.containsKey(compliment))
	  			return new int [] {map.get(compliment),i};
	  		map.put(a[i],i);
	  	}
		throw new IllegalArgumentException("jdjf");
	}

}
