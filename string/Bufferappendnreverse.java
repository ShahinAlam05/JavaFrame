package string;
import java.util.Scanner;
public class Bufferappendnreverse {
	public static void main(String args[])
	 {
		String s1;
		Scanner sc=new Scanner(System.in);
		
		s1=sc.nextLine();
	    StringBuffer sb=new StringBuffer(s1);
		 
		sb.append(" Anwer");
		System.out.println(sb);
		 
		sb.reverse();
		System.out.println(sb);
	 }
}
