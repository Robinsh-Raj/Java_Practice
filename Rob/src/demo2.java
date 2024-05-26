import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i,sum;
		for(i=1,sum=0;i<=num;i++)
		{
			sum+=num*i;
		}
		System.out.println("Sum is "+sum);

	}

}
