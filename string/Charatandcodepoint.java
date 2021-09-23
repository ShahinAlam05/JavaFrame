package string;

public class Charatandcodepoint {
	public static void main(String args[])
	 {
		 String s1="Sanjid";
		 String s2= new String("Sanjid");
		 
		 char ch=s1.charAt(1);
		 int val=s1.codePointAt(1);
		 
		 System.out.println(ch);
		 System.out.println(val);
		 
		 
	 }

}
