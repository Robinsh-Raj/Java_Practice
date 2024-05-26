import java.util.Scanner;

public class demo27 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=sc.nextLine();
		String sr` = reverse(s);
		System.out.println(sr);
	}

	private static String reverse(String s)
	{
		String[] words=s.split(" ");
		StringBuilder sentence=new StringBuilder();
		for(String word:words)
		{
			StringBuilder wordss=new StringBuilder(word);
			wordss.reverse();
			sentence.append(wordss.toString()).append(" ");
		}
		return sentence.toString().trim();
	}

}
