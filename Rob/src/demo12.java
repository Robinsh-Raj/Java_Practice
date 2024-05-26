import java.util.Scanner;

public class demo12 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	  	System.out.println("Enter a string ");
	  	String s=sc.next();
//	  	int len=s.length();
//	  	char str;
//	  	for(int i=len-1;i>=0;i--)
//	  	{
//	  		System.out.print(s.charAt(i));
//	  	}
	  	StringBuilder sf = new StringBuilder(s);
	  	System.out.println(sf.reverse().toString());
	  	
	}

}
