package string;

public class Contains {
	 public static void main(String args[])
	 {
		 String s1="Samsul Anwer Sanjid";
		 String s2= new String("Samsul Anwer Sanjid");
		 
		 int i=s1.length();
		 System.out.println(i);
		 
		 if(s1.contains("San"))
		 {
			 System.out.println("Yes");
		 }
		 else
		 {
			 System.out.println("No");
		 }
	 }

}
