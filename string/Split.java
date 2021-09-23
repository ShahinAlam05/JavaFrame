package string;

public class Split {
	public static void main(String args[])
	 {
		 String s1="My name is Sanjid";
		 String s2= new String("Sanjid");
		 
		 String[] s3=s1.split(" ");
		 
		 for(String x:s3)
		 {
			 System.out.println(x);
		 }
		 
	 }


}
