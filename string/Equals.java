package string;

public class Equals {
	 public static void main(String args[])
	 {
		 String s1="Samsul Anwer Sanjid";
		 String s2= new String("Samsul Anwer");
		 
		 int i=s1.length();
		 System.out.println(i);
		 
		 if(s1.equals(s2))
		 {
			 System.out.println("Yes");
		 }
		 else
		 {
			 System.out.println("No");
		 }
	 }

}
