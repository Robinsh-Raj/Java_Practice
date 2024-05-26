import java.util.Scanner;

public class demo21 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String s1="Raj";
		System.out.println(s.toLowerCase());
		System.out.println(s.concat(s1));
		System.out.println(s.startsWith(s1));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,4));
		System.out.println(s.indexOf("India",1));
		System.out.println(s.replace('I','B'));
		System.out.println(s.replace("India","Bharat"));
		System.out.println(s.equals("India"));
		System.out.println(s.equalsIgnoreCase("India"));
		System.out.println(s.compareTo("India"));
		String s2=s;
		s=s1;
		s1=s2;
		System.out.println(s);
		System.out.println(s1);
//		System.out.println(s.length());
		int i,j;
//		String s1="";
//		for(i=s.length()-1;i>=0;i--)
//		{
//			s1+=s.charAt(i);
//		}
//		System.out.println(s1);
		//-----------------------------------------
//		int cnt;
//		for(i=0,cnt=0;i<s.length();i++)
//		{
//			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
//				cnt++;
//		}
//		System.out.println(cnt);
//		---------------------------------------------------
//		boolean flag;
//		for(i=0,j=s.length()-1,flag=false;i<j;i++,j--)
//		{
//			if(s.charAt(i)==s.charAt(j))
//			{
//				System.out.println("Palindrome");
//				flag=true;
//				break;
//			}
//			
//		}
//		if(flag==false)
//		{
//			System.out.println("Not Palindrome");
//		}
		
	}

}
