import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		System.out.println("How many numbers u want to enter ");
		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int i,cnt;
//		int a[]=new int[n];
//		System.out.println("Enter the numbers ");
//		for(i =0;i<n;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		for(i=0,cnt=0;i<n;i++)
//		{
//			if(a[i]!=0)
//			a[cnt++]=a[i];
//		}
////		System.out.println("These are the numbers ");
//		for(i =cnt;i<n;i++)
//		{
//			a[i]=0;
//		}
//		System.out.println("These are the numbers ");
//		for(i =0;i<n;i++)
//		{
//			System.out.println(a[i]); 
//		}
//		
//		int num1,num2,num3;
//		System.out.println("Enter Three Numbers");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		System.out.println("Maximum is "+Math.max(num1,Math.max(num2, num3)));
//		System.out.println("Maximum is "+Math.min(num1,Math.min(num2, num3)));
//		System.out.println("Enter The Number u want to factorized");
//		int num=sc.nextInt();
//		int fact=1;
//		for(int i=num;num>0;num--)
//		{
//			fact*=num;
//		}
//		System.out.println("Factorial is "+fact);
		System.out.println("Enter the Number ");
		int num=sc.nextInt();
		int div=1000,d,sum=0;
		while(num>=1)
		{
			
			d=num/div;
			System.out.println("digits are "+num/div);
			sum=sum+d*d*d;
			num=num%div;
			div=div/10;
		}
		if(num==sum)
		{
			System.out.println("This is ArmStrong Number "+num);
		}
		

	}

}
