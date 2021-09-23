package string;

public class Equalignorecase {
	 public static void main(String args[])
	 {
		 String s1="Samsul Anwer Sanjid";
		 String s2= new String("samsul Anwer Sanjid");
		 
		 int i=s1.length();
		 System.out.println(i);
		 
		 if(s1.equalsIgnoreCase(s2))
		 {
			 System.out.println("Yes");
		 }
		 else
		 {
			 System.out.println("No");
		 }
	 }

}
