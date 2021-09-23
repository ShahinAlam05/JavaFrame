import java.util.Scanner;
public class Array2D1 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] ara = new int[3][2];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				ara[i][j] = input.nextInt();
			}
		}
		
		System.out.println("2D Array is : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(ara[i][j]+"   ");
			}
			System.out.println();
		}	

	}

}
