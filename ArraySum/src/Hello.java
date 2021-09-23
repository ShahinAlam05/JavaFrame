import java.util.Scanner;
public class Hello {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] ara = {10, 20, 30, 40, 50};
		int sum =0;
		
		for(int x : ara)
		{
			sum = sum + x;
		}
		System.out.println(sum);

	}

}