package string;

public class Stringbuffernappendndelete {
	public static void main(String args[])
	 {
		 StringBuffer sb=new StringBuffer("Samsul");
		 
		 sb.append(" Anwer");
		 sb.append(29);
		 
		 System.out.println(sb);
		 
		 sb.delete(0, 6);
		 
		 System.out.println(sb);
	 }


}
