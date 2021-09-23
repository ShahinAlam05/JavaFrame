package string;
import java.util.Scanner;
public class Stringbufferreversenpalindrome{
	public static void main(String args[])
	 {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		
		s1=sc.nextLine();
	    StringBuffer sb=new StringBuffer(s1);
		
		s2=sb.reverse().toString();
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	 }
}