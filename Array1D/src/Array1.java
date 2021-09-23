import java.util.Scanner;
public class Array1 {

	
	public static void main(String[] args) {
		
			
			Scanner input = new Scanner(System.in);
			
			int[] ara = new int[5];
			
			System.out.println("Enter 5 Number : ");
			for(int i=0; i<5; i++)
			{
				ara[i] = input.nextInt();
			}
			
			for(int i=0; i<5; i++)
			{
				System.out.println(ara[i]+" ");
			}

	}

}
