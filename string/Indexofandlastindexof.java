package string;

public class Indexofandlastindexof {
	public static void main(String args[])
	 {
		 String s1="My name is Sanjid";
		 String s2= new String("Sanjid");
		 
		 char ch=s1.charAt(1);
		 int val=s1.codePointAt(1);
		 
		 int in1=s1.indexOf("i");
		 int in2=s1.lastIndexOf("i");
		 
		 System.out.println(ch);
		 System.out.println(val);
		 System.out.println(in1);
		 System.out.println(in2);
		 
		 
	 }

}
