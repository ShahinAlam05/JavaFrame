import java.util.Scanner;
public class First {

	
	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	        String s1;
	        s1 = input.nextLine();

	        System.out.println(s1);

	        int l = s1.length();
	        System.out.println(l);

	        s1 = s1.toUpperCase();
	        System.out.println(s1);

	        s1 = s1.toLowerCase();
	        System.out.println(s1);

	     

	        s1 = s1.trim();
	        System.out.println(s1);

	     

	        s1 = s1.substring(3);
	        System.out.println(s1);

	        s1 = s1.substring(4,6);
	        System.out.println(s1);

	        s1 = s1.replace('w','a');
	        System.out.println(s1);

	        boolean s2 = s1.startsWith("www.");
	        System.out.println(s2);

	        boolean s3 = s1.endsWith(".com");
	        System.out.println(s3);

	        char c = s1.charAt(5);
	        System.out.println(c);

	        int a = s1.indexOf(".");
	        System.out.println(a);

	        int b = s1.lastIndexOf(".");
	        System.out.println(b);

	        String s9;
	        System.out.println("Enter a String : ");
	        s9 = input.nextLine();

	        boolean s10 = s1.equals(s9);
	        System.out.println(s10);

	        boolean s11 = s1.equalsIgnoreCase(s9);
	        System.out.println(s11);

	}

}
