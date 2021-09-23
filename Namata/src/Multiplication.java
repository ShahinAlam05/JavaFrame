import java.util.Scanner;
public class Multiplication {

	
	public static void main(String[] args) {
	int a,i;
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		
		for(i=1; i<=10; i++)
			System.out.println(a+" * "+i+" = "+a*i);	

	}

}
