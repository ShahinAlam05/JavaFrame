import java.util.Scanner;
public class ForEach {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] ara = new int[5];
		
		System.out.println("Enter 5 Number : ");
		for(int i=0; i<5; i++)
		{
			ara[i] = input.nextInt();
		}
		
		for(int x : ara)
		{
			System.out.print(x+" ");
		}
		
		int sum =0;
		
		for(int y : ara)
		{
			sum = sum + y;
		}
		
		System.out.println("\nSum of 5 Number : "+sum);

	}

}
