import java.util.*;

public class demo26 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=sc.next();
		boolean b=Valid(s);
		System.out.println(s);
		System.out.println(b);

	}

	private static boolean Valid(String s) 
	{
		Stack <Character> st = new Stack<>();
		for(char c:s.toCharArray())
		{
			if(c=='(')
				st.push(')');
			else if(c=='{')
				st.push('}');
			else if(c=='[')
				st.push(']');
			else if(st.isEmpty() || st.pop()!=c)
				return false;
		}
		return st.isEmpty();
	}

}
